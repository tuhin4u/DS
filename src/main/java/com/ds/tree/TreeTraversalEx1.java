package com.ds.tree;

import java.util.*;

/**
 * Created by U6042192 on 03-Feb-17.
 */
class Tree {
    Node root;

    static class Node {
        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Tree(Node root) {
        this.root = root;
    }

    public static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(" " + node.data);
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.data);
    }

    public static void postOrderIterative(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty()) {
            Node n = s1.pop();
            s2.push(n);
            if (n.left != null)
                s1.push(n.left);
            if (n.right != null)
                s1.push(n.right);

        }
        while (!s2.isEmpty()) {
            System.out.print(" " + s2.pop().data);
        }
    }

    public static void levelOrder(Node root) {
        Queue queue = new LinkedList<Node>();
        if (root == null)
            return;

        queue.add(root);
        while (!queue.isEmpty()) {
            Node n = (Node) queue.poll();
            System.out.print(" " + n.data);
            if (n.left != null)
                queue.offer(n.left);
            if (n.right != null)
                queue.offer(n.right);
        }
    }

    public static int sizeOfTree(Node node) {
        if (node == null)
            return 0;
        int left_Size = sizeOfTree(node.left);
        int right_size = sizeOfTree(node.right);
        return left_Size + right_size + 1;
    }

    public static int height(Node node) {
        if (node == null)
            return 0;
        int left_height = height(node.left);
        int right_height = height(node.right);
        return ((left_height >= right_height) ? left_height : right_height) + 1;
    }

    public static void morisInorderTraverval(Node root) {
        Node current = root;
        //Node predecessor = null;

        while (current != null) {
            if (current.left == null) {
                System.out.print(" " + current.data);
                current = current.right;
            } else {
                Node predecessor = current.left;

                while (predecessor.right != current && predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    System.out.print(" " + current.data);
                    current = current.right;
                }
            }
        }
    }

    public static void rootToleafPath(Node root, int arr[], int index) {

        if (root == null) {
            /*for(int i=0;i<=index-1;i++){
                System.out.print(" "+arr[i]);
            }
            System.out.println();*/
            return;
        }
        arr[index] = root.data;
        if (root.left == null && root.right == null) {
            for (int i = 0; i <= index; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
        rootToleafPath(root.left, arr, index + 1);
        rootToleafPath(root.right, arr, index + 1);
    }

    public static void rootToleafPath1(Node root, int arr[], int index) {
        if (root.left == null && root.right == null) {
            arr[index] = root.data;
            for (int i = 0; i <= index; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
            return;
        }
        arr[index] = root.data;
        rootToleafPath(root.left, arr, index + 1);
        rootToleafPath(root.right, arr, index + 1);
    }


}

public class TreeTraversalEx1 {
    public static void main(String[] args) {
        /*Tree tree = new Tree(new Tree.Node(1));
        tree.root.left = new Tree.Node(2);
        tree.root.right = new Tree.Node(3);
        tree.root.right.right = new Tree.Node(4);*/

        Tree tree = new Tree(new Tree.Node(10));
        tree.root.left = new Tree.Node(8);
        tree.root.right = new Tree.Node(2);
        tree.root.left.left = new Tree.Node(3);
        tree.root.left.right = new Tree.Node(5);
        tree.root.right.left = new Tree.Node(2);

//        System.out.print("preorder = ");
//        Tree.preOrder(tree.root);
//        System.out.println();

//        System.out.print("inorder = ");
//        Tree.inOrder(tree.root);
//        System.out.println();
//
        /*System.out.print("postorder = ");
        Tree.postOrder(tree.root);
        System.out.println();

        System.out.print("postorder = ");
        Tree.postOrderIterative(tree.root);
        System.out.println();
//
//        System.out.print("levelorder = ");
//        Tree.levelOrder(tree.root);
//        System.out.println();
//
//        System.out.println("size = "+Tree.sizeOfTree(tree.root));
//        System.out.println("height = "+Tree.height(tree.root));


        /*System.out.print("MorisInorderTraversal = ");
        Tree.morisInorderTraverval(tree.root);
//        Tree.inorder(tree.root);
        System.out.println();*/

        int arr[] = new int[10];
        Tree.rootToleafPath1(tree.root, arr, 0);

    }
}

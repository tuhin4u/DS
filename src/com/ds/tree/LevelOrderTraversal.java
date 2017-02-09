package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by U6042192 on 04-Feb-17.
 */
public class LevelOrderTraversal {
    Node root;

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void printInLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n != null) {
                System.out.print(" " + n.data);
                if (n.left != null)
                    queue.offer(n.left);
                if (n.right != null)
                    queue.offer(n.right);
            } else {
                if (!queue.isEmpty()) {
                    System.out.println();
                    queue.offer(null);
                }
            }
            /*if (n == null & !queue.isEmpty()) {
                queue.offer(null);
                System.out.println();
                continue;
            }
            if (n != null) {
                System.out.print(" " + n.data);
                if (n.left != null)
                    queue.offer(n.left);
                if (n.right != null)
                    queue.offer(n.right);
            }*/
        }
    }

    public void printReverseLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node m = queue.poll();
            if (m.right != null)
                queue.offer(m.right);
            if (m.left != null)
                queue.offer(m.left);
            stack.push(m);
        }
        while (!stack.isEmpty())
            System.out.print(" " + stack.pop().data);
    }

    /*public void spiralOrderTraversal(Node root){
        Stack<Node> currentStack=new Stack<>();
        Stack<Node> helperStack=new Stack<>();

        currentStack.push(root);
        while (!currentStack.isEmpty()){
            Node n=currentStack.pop();
            if(n.right!=null)
                helperStack.push(n.right);
            if(n.left!=null)
                helperStack.push(n.left);
            System.out.print(n.data);
            if(!helperStack.isEmpty() && currentStack.isEmpty()){
                while(!helperStack.isEmpty()){
                    currentStack.push(helperStack.pop());
                }
                helperStack.removeAllElements();

            }
        }

    }*/
    public void spiralWithTwoStack(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                root = s1.pop();
                System.out.print(" " + root.data);
                if (root.left != null)
                    s2.push(root.left);
                if (root.right != null)
                    s2.push(root.right);
            }
            while (!s2.isEmpty()) {
                root = s2.pop();
                System.out.print(" " + root.data);
                if (root.right != null)
                    s1.push(root.right);
                if (root.left != null)
                    s1.push(root.left);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        /*System.out.println("LevelOrder");
        tree.printInLevelOrder(tree.root);
        System.out.println("ReverseLevelOrder");
        tree.printReverseLevelOrder(tree.root);*/
        System.out.println("SpiralOrder");
        tree.spiralWithTwoStack(tree.root);
    }
}
//132654

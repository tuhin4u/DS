package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by U6042192 on 03-Feb-17.
 */
class Tree{
    Node root;
    static class Node{
        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    public Tree(Node root) {
        this.root = root;
    }

    public static void preOrder(Node node){
        if(node ==null)
            return;
        System.out.print(" "+node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    public static  void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(" " + node.data);
        inOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.data);
    }
    public static void levelOrder(Node root){
        Queue queue=new LinkedList<Node>();
        if(root==null)
            return;

        queue.add(root);
        while(!queue.isEmpty()){
            Node n=(Node)queue.poll();
            System.out.print(" "+n.data);
            if(n.left!=null)
                queue.offer(n.left);
            if (n.right!=null)
                queue.offer(n.right);
        }
    }
    public static int sizeOfTree(Node node){
        if(node==null)
            return 0;
        int left_Size=sizeOfTree(node.left);
        int right_size=sizeOfTree(node.right);
        return  left_Size+right_size+1;
    }
    public static int height(Node node){
        if(node==null)
            return 0;
        int left_height=height(node.left);
        int right_height=height(node.right);
        return ((left_height>=right_height)?left_height:right_height)+1;
    }
}
public class TreeTraversalEx1 {
    public static void main(String[] args) {
        Tree tree=new Tree(new Tree.Node(1));
        tree.root.left=new Tree.Node(2);
        tree.root.right=new Tree.Node(3);
        tree.root.right.right=new Tree.Node(4);

        System.out.print("preorder = ");
        Tree.preOrder(tree.root);
        System.out.println();

        System.out.print("inorder = ");
        Tree.inOrder(tree.root);
        System.out.println();

        System.out.print("postorder = ");
        Tree.postOrder(tree.root);
        System.out.println();

        System.out.print("levelorder = ");
        Tree.levelOrder(tree.root);
        System.out.println();

        System.out.println("size = "+Tree.sizeOfTree(tree.root));
        System.out.println("height = "+Tree.height(tree.root));
    }
}

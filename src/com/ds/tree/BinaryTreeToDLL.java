package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by U6042192 on 13-Apr-17.
 */
public class BinaryTreeToDLL {
    static Node root;
    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public void inorder(Node root){
        if(root==null)
            return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public Node covertTreeToDLL(Node root){
        Node head=null;
        Node tail=null;
        Node currrent=null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            currrent=queue.peek();
            queue.poll();

            if(currrent.left!=null ){
                queue.add(currrent.left);
            } if(currrent.right!=null ){
                queue.add(currrent.right);
            }
            currrent.left=null;
            currrent.right=null;
            if(head==null){
                head=currrent;
                tail=currrent;
            }else{
                tail.right=currrent;
                currrent.left=currrent;
                tail=tail.right;
            }

        }


        return  head;
    }

    public static void main(String[] args) {
        BinaryTreeToDLL tree=new BinaryTreeToDLL();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);

        tree.inorder(root);
        System.out.println("----");

        Node head=tree.covertTreeToDLL(root);

        while(head.right!=null){
            System.out.print(head.data);
            head=head.right;

        }


    }
}

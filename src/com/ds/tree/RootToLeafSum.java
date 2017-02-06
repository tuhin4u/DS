package com.ds.tree;

import java.util.LinkedList;

/**
 * Created by U6042192 on 04-Feb-17.
 */
public class RootToLeafSum {
    Node root;
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
    public static boolean rootToLeafSum(Node node,int sum,LinkedList<Node> list){
        if(node==null)
            return false;
        //check if the node is a leaf node
        if(node.left==null && node.right==null){
            if(node.data==sum){
                list.add(node);
                return true;
            }else{
                return false;
            }
        }
        if(rootToLeafSum(node.left,sum-node.data,list)){
            list.add(node);
            return true;
        }
        if(rootToLeafSum(node.right,sum-node.data,list)){
            list.add(node);
            return true;
        }
        return false;

        /*if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            if(root.data == sum){
                list.add(root);
                return true;
            }else{
                return false;
            }
        }
        if(rootToLeafSum(root.left, sum - root.data, list) || rootToLeafSum(root.right, sum - root.data, list)){
            list.add(root);
            return true;
        }
        return false;*/
    }
    public static void main(String[] args) {
        RootToLeafSum tree=new RootToLeafSum();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(9);

        LinkedList<Node> list=new LinkedList<>();
        boolean flag=RootToLeafSum.rootToLeafSum(tree.root,21,list);
        if(flag==true){
            for (Node i:list){
                System.out.print(" "+i.data);
            }
        }

    }

}

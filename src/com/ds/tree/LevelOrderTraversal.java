package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

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

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        tree.printInLevelOrder(tree.root);
    }
}

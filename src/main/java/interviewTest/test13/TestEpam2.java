package interviewTest.test13;

import java.util.LinkedList;
import java.util.Queue;

public class TestEpam2 {
//          15 = 15
//        / \
//        8   6 = 7
//       / \ / \
//       2 4 8 10 = 6

    private static void average(Node root){
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);

        while (queue.size()>0){
            int size=queue.size();
            int sum=0;
            for (int i = 0; i < size; i++) {
                Node rem=queue.remove();
                sum+=rem.value;
                if(rem.left!=null){
                    queue.add(rem.left);
                }
                if(rem.right!=null){
                    queue.add(rem.right);
                }
            }
            int avg=sum/size;
            System.out.println("avg: "+avg);
        }

    }

    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private static Node sample(){
//leaf nodes
        Node n4 = new Node(2, null, null);
        Node n5 = new Node(4, null, null);
        Node n6 = new Node(8, null, null);
        Node n7 = new Node(10, null, null);
//intermediate nodes
        Node n2 = new Node(8, n4, n5);
        Node n3 = new Node(6, n6, n7);
//root node
        Node n1 = new Node(15, n2, n3);
        return n1;
    }
    public static void main(String[] args) {
        Node root=sample();
        average(root);
    }
}

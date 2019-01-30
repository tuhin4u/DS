package com.ds.ll;

/**
 * Created by U6042192 on 17-Aug-17.
 */
public class LinkedListReverse {
    static Node head;
    static Node tail;
    static  class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void add(int i){
        Node n=new Node(i);
        if (head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=tail.next;
        }
    }
    public static Node recReverse(Node node){
        if(node.next==null){
            tail=node;
            return node;
        }

        Node n=recReverse(node.next);
        n.next=node;
        return node;


    }
    public void recReverse(){
        Node n=recReverse(head);
        n.next=null;
    }
    //1 2 3
    public static void recReverse(Node node,Node prev){
        if(node.next==null){
            //actually it should be the head pointer, just working with tail not to disturb the head
            tail=node;
            node.next=prev;
            return;
        }
        recReverse(node.next,node);
        node.next=prev;
    }
    public  void printList(Node node){
        while (node!=null){
            System.out.print(node.data + " ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        list.printList(head);

        //list.recReverse();
        recReverse(head,null);
        System.out.println("-----");
        list.printList(tail);
    }
}

package com.ds.ll;

/**
 * Created by U6042192 on 08-Dec-16.
 * mergesort with linkedlist
 */
public class LinkedListEx4 {
    static Node head;
    Node tail;
    static  class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public void add(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=tail.next;
        }
    }
    public void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    //public
    public static void main(String[] args) {
        LinkedListEx4 list = new LinkedListEx4();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        list.printList(head);
    }
}

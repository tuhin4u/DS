//finding the size of linkedlist
package com.ds.ll;

public class LinkedListEx1 {
    Node head;
    Node tail=head;
    static int size=0;
    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public void add(int data){
        Node n=new Node(data);
        size++;
        if(head==null){
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        tail=tail.next;
    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        LinkedListEx1 list=new LinkedListEx1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.printList();
        System.out.println("size"+list.size);
    }
}

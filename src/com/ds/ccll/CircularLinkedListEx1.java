package com.ds.ccll;

public class CircularLinkedListEx1 {
    Node tail;
    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    //insert at last
    public void add(int data){
        Node n=new Node(data);

        if(tail==null){
            tail=n;
            tail.next=tail;
        }
        else{
            Node prev=tail;
            tail=n;
            tail.next=prev.next;
            prev.next=tail;
        }
    }
    public void printList(){
        Node n=tail;
        n=n.next;
        do {
            System.out.print(n.data+" ");
            n=n.next;

        }
        while(n!=tail);
        System.out.print(n.data+" ");
        System.out.println();
    }
    //insert at head
    public void addToHead(int data){
        Node n=new Node(data);
        if(tail==null){
            tail=n;
            tail.next=tail;
        }
        else{
            n.next=tail.next;
            tail.next=n;
        }
    }
    public int deleteFirst(){
        Node n=tail.next;
        tail.next=n.next;
        n.next=null;
        return n.data;
    }
    public int deleteLast(){
        Node n=tail;
        while(n.next!=tail){
            n=n.next;
        }
        n.next=tail.next;
        tail.next=null;
        int data=tail.data;
        tail=n;
        return data;

    }
    public boolean contains(int data){
        if(tail==null)
            return false;

        Node head=tail.next;
        while(head!=tail && head.data!=data)
            head=head.next;
        return  head.data==data;
    }
    public int remove(int data){
        if(tail==null)
            return Integer.MIN_VALUE;
        Node head=tail.next;
        Node prev=tail;
        while(head!=tail && head.data!=data){
            prev=head;
            head=head.next;
        }
        if(head.data==data){
            if(tail==tail.next){
                tail=null;
            }
            else{
                if(head==tail)
                    tail=prev;
                prev.next=prev.next.next;
            }
            head.next=null;
            return head.data;
        }
        else return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        CircularLinkedListEx1 list=new CircularLinkedListEx1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.printList();

        list.addToHead(12);
        list.printList();
        list.add(1200);
        list.printList();

        //System.out.println("deleted = "+list.deleteLast());
        //System.out.println("deleted = "+list.deleteFirst());

        list.printList();
        System.out.println(list.contains(12));
        System.out.println(list.remove(1200));
        list.printList();

    }
}

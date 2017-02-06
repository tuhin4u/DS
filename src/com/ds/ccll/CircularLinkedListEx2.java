package com.ds.ccll;

public class CircularLinkedListEx2 {
    Node tail;
    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public void addSorted(int data){
        Node n=new Node(data);
        //if first node
        if(tail==null){
            tail=n;
            tail.next=tail;
            return;
        }
        /*n.next=tail.next;
        tail.next=n;
        tail=tail.next;*/
        //if it is smaller than head
        Node head=tail.next;
        if(data<head.data)
            addToHead(n);
        else if(data>tail.data)
            addToTail(n);
        else {
            Node prev=null;
            while(head!=tail){
                if(data>=head.data){
                    prev=head;
                    head=head.next;
                    continue;
                }
                n.next=prev.next;
                prev.next=n;
                break;
            }
        }

    }
    public void addToHead(Node n){
        if(tail==null){
            tail=n;
            tail.next=null;
        }
        n.next=tail.next;
        tail.next=n;
    }
    public void addToTail(Node n){
        addToHead(n);
        tail=tail.next;
    }
    public void printList(){
        Node head=tail.next;
        do{
            System.out.print(head.data+" ");
            head=head.next;
        }while(head!=tail.next);

    }

    public static void main(String[] args) {
        CircularLinkedListEx2 list=new CircularLinkedListEx2();
        list.addSorted(12);
        list.addSorted(20);
        list.addSorted(3);
        list.addSorted(45);
        list.addSorted(15);
        list.addSorted(60);
        list.addSorted(16);

        list.printList();
    }

}

package com.ds.ll;

/**
 * detecting the cycles in the linked list
 * Floyed Algorithm
 * Tortoise and Hare Algorithm
 */
public class LinkedListEx2 {
    static Node head;
    static  class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public boolean detect(Node head){
        Node hare=head;
        Node tortoise=head;

        while (hare.next!=null){
            tortoise=tortoise.next;
            if(hare.next!=null){
                hare=hare.next.next;
            }
            if(hare==tortoise){
                removeCycle(hare,head);
                return true;
            }
        }
        return false;
    }
    public void removeCycle(Node hare,Node head){
        Node tortoise=head;
        Node prev=null;

        while(tortoise!=hare){
            tortoise=tortoise.next;
            prev=hare;
            hare=hare.next;
        }
        prev.next=null;

    }
    public void printNode(Node n){
        int i=0;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
            if(i>20)
                break;
            i++;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedListEx2 list = new LinkedListEx2();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        System.out.println(list.detect(head));
        list.printNode(head);
        /*list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);*/
    }
}

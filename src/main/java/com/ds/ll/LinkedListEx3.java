package com.ds.ll;

/**
 * Created by U6042192 on 08-Dec-16.
 * finding the mid of a linked list
 */
public class LinkedListEx3 {
    static Node head;
    Node tail;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = tail.next;
    }

    public void findMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        Node prev=null;
        /*while (fast.next != null) {
            fast = fast.next;
            if (fast!=null && fast.next!=null) {
                fast=fast.next;
                slow=slow.next;
            }
        }*/
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //System.out.println("middle = " + slow.data);
        if (fast.next != null) {
            System.out.println("middle = " + slow.data + " " + slow.next.data);
        } else {
            System.out.println("middle = " + slow.data);
        }

    }

    public void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListEx3 list = new LinkedListEx3();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        list.printList(head);

        list.findMiddle(head);
    }
}

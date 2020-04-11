package com.ds.ll;

/**
 * Created by u6042192 on 12-Jan-17.
 */
public class LinkedListMergeSort {
    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            Node next=null;
        }
    }
    public void add(int data){
        Node n=new Node(data);
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
        printList(n);
    }
    public void printList(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(" "+n.data);
            n=n.next;
        }
        System.out.println();
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null)
            return head;
        //finding the middle node
        Node start=head;
        Node mid=head;
        while(mid.next!=null && head.next!=null && head.next.next!=null){
            mid=mid.next;
            head=head.next.next;
        }
        System.out.println("middle = "+mid.data);
        //finding the nexofmiddle
        Node nextToMid=mid.next;
        mid.next=null;

        Node left=mergeSort(start);
        Node right=mergeSort(nextToMid);

        return mergeTwoListRecursive(left,right);
    }
    public Node mergeTwoListRecursive(Node leftStart, Node rightStart){
        if(leftStart==null)
            return rightStart;
        if(rightStart==null)
            return leftStart;

        Node start;
        if(leftStart.data<=rightStart.data){
            start=leftStart;
            start.next=mergeTwoListRecursive(leftStart.next,rightStart);
        }else{
            start=rightStart;
            start.next=mergeTwoListRecursive(leftStart,rightStart.next);
        }

        return start;
    }
    public static void main(String[] args) {
        LinkedListMergeSort l=new LinkedListMergeSort();
        int arr[]={38, 27, 43, 3,2, 9, 82, 10,10};
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }
        l.printList();
        Node start=l.mergeSort(l.head);
        l.printList(start);
    }
}

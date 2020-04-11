package com.ds.stack;

/**
 * Created by u6042192 on 12-Jan-17.
 */
class LinkedList{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public void add(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void printList(){
        Node n=head;
        while(n !=null){
            System.out.print(" " + n.data);
            n=n.next;
        }
        System.out.println();
    }
    //as we are poping as stack
    public Node deleteFromHead(){
        Node prev=head;
        if(prev==null)
            throw new IndexOutOfBoundsException("List is empty");
        head=head.next;
        //dereferencing
        prev.next=null;
        return prev;
    }
}
class Stack{
    LinkedList list=new LinkedList();

    public void push(int data){
        list.add(data);
    }
    public int pop(){
        LinkedList.Node n=null;
        try{
            n=list.deleteFromHead();
            System.out.println("pop = "+n.data);

        }catch(IndexOutOfBoundsException ie){
            System.out.println("stack underflow");
        }
        return n.data;
    }
    public void printStack(){
        list.printList();
    }
}
public class StackLinkedListEx2 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        for(int i=1;i<=3;i++)
            stack.push(i);

        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
//        stack.pop();
//        stack.printStack();

    }
}

package com.ds.stack;

/**
 * stack mid operations in O(1) time
 */
class DoublyLinkedList{
    Node head;
    Node middle;
    int size;
    static class Node{
        Node prev;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.prev=null;
            this.next=null;
        }
    }
    public void addToFront(int data){
        size++;
        Node n=new Node(data);
        if(head==null){
            head=n;
            middle=head;
            return;
        }
        n.next=head;
        head.prev=n;
        head=head.prev;
        if(size%2==1)
            middle=middle.prev;

    }
    public Node deleteFromHead(){
        //if it has only one element
            size--;
        if(head.next==null){
            middle.next=null;
            middle.prev=null;
            head.next=null;
            head.prev=null;
            return head;
        }
        Node n=head;
        head=head.next;
        head.prev=null;
        //dereferencing
        n.next=null;

        if(size%2==0)
            middle=middle.next;
        return  n;
    }
    public Node getMiddle(){
        return middle;
    }
    public Node deleteMiddle(){
        if(head.next==null){
            size--;
            middle.next=null;
            middle.prev=null;
            head.next=null;
            head.prev=null;
            return head;
        }
        //shifting the middle before deleting
        Node n=middle;
        if(size%2==1){
            middle=middle.next;
        }
        //if size =2 then then middle will be the last element
        //remove last element
        if(n.next==null){
            middle=n.prev;
            middle.next=null;
            n.next=null;
            n.prev=null;
            return n;
        }
        //if n is in the middle
        Node before=n.prev;
        Node after=n.next;
        before.next=after;
        after.prev=before;
        //dereferencing
        n.next=null;
        n.prev=null;
        return n;

    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(" " + n.data);
        }
        System.out.println();
    }
}
class StackDll{
    DoublyLinkedList list=new DoublyLinkedList();
    public void push(int data){
        list.addToFront(data);
    }
    public int pop(){
        DoublyLinkedList.Node node=list.deleteFromHead();
        return node.data;
    }
    public int getMiddle(){
        return list.getMiddle().data;
    }
    public int deleteMiddle(){
        return list.deleteMiddle().data;
    }
}
public class StackMidOperation {
    public static void main(String[] args) {
        /*DoublyLinkedList list=new DoublyLinkedList();
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        System.out.println(list.getMiddle().data);
        list.deleteMiddle();
        System.out.println(list.getMiddle().data);
        list.deleteMiddle();
        System.out.println(list.getMiddle().data);*/

        StackDll stack=new StackDll();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getMiddle());
            stack.pop();
           // stack.pop();
            System.out.println(stack.getMiddle());

    }
}

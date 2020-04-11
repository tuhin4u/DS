package com.ds.dll;

/**
 * Basic DoublyLinkedList Operation
 */
public class DoublyLinkedListEx1 {
    Node head;
    Node tail=head;
    int size=0;
    static class Node{
        Node next;
        int data;
        Node prev;
        Node(int data){
            this.next=null;
            this.prev=null;
            this.data=data;
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
        n.prev=tail;
        tail=tail.next;


    }
    public void printListForward(){
        Node n=head;
        for(;n!=null;n=n.next){
            System.out.print(n.data+" ");
           // n=n.next;
        }
        System.out.println();
    }
    public void printListForward(Node n){
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();

    }
    // need to pass current node as position
   /* public void printListBackward(){
        Node n=head;
        for(int i=0;i<10;i++){
            System.out.print(n.data+" ");
            n=n.prev;
        }
        System.out.println();
    }*/
    public void tonFroPrint(){
        Node n=head;
        for(int i=1;i<=11;i++){
            if(i<6){
                System.out.print(" "+n.data);
                n=n.next;
            }
            else{
                System.out.print(" "+n.data);
                n=n.prev;
            }
        }
    }
    public void deleteFirst(){
        Node n=head;
        head=head.next;
        head.prev=null;
        n.next=null;
    }
    public void  deleteLast(){
        Node n=tail;
        tail=tail.prev;
        tail.next=null;
        n.prev=null;
    }
    public void deleteAtPos(int index){
        if(index>size-1) throw new IllegalArgumentException("index is out of bound");

        if(index==0){
            deleteFirst();
        }else if(index==size-1){
            deleteLast();
        }
        else{
            Node n=head;
            //finding the node to be deleted
            for(int i=0;i<index;i++){
                n=n.next;
            }
                //removal of intermediatory node
                remove(n);
        }

    }
    private void remove(Node n){
        Node before;
        Node after;
        //storing the references before deletion
        before=n.prev;
        after=n.next;
        //delete current node
        before.next=after;
        after.prev=before;
        //dereferencing
        n.next=null;
        n.prev=null;
    }
    public Node reverse(){
        Node before =null;
        Node current=head;
        Node after=null;

        while(current!=null){
            after=current.next;
            current.next=before;
            current.prev=after;
            before=current;
            current=after;
        }
        return before;
    }

    public static void main(String[] args) {
        DoublyLinkedListEx1 list=new DoublyLinkedListEx1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

       /* list.printListForward();
        list.deleteFirst();
        list.printListForward();
        list.deleteLast();
        list.printListForward();*/

        /*list.printListForward();
        list.deleteAtPos(2);
        list.printListForward();*/

        list.printListForward();
        list.printListForward(list.reverse());



    }
}

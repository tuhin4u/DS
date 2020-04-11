package com.ds.stack;

/**
 * Created by u6042192 on 12-Jan-17.
 */
public class StackArrayEx1 {
    int capacity=3;
    int top=-1;
    int arr[]=new int[capacity];

    public void push(int data){
        if(top<capacity-1){
            top++;
            arr[top]=data;
        }
        else{
            System.out.println("stack overflow");
        }
    }
    public void pop(){
        if(top>=0){
            System.out.println("pop = "+arr[top]);
            top--;
        }else{
            System.out.println("stack underflow");
        }
    }
    public void printStack(){
        if(top>=0){
            for(int i=0;i<=top;i++){
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
        else{
            System.out.println("stack underflow");
        }
    }

    public static void main(String[] args) {
        StackArrayEx1 stack=new StackArrayEx1();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        stack.pop();

        stack.printStack();
    }
}

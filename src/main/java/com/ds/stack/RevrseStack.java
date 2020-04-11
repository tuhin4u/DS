package com.ds.stack;

import java.util.Stack;

/**
 * Created by u6042192 on 18-Jan-17.
 */
public class RevrseStack {
    public Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> helperStack=new Stack<Integer>();
        if(stack==null || stack.empty())
            return stack;
        while(!stack.empty()){
            int temp=stack.pop();
            while(!helperStack.empty() && temp>helperStack.peek()){
                stack.push(helperStack.pop());
            }
            helperStack.push(temp);
        }

        return helperStack;
    }
    public Stack<Integer> recRevStack(Stack<Integer> stack){
        if(stack==null || stack.empty())
            return stack;
        int temp=stack.pop();
        recRevStack(stack);
        //insertatlaststack.push(temp);
        insertAtLast(stack, temp);
        return stack;
    }
    public void insertAtLast(Stack<Integer> stack,int n){
        if(stack==null || stack.empty()){

            stack.push(n);
            return;
        }
        int temp=stack.pop();
        insertAtLast(stack,n);
        stack.push(temp);
    }
    public static void printStack(Stack stack){
        while(!stack.empty()){
            System.out.print(" " + stack.pop());
        }
        System.out.println();
    }
    public Stack<Integer> recSortStack(Stack<Integer> stack){
        if(stack==null || stack.empty()){
            return stack;
        }
        int temp=stack.pop();
        recSortStack(stack);
        insertAtSortedPos(stack, temp);
        return stack;
    }
    public void insertAtSortedPos(Stack<Integer> stack,int n){
        if(stack.empty() || stack.peek()<n){
            stack.push(n);
            return;
        }
        int temp=stack.pop();
        insertAtSortedPos(stack,n);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);

       // printStack(stack);
        /*Stack s=new RevrseStack().sortStack(stack);
        printStack(s);*/


        /*Stack s1=new RevrseStack().recRevStack(stack);
        printStack(s1);*/
        Stack s1=new RevrseStack().recSortStack(stack);
        printStack(s1);

    }
}

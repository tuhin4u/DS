package com.ds.stack;

import java.util.Stack;

/**
 * Finding the next greater element
 1) Push the first element to stack.
 2) Pick rest of the elements one by one and follow following steps in loop.
 ….a) Mark the current element as next.
 ….b) If stack is not empty, then pop an element from stack and compare it with next.
 ….c) If next is greater than the popped element, then next is the next greater element for the popped element.
 ….d) Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements
 ….g) If next is smaller than the popped element, then push the popped element back.
 3) After the loop in step 2 is over, pop all the elements from stack and print -1 as next element for them.
 */
public class NGE {
    public static void printNextGreaterElement(int arr[]){
        Stack<Integer> stack=new Stack<>();

        if(stack.empty())
            stack.push(arr[0]);
        for (int i=1;i<arr.length;i++){
            int next=arr[i];
            while(!stack.empty() && next>stack.peek()){
                int n=stack.pop();
                System.out.println("NGE "+n+" = "+next);
            }
            stack.push(next);
        }
        while(!stack.empty())
            System.out.println("NGE "+stack.pop()+" = -1");
    }

    public static void main(String[] args) {
        //int arr[]={4,5,2,25};
        //int arr[]={13,7,6,12};
        int arr[]= {11,11, 13, 21, 3};
        printNextGreaterElement(arr);
    }
}

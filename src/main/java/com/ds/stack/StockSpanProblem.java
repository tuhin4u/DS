package com.ds.stack;

import java.util.Stack;
/**
 * Created by u6042192 on 21-Jan-17.
 * https://www.youtube.com/watch?v=KukalT0U3Eg
 */
public class StockSpanProblem {
    public static int[] getSpan(int arr[]){
        Stack<Integer> stack=new Stack<>();
        int span[]=new int[arr.length];
        stack.push(0);
        span[0]=1;
        for (int i=1;i<arr.length;i++){
            while (!stack.empty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            span[i]=i-stack.peek();
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int arr[]={10,5,2,3,1,4,7};
        int span[]=getSpan(arr);
        for (int i = 0; i <span.length; i++) {
            System.out.print(" "+span[i]);
        }
    }
}

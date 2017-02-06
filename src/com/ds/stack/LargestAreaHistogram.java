package com.ds.stack;

import java.util.Stack;
/**
 * Created by u6042192 on 25-Jan-17.
 */
public class LargestAreaHistogram {
    Stack<Integer> stack=new Stack <>();
    int area=0;
    int maxArea=-1;
    int i;
    public int getMaxArea(int arr[]){
        for(i=0;i<arr.length;i++){
            if(stack.empty() || arr[stack.peek()]<=arr[i]){
                stack.push(i);
            }else{
                int top=stack.pop();
                if(stack.empty()){
                    area=arr[top]*i;
                }else{
                    area=arr[top]*(i-stack.peek()-1);
                }
                if(area>maxArea)
                    maxArea=area;

            }
        }
            //if the stack has
            while (!stack.empty()){
                int top=stack.pop();
                if(stack.empty()){
                    area=arr[top]*i;
                }else{
                    area=arr[top]*(i-stack.peek()-1);
                }
                if(area>maxArea)
                    maxArea=area;
            }
        return  maxArea;
    }

    public static void main(String[] args) {
        int arr[]={2,1,2,3,1};
        LargestAreaHistogram lah=new LargestAreaHistogram();
        System.out.println("maxArea = "+lah.getMaxArea(arr));

    }
}

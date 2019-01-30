/*
package com.ds.array;

*/
/**
 * Created by U6042192 on 10-Oct-17.
 * question http://practice.geeksforgeeks.org/problems/rotate-and-delete/0
 *//*

public class ArrayRotation1 {
    public int start_index=0;
    public int end_index=0;
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        start_index=0;
        end_index=arr.length-1;
        */
/*for(int i=0;i>=end_index;i++){
            printArray(arr);
            rightRotate(arr,start_index,end_index);
            printArray(arr);

        }*//*

        int index=0;
        while(start_index<=end_index){
            printArray(arr,start_index,end_index);
            rightRotate(arr,start_index,end_index);
            deleteAt(arr,end_index-index,start_index,end_index);
            index++;
            printArray(arr,start_index,end_index);
        }
    }
    public static void deleteAt(int arr[],int index,int start_index,int end_index){
        if(index>=start_index && index<=end_index){
            if(index==end_index){
                //deleting the last element
                end_index=end_index-1;
            }else{
                //deleting in between
                for (int i=index;i<end_index;i++){
                    arr[i]=arr[i+1];
                    end_index=end_index-1;
                }
            }
        }
        else{
            start_index=start_index+1;
        }
    }
    public static void rightRotate(int arr[],int start_index,int end_index){
        int last_index=end_index;
        int first_index=start_index;
        int last_element=arr[last_index];
        for(int i=last_index-1;i>=first_index;i--){
            arr[i+1]=arr[i];
        }
        arr[first_index]=last_element;

    }
    public static void  printArray(int arr[],int start_index, int end_index){
        for(int i=start_index;i<=end_index;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
*/

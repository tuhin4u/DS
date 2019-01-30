package com.ds.array;

/**
 * Created by U6042192 on 09-Nov-17.
 */
public class ArrayExSumArray {
    public void findSumPair(int arr[],int sum){
        int minIndex=0;
        int maxIndex=arr.length-1;
        while (minIndex<maxIndex){
            if(arr[minIndex]+arr[maxIndex]==sum){
                System.out.println(arr[minIndex]+","+arr[maxIndex]);
            }
            if(arr[minIndex]+arr[maxIndex]>sum){
                minIndex=maxIndex+1;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
    }
}

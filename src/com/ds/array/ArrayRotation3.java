package com.ds.array;

/**
 * Pivotal binary search
 * http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class ArrayRotation3 {
    public static void main(String[] args) {
        int arr[]={30, 40, 50, 10, 20};
        int r=findPivot(arr,0,arr.length-1);
        System.out.println(arr[r]);
    }
    public static int findPivot(int arr[],int start,int end){
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;

            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}

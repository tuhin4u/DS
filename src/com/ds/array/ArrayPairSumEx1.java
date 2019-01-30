package com.ds.array;

/**
 * Created by U6042192 on 28-Nov-17.
 */
public class ArrayPairSumEx1 {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,9,10,120};
        findPairSum(arr,11);

    }
    public static void findPairSum(int arr[],int sum){
        int l=0;
        int r=arr.length-1;

        while(l<r){
            if(arr[l]+arr[r]==sum){
                System.out.println(arr[l]+","+arr[r]);
                l++;
                r=arr.length-1;
            }
            if(arr[l]+arr[r]>sum){
                r--;
            }else {
                l++;
            }

        }
    }
}

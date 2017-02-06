package com.algo.sorting;

/**
 * Created by u6042192 on 10-Jan-17.
 */
public class MergeSortEx1 {
    public static void main(String[] args) {

        int arr[]={38, 27, 43, 3, 9, 82, 10,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr, 0, arr.length-1);
        //merge(arr, 0, 2, 5);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int m=(l+r)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int arr[],int l,int m,int r){
        int size1=m-l+1;
        int size2=r-m;

        int arr_left[]=new int[size1];
        int arr_right[]=new int [size2];

        for(int i=0;i<size1;i++){
            arr_left[i]=arr[l+i];
        }
        for(int i=0;i<size2;i++){
            arr_right[i]=arr[m+1+i];
        }
        int i=0,j=0;
        int k=l;
        while(i<size1 && j<size2){
            if(arr_left[i]<=arr_right[j]){
                arr[k]=arr_left[i];
                i++;
            }
            else {
                arr[k]=arr_right[j];
                j++;
            }
            k++;
        }
        while(i<size1){
            arr[k]=arr_left[i];
            i++;
            k++;
        }
        while(j<size2){
            arr[k]=arr_right[j];
            j++;
            k++;
        }
    }
}

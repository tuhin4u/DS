package com.ds.sort;

/**
 * Created by u6042192 on 21-Jun-18.
 */
public class HeapSort {


    public static int[] max_heapify(int arr[],int heap_size,int i){
        int l=2*i+1;
        int r=2*i+2;
        int largest=0;
        if(l<heap_size && arr[l]>arr[i])
            largest=l;
        else largest=i;
        if(r<heap_size && arr[r]>arr[largest]){
            largest=r;
        }
        if(i!=largest){
            //swap arr[i], arr[largest]
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            max_heapify(arr,heap_size,largest);
        }
        return arr;
    }
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            max_heapify(arr,n,i);
        }

        for (int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            max_heapify(arr,i,0);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,5,9,3};
        sort(arr);
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}

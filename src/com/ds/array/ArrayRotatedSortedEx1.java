package com.ds.array;

/**http://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/
 * Created by U6042192 on 09-Nov-17.
 */
public class ArrayRotatedSortedEx1 {
    public int pivot=3;
    public void findSumPair(int arr[],int sum){
        int maxIndex=pivot;
        int minIndex=pivot+1;
        int size=arr.length;
        int start1=0;
        int start2=minIndex;
        while (start1!=maxIndex && start2!=size-1){
            if(arr[start1]+arr[start2]==sum){
                System.out.println(arr[start1]+" + "+arr[start2]+" = "+sum);
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2};
        int r=findPivot(arr);
        int end =r;
        int l=r+1;
        int sum=11;
        int n=arr.length;

        while (l!=r){
            if(arr[l]+arr[r]==sum){
                System.out.println(arr[l]+","+arr[r]);
                //break;
                l=(l+1)%n;
                r=end;
            }
            if(arr[l]+arr[r]>sum){
                r=(r+n-1)%n;
            }else {
                l=(l+1)%n;
            }
        }

    }
    public static int findPivot(int arr[]){
        int l=0;
        int r=arr.length-1;
        int mid=0;

        while (l<=r){
            mid=(l+r)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[l]<=arr[mid]){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return -1;
    }
}

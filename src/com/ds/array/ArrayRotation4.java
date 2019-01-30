package com.ds.array;

/**
 * juggling algorithm
 */
public class ArrayRotation4 {
    public static void main(String[] args) {
        int arr[]={1, 2, 3};
        int d=2;
        System.out.println(gcd(arr.length,d));
        rotateArray(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotateArray(int arr[],int d){
        int n=arr.length;

        /*for (int i=0;i<gcd(n,d);i++){
            int temp=arr[i];
            int k=i;
            while (true){
                arr[k]=arr[k+d];
                k=k+d;
                if(k+d>n-1){
                    break;                }
            }
            arr[k]=temp;
        }*/
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++)
        {
    /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while(true)
            {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

    }
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
}

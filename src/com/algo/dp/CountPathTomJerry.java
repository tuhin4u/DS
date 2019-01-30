package com.algo.dp;

/**
 * Created by U6042192 on 07-Mar-18.
 */
public class CountPathTomJerry {
    public static int arr[][]={{0,0,1},{0,0,1},{0,0,0}};
    public static void main(String[] args) {
        System.out.println(countPath(3,3,3,arr));
    }
    public static int countPath(int m,int n,int size,int arr[][]){
        for (int i = 0; i <m ; i++) {
            if(arr[i][0]==1)
                arr[i][0]=0;
            else
                arr[i][0]=1;
        }
        for (int j = 0; j <n ; j++) {
            if(arr[0][j]==1)
                arr[0][j]=0;
            else
                arr[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (arr[i][j]==1)
                    arr[i][j]=0;
                else
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }



        return arr[2][2];
    }
}

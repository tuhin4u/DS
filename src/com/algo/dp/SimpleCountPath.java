package com.algo.dp;

/**
 * Created by U6042192 on 07-Mar-18.
 */
public class SimpleCountPath {
    public static void main(String[] args) {
        int count=recCountPath(3,3);
        System.out.println(count);
    }
    public static int recCountPath(int n, int m){
        if(n==1 || m==1){
            return 1;
        }/*if(n==2 && m==2){
            return 0;
        }*/

        return recCountPath(n-1,m)+recCountPath(n,m-1);
    }
}

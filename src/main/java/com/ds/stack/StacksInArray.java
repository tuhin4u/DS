package com.ds.stack;

/**
 * Created by u6042192 on 21-Jan-17.
 * implementing 2 stack in 1 array
 */
public class StacksInArray {
    private static int arr[]=new int[10];
    private static int topx=-1;
    private static int topy=arr.length;
    public static void pushX(int x){
        if(topx+1==topy)
            throw new RuntimeException("stack X is out of bound");
        topx++;
        arr[topx]=x;
    }
    public static void pushY(int y){
        if(topy-1==topx)
            throw new RuntimeException("stack Y is out of bound");
        topy--;
        arr[topy]=y;
    }
    public static int popX(){
        if(topx==-1)
            throw new RuntimeException("stack X is underflow");
        int x=arr[topx];
        topx--;
        return x;

    }

    public static int popY() {
        if(topy==arr.length)
            throw new RuntimeException("stack X is underflow");
        int y=arr[topy];
        topy++;
        return y;
    }
    public static void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            pushX(i);
            pushY(i);
        }
        printArray();
        popX();
        pushY(6);
        printArray();
    }

}

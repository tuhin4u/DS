package interviewTest.sap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * MiniMax
 */
public class MinMaxQ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Integer a[][]=new Integer[n][n];
        for(int i=0;i<n;i++){
            String[] strings = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
            for (int j=0;j<n;j++){
                a[i][j]=arr[j];
            }

        }
//        Integer a[][]=new Integer[][]{{10,20,30},{20,10,30},{10,5,35}}; //x=10, y=20
//        Integer a[][]=new Integer[][]{{10,20,10},{20,10,5},{30,30,35}};//x==y
//        Integer a[][]=new Integer[][]{{1,1,3,4},{5,1,1,8},{9,10,1,1},{1,14,15,1}};
//        Integer a[][]=new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
//        printArray(a);

        processMiniMax(a);

    }

    public static void processMiniMax(Integer[][]a){
        int size=a.length;
        Integer[][] b = transposeMatrix(a);
        //sort a row wise
        for (int i=0;i<size;i++){
            Arrays.sort(a[i]);
        }
        int x=Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            if(x<a[i][0])
                x=a[i][0];
        }
        //sort b row wise
        for (int i=0;i<size;i++){
            Arrays.sort(b[i],Collections.reverseOrder());
        }
        int y=Integer.MAX_VALUE;
        for (int i=0;i<size;i++){
            if(y>b[i][0])
                y=b[i][0];
        }

//        System.out.println("x= "+x);
//        System.out.println("y= "+y);
        int min=Integer.MAX_VALUE;
        if(x==y){
            min=0;
        }else{
            for (int i=0;i<size;i++){
                int counter=0;
                for (int j=0;j<size;j++){
                    if (a[i][j]==y){
                        counter++;
                    }
                }
                if(counter!=0 && counter<min){
                    min=counter;
                }

            }

        }


        System.out.println(min);
    }
    public static void printArray(Integer[][]arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------");
    }
    public static Integer[][] transposeMatrix(Integer arr[][]){
        Integer n=arr.length;
        Integer[][]b=new Integer[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                b[i][j]=arr[j][i];
            }

        }
        return b;
    }
}

package interviewTest.test;

import java.util.Arrays;

public class test13 {
    public static void main(String[] args) {
        int[] arr=new int[]{5,9,4,2,3,25,26};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if(isDivisible(arr[j])==isDivisible(arr[j+1])){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
                else if(isDivisible(arr[j])>isDivisible(arr[j+1])){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Arrays.stream(arr).forEach(x->System.out.print(x+"\t"));

    }
    public static int isDivisible(int x){
        if(x%2==0) return 2;
        if (x%3==0) return 3;
        if(x%5==0) return 5;
        return 0;
    }
}

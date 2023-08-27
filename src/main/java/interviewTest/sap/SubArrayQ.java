package interviewTest.sap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Choose Subarray with Maximum length
 */
public class SubArrayQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] strings = sc.nextLine().split(" ");
        int[] arr = Arrays.stream(strings).mapToInt(Integer::parseInt).sorted().toArray();
        int result=processSubArray(arr);
        System.out.println(result);

    }
    public static int processSubArray(int arr[]){
        int largest=0;
        for (int i=0;i<arr.length;i++){
            int j=i;
            int counter=0;
            //finding the next element chaing till the point the condition remains true
            while (j+1<arr.length && arr[j+1]-arr[i]<=1){
                counter++;
                j++;
            }
            if(counter>largest)
                largest=counter;
        }

        return largest+1;
    }
}

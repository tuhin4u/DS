package interviewtests.test.test2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    //list of integer
    //pair for sum
    //[1, 3, 5, 2, 7, 12], 8
    //[1,2,3,5,7,12]
    public static List<List<Integer>> sumPair(int arr[], int sum){
        int i=0;
        int j= arr.length-1;
        Arrays.sort(arr);

        List<List<Integer>> res= new ArrayList<>();
        while (i<j){
            int n=arr[i]+arr[j];
            if (n==sum){
                List<Integer> ir= new ArrayList<>();
                ir.add(arr[i]);
                ir.add(arr[j]);
                res.add(ir);
                //check if left duplicat
                boolean isLeftDup=false;
                if(arr[i]==arr[i+1]){
                    isLeftDup=true;
                }
                //check if right is duplicate
                boolean isRightDup=false;
                if(arr[j]==arr[j-1]){
                    isRightDup=true;
                }
                if (isLeftDup && isRightDup){//if both duplicat

                }else if(isLeftDup==false && isRightDup==true){ //if right dup
                    j--;
                }else {//if left dup
                    i++;
                }
            }else if (n>sum){
                j--;
            }else {
                i++;
            }
        }
        return res;
    }

    //two nos             10                  20                   30
    //x=1 2 3 4 5 6 7 8 9 1 0 1 1 1 2 1 3 1 4 1  5 1 6 1 7 1 8 1 9 2  021222324252627282930
    //n = 1 -> 1
    //n = 2, -> 2
    //n = 10 -> 1
    //n = 11, -> 0
    //if n is very large
    //converting to array
    public static int findChar(String s, BigDecimal n){
        char[] chars = s.toCharArray();

        int i=n.intValue();
        return chars[i]-'0';
        //get string length


    }

    public static void main(String[] args) {
        int arr[]={1,1, 3, 5, 2, 7, 12}; //left dup, right dup ,   left !dup, right dup , left dup, right ! dup
        int arr2[]={1, 3, 5, 2,7, 7, 12};
        int arr3[]={1,1, 3, 5, 2,7, 7, 12};
        int sum=8;
        List<List<Integer>> res= sumPair(arr,sum);
        System.out.println(res);
        //1,1,7,7--1,7 1,7
    }
}

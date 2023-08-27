package interviewTest.test3;

import java.util.Arrays;

public class Test2 {
    public static void leftRotate(char[] chars, int n){

        char[] chars1=reverseArr(0,n-1,chars);
        char[] chars2=reverseArr(n,chars.length-1,chars);
        char[] chars3=reverseArr(0, chars.length-1 ,chars2);

        System.out.println(Arrays.toString(chars3));
    }
    public static char[] reverseArr(int start, int end, char[] chars){
        while (start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return chars;
    }
    public static void main(String[] args) {
        String a  = "12345";
        char[] chars=a.toCharArray();
        int x=51;
        int n=x%a.length();
        leftRotate(chars,n);

    }
    //int d  = 2;
    //12 345
    //21 543  -> 34512
    //String a  = "12345";
     //n=n%chars.length();
    //
    //left rorate by 2
    //
    //output  = 34512
    //
    //left rorate by 50
    //
    //
    //
    //public String rortateLeft(String input,int d){
    //
    //// rerturn rortated string
    //
    //}


}

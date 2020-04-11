package com.algo.string;

/**
 * Created by u6042192 on 19-Jan-17.
 * String str="abc";
 System.out.println(str.substring(1));//bc
 System.out.println(str.substring(2));//c
 System.out.println(str.substring(3));//
 */
public class StringReverse {
    public static String revString(String str){
        if(str==null || str.length()<=1)
            return str;
//        char ch=str.charAt(0);
//        String s1=str.substring(1);

        return revString(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println(revString(str));
    }
}

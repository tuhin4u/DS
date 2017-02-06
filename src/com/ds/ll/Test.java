package com.ds.ll;

/**
 * Created by U6042192 on 07-Dec-16.
 */
public class Test {
    public static void main(String[] args) {
        String str="tuhin#firstname&lastname";
        String s[]=str.split("\\[|&|\\]");
        for (int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }

}

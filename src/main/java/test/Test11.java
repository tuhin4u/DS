package test;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        String s="abc";
        char[] chars = s.toCharArray();
        for(char c:chars){
            System.out.println((int)c);
        }
    }
}

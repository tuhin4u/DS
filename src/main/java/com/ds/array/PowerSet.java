package com.ds.array;

public class PowerSet {
    public static void main(String[] args) {
        String s="abc";
        printPowerSet(s.toCharArray());

    }
    public static void printPowerSet(char[] set){
        int size=set.length;
        int pow_set_size=(int)Math.pow(2,size);
        //itreating till 8
        for (int i = 0; i <pow_set_size ; i++) {
            //checking the parity bit
            for (int j = 0; j < size; j++) {
                if((i & (1<<j))>0){
                    System.out.print("-"+set[j]);
                }
            }
            System.out.println();
        }


    }
}



package com.ds.array;

/**
 * Created by U6042192 on 11-Oct-17.
 */
public class SeatFinder {
    public static void main(String[] args) {
        int n=40;
        int block=n/12+1;
        int pos=n%12;
        int half=pos/6;
        String[] seat={"WS","MS","AS","AS","MS","WS"};
        //in c define string array like this
        // char *seat[] = {"WS","MS","AS","AS","MS","WS"};
        int opp_seat=block*12-pos+1;
        System.out.println(opp_seat+" "+seat[(pos%6)-1]);
    }
}

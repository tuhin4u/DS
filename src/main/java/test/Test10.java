package test;

import java.util.HashMap;

class Test10
{
    public static void main(String[] args) {
        maxCup(10,2,5);
        maxCup(12,4,4);
        maxCup(6,2,2);
    }
    public static void maxCup(int n,int c, int m){
        int count=0;
        count=n/c;
        n=count;
        while (n>=m){
            int a=n/m;
            int r=n%m;
            n=a+r;
            count=count+a;
        }
        System.out.println(count);
    }
}

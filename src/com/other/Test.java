package com.other;

/**
 * Created by u6042192 on 21-Mar-17.
 */
public class Test {
    int test(int i){
        System.out.println(i);
        try {
            throw new Exception("exception thrown at i="+i);
        } catch (Exception e) {

        }
        return i;
    }
    public static void main(String[] args) {
        /*for(int i=0;i<3;i++){
            new Test().test(i);
        }*/
//        MyInterface fn=(a,b)->a+b;
//        Test.printSum((a, b) -> a +b,10,20);
        new Thread(()->System.out.println("runing from thread")).run();
    }
    /*public static void printSum(MyInterface fn,int a, int b){
        int sum=fn.sum(a,b);
        System.out.println(sum);
    }*/

}
@FunctionalInterface
interface MyInterface{
    int sum(int a,int b);


}

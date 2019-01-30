package com.other;

/**
 * Created by U6042192 on 28-Apr-17.
 */
class Greeter{
    public void greet(){
        System.out.println("hello world");
    }

   /* @Override
    public void run() {
        for(int i=0;i<5;i++)
        greet();
    }*/
}
public class MethodReferenceEx extends Greeter{
    public static void main(String[] args) {
        Greeter g1=new Greeter();
        Thread thread=new Thread(g1::greet);
        thread.start();

    }
}

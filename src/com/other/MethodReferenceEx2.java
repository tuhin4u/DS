package com.other;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by U6042192 on 01-May-17.
 */

class Class1{
    public void printName(){
        System.out.println("top");
    }
}
interface Interface2{
    default void printName(){
        System.out.println("below");
    }
}

public class MethodReferenceEx2 extends Class1 implements Interface2 {

    public static void main(String[] args)
    {
        /*Thread t = new Thread(new Greeter1()::greet);
        t.start();*/
        System.out.println("--");
        new MethodReferenceEx2().printName();
    }

}

package myjava8.module2;

import java.util.function.Function;

/**
 * Created by U6042192 on 17-Jul-17.
 */
public class FunctionEx1 {
    public static void main(String[] args) {

        printSqare(5, (i)-> i*i);
    }
    public static void printSqare(Integer n,Function<Integer,Integer> fn){
        System.out.println(fn.apply(n));
    }
}

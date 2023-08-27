package myjava8.module2;

import java.util.function.Function;
import java.util.function.BiFunction;

/**
 * Created by U6042192 on 17-Jul-17.
 */
public class FunctionEx1 {
    public static void main(String[] args) {

        //using functions
        printSqare(5, (i)-> i*i);

        //using bifunctions
        BiFunction<Integer,Integer,Integer> biFunction= (x,y)->x+y;
        calculate(biFunction,10,20);
    }
    public static void printSqare(Integer n,Function<Integer,Integer> fn){
        System.out.println(fn.apply(n));
    }
    public static void calculate(BiFunction<Integer,Integer,Integer> bi, Integer x, Integer y ){
        Integer result = bi.apply(x, y);
        System.out.println("returning fron bifuntion: "+result);
    }
}


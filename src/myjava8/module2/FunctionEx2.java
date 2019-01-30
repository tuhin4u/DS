package myjava8.module2;

import java.util.function.Function;

/**
 * Created by U6042192 on 17-Jul-17.
 */
public class FunctionEx2 {
    public static void main(String[] args) {

        printSqrt(4,Math::sqrt);
    }
    public static void printSqrt(int i,Function<Double,Double> fn){
        System.out.println(fn.apply((double)i));
    }

}

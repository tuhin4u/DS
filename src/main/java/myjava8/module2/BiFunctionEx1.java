package myjava8.module2;

import java.util.function.BiFunction;

/**
 * Created by U6042192 on 17-Jul-17.
 */
public class BiFunctionEx1 {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        String result=calc.calculate((a,b)->":"+(a+b),10,20);
        System.out.println(result);
    }
}
class Calculator{
    public String calculate(BiFunction<Integer,Integer,String> bi, Integer i,Integer j){
        return bi.apply(i,j);
    }
}
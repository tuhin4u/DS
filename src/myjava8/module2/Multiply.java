package myjava8.module2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * Created by U6042192 on 21-Jul-17.
 */
public class Multiply {
    public static void main(String[] args) {
        List<Integer> valueList=Arrays.asList(1,2,3,4,5,6);
        Function<Integer,Integer> ft=i->i*2;

        BinaryOperator<Integer> bt=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {
                return i+j;
            }
        };
//        Integer reduce = valueList.stream().map(ft).reduce(10, (i, j) -> i + j);
        Integer reduce = valueList.stream().map(ft).reduce(0,Integer::sum);
        System.out.println(reduce);


    }
}

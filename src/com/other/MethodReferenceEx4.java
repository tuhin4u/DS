package com.other;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by U6042192 on 20-May-17.
 */
public class MethodReferenceEx4 {
    public static void main(String[] args) {
        List<String> nums= Arrays.asList("one", "two", "three", "four", "five");
        Consumer<String> c1=System.out::print;
        nums.forEach(c1);
        Predicate<String>p1= s->s.length()>3;
//        nums.forEach(p1);

    }
}

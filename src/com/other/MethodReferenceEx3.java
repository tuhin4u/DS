package com.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by U6042192 on 20-May-17.
 */
public class MethodReferenceEx3 {
    public static void main(String[] args) {
        List<String> nums= Arrays.asList("one","two","three","four","five");
        Consumer<String> c1=System.out::print;
        nums.forEach(c1);

        List<String>results=new ArrayList<>();
        nums.forEach(s->results.add(s));

        results.forEach(c1);

    }
}

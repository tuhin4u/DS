package myjava8.module2;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by U6042192 on 17-Jul-17.
 */
//filter operation
public class StreamEx2 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Boy","Cat","Dog");
        List<String> list1=list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(list1);
        list.forEach(System.out::println);
        Map map=new HashMap();



    }
}

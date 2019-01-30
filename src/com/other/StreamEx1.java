package com.other;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by U6042192 on 02-May-17.
 */
public class StreamEx1 {
    public static void main(String[] args) {
       List<String> names= Arrays.asList("06  Discovery DR", "13 20130124 Launched L", "13 20170726 Launched L","13 20130125 Launched L","14 Something XY");
        /*String name=(String)names.stream().filter(w->w.length()==4).findFirst().get();
        System.out.println(name);*/
        /*String name=(String)Stream.of("Sachin", "Elon").filter((x,y)->x.compareTo(y));
        System.out.println(name);*/

        Collections.sort(names,(x,y)->x.compareTo(y));
        names.forEach(System.out::println);


    }
}

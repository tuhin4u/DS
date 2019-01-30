package com.other;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by U6042192 on 25-Apr-17.
 */

@FunctionalInterface
interface MtTestInterface{
    void show();
    String toString();
}
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        list.sort(Integer::compare);
        /*Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
//        list.forEach(Integer-> System.out.println(Integer));
        list.forEach(System.out::println);

    }
}

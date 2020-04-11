package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i=(Integer) iterator.next();
            System.out.println(i);
            list.add(4);
        }
        System.out.println("------");
        list.stream().forEach(System.out::println);

    }
}

package myjava8.module2;

import java.util.*;
import java.util.stream.Collectors;

public class ListMapEx {
    public static void main(String[] args) {
        List<Map<String,List<Integer>>> list=new ArrayList<>();
        Map<String,List<Integer>> map1=new HashMap<>();
        map1.put("key1", Arrays.asList(1,2,3));
        Map<String,List<Integer>> map2=new HashMap<>();
        map2.put("key2", Arrays.asList(4,5,6));
        list.add(map1);
        list.add(map2);

        list.stream()
                .flatMap(x->x.values().stream())
                .flatMap(x->x.stream())
                .forEach(y-> System.out.println(y));

        int sum=list.stream()
                .flatMap(x->x.values().stream())
                .flatMap(x->x.stream())
                .reduce(0,(x,y)->x+y);

        System.out.println("sum="+sum);

    }
}

package myjava8.module2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Created by U6042192 on 21-Jul-17.
 */
public class MapFilterReduceEx {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(10,20,30,10,20,10);

        Integer reduce = numList.stream().filter(i -> i % 5==0).reduce(0, (i, j) -> i + j);
        System.out.println(reduce);

        //to get sum of all elements
        Integer sum = numList.stream().collect(Collectors.reducing(0, (i, j) -> i + j));
        System.out.println("sum= "+sum);


//        Map<Integer, Long> map = numList.stream().collect(groupingBy(Function.identity(), counting()))
//                .entrySet().stream().sorted((a,b)->-a.getValue().compareTo(b.getValue()))
//                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue(),(x1,x2)->x1, LinkedHashMap::new));
//        System.out.println(map);

        Long value = numList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted((a, b) -> -a.getValue().compareTo(b.getValue()))
                .findFirst().get().getValue();
        System.out.println(value.intValue());
    }
}

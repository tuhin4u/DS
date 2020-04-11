package myjava8.module2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountFrequencyEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,2,3,3,4,4,4,5,5);

//        list.stream()
//                .collect(Collectors.toMap(w->w,w->1,Integer::sum))
//                .entrySet()
//                .stream()
//                .sorted((x,y)->-x.getValue().compareTo(y.getValue()))
//                .forEach(System.out::println);
        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
        //iterate through map

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
        for (Integer key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }

    }
}

package myjava8.module2;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class WordCountJava8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "hello", "bye", "ciao", "bye", "ciao");
        /*Map<String, Integer> counts = list.stream().
                collect(Collectors.toConcurrentMap(
                        w -> w, w -> 1, Integer::sum));
        System.out.println(counts);


        */Map<String, Long> collect =
                list.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);/**/

        list.stream().map(word->new AbstractMap.SimpleEntry(word,1)).forEach(x->System.out.println(x));
//        list.stream().map(word->new AbstractMap.SimpleEntry(word,1)).collect(toMap(e->e.getKey(),e->e.getValue(),(v1,v2) -> v1+v2));
    }
}

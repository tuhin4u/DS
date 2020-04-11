package myjava8.module2.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortMapEX1 {
    public static void main(String[] args) {
        Map<String, Integer> budget = new HashMap<>();

        budget.put("a", 6);
        budget.put("d", 3);
        budget.put("b", 5);
        budget.put("e", 2);
        budget.put("c", 4);
        budget.put("f", 1);
        System.out.println(budget);

        Map<String, Integer> sorted1=budget.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(sorted1);
        System.out.println("---");

        Map<String, Integer> sorted = budget
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));

        System.out.println(sorted);
    }

}

package myjava8.module2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by U6042192 on 17-Jul-17.
 */
public class StreamEx3 {
    static class Filter{
        private String name;
        private Integer value;

        public Filter(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        List<Filter> filters= Arrays.asList(new Filter("Companies",1),new Filter("Countries",2));
        String s = filters.stream().map(e -> e.getName() + ":" +(
                e.getValue() == 1 ? e.getValue() + " filter applied":(e.getValue()==0 ? "Filter applied" : e.getValue() + " filters applied"
        )))
                .collect(Collectors.joining(","));
        System.out.println(s);

    }
}
//e.getValue() == 1 ? e.getValue() + " filter applied" : (e.getValue() == 0 ? "Filter applied" : e.getValue() + " filters applied")
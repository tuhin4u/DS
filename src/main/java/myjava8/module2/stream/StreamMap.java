package myjava8.module2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    static class Emp{
        String s;

        public Emp(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "s='" + s + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(2,3,5,6));
        list.add(Arrays.asList(4,6));
        list.add(Arrays.asList(2,3));

        List<Integer> collect = list.stream().flatMap(lists -> lists.stream()).filter(x -> x >= 3).collect(Collectors.toList());
        System.out.println(collect);

        List<String> lists= new ArrayList<>(Arrays.asList("A","B","C"));
        List<Emp> collect1 = lists.stream().map(x -> new Emp(x)).collect(Collectors.toList());
        System.out.println(collect1);


    }
}

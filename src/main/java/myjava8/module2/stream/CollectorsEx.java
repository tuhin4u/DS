package myjava8.module2.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsEx {

    public  static void collectors_toCollection(){
        List<Student> list = new ArrayList<>(Arrays.asList(new Student[]{new Student(1,"a"),new Student(2,"b")}));
        LinkedList<Integer> collect = list.stream().map(x -> x.id).collect(Collectors.toCollection(LinkedList::new));
        Integer reduce = list.stream().collect(Collectors.summingInt(x->x.id));
        OptionalDouble average = list.stream().mapToInt(x -> x.id).average();

        list.stream().collect(Collectors.counting());
        System.out.println(average.getAsDouble());
        System.out.println(reduce);
        System.out.println(collect);
    }
    public static void collectors_tomap(){
        List<String> lists= new ArrayList<>(Arrays.asList("cat","elephant"));
        Map<String, Integer> collect = lists.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
        System.out.println(collect);

    }

    public static void main(String[] args) {

        collectors_toCollection();
        //word length in a map
        collectors_tomap();
    }
    static class Student{
        public int id;
        public String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Stu{" +
                    "id=" + id +
                    ", name=" + name +
                    '}';
        }
    }
}

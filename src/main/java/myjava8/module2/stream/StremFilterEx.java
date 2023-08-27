package myjava8.module2.stream;

import myjava8.module2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StremFilterEx {

    public static void main(String[] args) {
//        List<Integer> list= new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//
//        Stream<Integer> stream = list.stream();
//        stream.filter((x)->x%2==0).forEach(System.out::print);

//        filter all person age greater than 20
        List<Person> lists= new ArrayList<>(Arrays.asList(new Person[]{new Person(25,"A"),new Person(17,"B"),new Person(20,"C")}));
        lists.stream().filter(x->x.getAge()>=20).forEach(x-> System.out.println(x));

    }
}

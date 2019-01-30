package com.other;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by U6042192 on 08-Apr-17.
 */
public class Test2 {
    public static void main(String[] args) {
        List<People> peopleList=Arrays.asList(
                new People("Eugenio","Wyland",23),
                new People("Jennine", "Perillo",30),
                new People("Dylan", "Deschaine",27),
                new People("Jay","Garrick",23),
                new People("John", "Diggle",30),
                new People("Barry", "Alen",27)
        );
//        Collections.sort(peopleList,(p1,p2)->p1.getF_name().compareTo(p2.getF_name()));
//
////       Iterator<People> iterator= peopleList.iterator();
////        while (iterator.hasNext()){
////            iterator.next();
////        }
        Collections.sort(peopleList, Comparator.comparing(People::getF_name));
        System.out.println(peopleList);
        Collections.sort(peopleList, Comparator.comparing(People::getL_name));
        System.out.println(peopleList);

        peopleList.forEach(System.out::println);
        Stream<People> peopleStream=peopleList.stream().filter(w->w.f_name.length()<5);
        peopleStream.forEach(System.out::println);


    }
}
class People{
    String f_name;
    String l_name;
    int age;

    public People(String f_name, String l_name, int age) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", age=" + age +
                '}';
    }
}
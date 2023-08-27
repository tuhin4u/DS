package myjava8.module2.lambda;


import java.util.*;

public class ComparatorEx {
    static class Person{
        public Integer id;
        public String name;

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> personList= new ArrayList<>(Arrays.asList(new Person[]{new Person(4,"y"), new Person(5,"a")}));
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.id.compareTo(o2.id);
            }
        });
        System.out.println(personList);
        Collections.sort(personList,(x,y)->x.name.compareTo(y.name));

        System.out.println(personList);
    }
}

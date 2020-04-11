package myjava8.module2;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by U6042192 on 17-Jul-17.
 */
public class StreamEx1 {
    public static void main(String[] args) {
        List<Person> persons=PersonFactory.getPersonList();

        Consumer<Person> c1= p-> System.out.print(p.getName()+" ");
        Consumer<Person> c2= p-> System.out.println(p.getAge() + " ");

        Stream<Person> personStream=persons.stream();
        personStream.forEach(c1.andThen(c2));


    }
}

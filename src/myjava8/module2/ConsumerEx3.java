package myjava8.module2;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by U6042192 on 15-Jul-17.
 */
public class ConsumerEx3 {
    public static void main(String[] args) {
        List<Person> persons=PersonFactory.getPersonList();
        /*Consumer<Person> consumer=new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println((person.getGender().equals("M"))?"Mr "+person.getName():"Mrs "+person.getName());
            }
        };*/
        ConsumerEx3 ex=new ConsumerEx3();
        Consumer<Person> c1=p -> System.out.print((p.getGender().equals("M"))?"Mr "+p.getName():"Mrs "+p.getName());
        Consumer<Person> c2= c1.andThen(p-> System.out.println("  "+p.getAge()));
        ex.printPersons(persons,c2);
    }
    public void printPersons(List<Person> persons,Consumer<Person> consumer){
        persons.forEach(p->consumer.accept(p));
    }
}

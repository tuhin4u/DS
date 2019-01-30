package myjava8.module2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by U6042192 on 15-Jul-17.
 */
public class PersonFactory {
    public static List<Person> getPersonList(){
        List<Person> persons=new ArrayList<>();
        persons.add(new Person(20, "Sanket","M"));
        persons.add(new Person(26, "Tuhin","M"));
        persons.add(new Person(26, "Tania","F"));

        return persons;
    }
}

package myjava8.module2;

import java.util.function.Supplier;

/**
 * Created by U6042192 on 16-Jul-17.
 */
public class SupplierEx2 {
    public static void main(String[] args) {
        Supplier<Person> personSupplier=()->new Person(25,"Albert","M");
        printPerson(personSupplier);
    }
    public static void  printPerson(Supplier<Person> supplier){
        System.out.println(supplier.get());
    }
}

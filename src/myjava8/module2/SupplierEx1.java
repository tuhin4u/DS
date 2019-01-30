package myjava8.module2;

import java.util.function.Supplier;

/**
 * Created by U6042192 on 16-Jul-17.
 */
public class SupplierEx1 {
    public static void main(String[] args) {
        //type1
        /*Supplier<String> name1=new Supplier<String>() {
            @Override
            public String get() {
                return "Hello world";
            }
        };

        System.out.println(name1.get());*/

        //with Lambda

        Supplier<String> name2=()-> "Hello world";
        System.out.println(name2.get());

        //System.out.println((() -> "Hello world").get());



    }
}

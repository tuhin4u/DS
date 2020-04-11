package myjava8.module2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by U6042192 on 20-May-17.
 */
public class ConsumerEx1 {
    public static void main(String[] args) {
        List<String> nums= Arrays.asList("one", "two", "three", "four", "five");
        Consumer<String> c1=System.out::print;
        List<String> results=new ArrayList<>();
        Consumer<String> c2=s->results.add(s);

        /*System.out.println(results.size());
        nums.forEach(c1.andThen(c2));
        System.out.println(results.size());*/

        nums.stream().filter(s -> s.length()>3 && s.length()<5).forEach(c1);
    }
}

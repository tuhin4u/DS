package myjava8.module2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by U6042192 on 15-Jul-17.
 */
public class ConsumerEx2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);

        //list.forEach(i-> System.out.println(i));
        list.forEach(i->new ConsumerEx2().print(i));
    }
    public void print(Integer i){
        System.out.println(i);
    }
}

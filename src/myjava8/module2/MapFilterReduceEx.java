package myjava8.module2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by U6042192 on 21-Jul-17.
 */
public class MapFilterReduceEx {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(10,20,30);

        Integer reduce = numList.stream().filter(i -> i % 5==0).reduce(0, (i, j) -> i + j);
        System.out.println(reduce);

    }
}

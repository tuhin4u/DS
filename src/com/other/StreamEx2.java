package com.other;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by U6042192 on 02-May-17.
 */
public class StreamEx2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sachin", "Elon");
        Stream s=names.stream().map(String::toString);

    }
}

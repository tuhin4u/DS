package myjava8.module2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by U6042192 on 20-May-17.
 */

public class PredicateEx1 {
    public static void main(String[] args) {
        Predicate<String> p1=(s)->s.length()>4;

        /*System.out.println(p1.interviewTest.test("abc"));
        System.out.println(p1.interviewTest.test("abcd"));
        System.out.println(p1.interviewTest.test("abcde"));
        System.out.println(p1.interviewTest.test("abcdef"));*/

        Predicate<String> p2=(s)->s.length()<6;

        System.out.println(p1.and(p2).test("12345"));
        System.out.println(p1.and(p2).test("1234"));
    }
}



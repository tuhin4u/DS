package interviewTest.test;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static void main(String[] args) {
        String s1=new String("interviewTest/test");
        String s4=new String("interviewTest/test");
        String s2= "interviewTest/test";
        String s3= "interviewTest/test";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println("s1.equals(s2) : "+s1.equals(s2));

        Map<String,Integer> map=new HashMap<>();
        map.put(s1,1);
        map.put(s2,2);
        map.put(s3,3);
        map.put(s4,4);

        System.out.println(map.size());
    }
}

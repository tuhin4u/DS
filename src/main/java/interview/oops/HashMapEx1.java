package interview.oops;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        String s="A";
        HashMap<String,Integer> map = new HashMap<>();
        map.put(s,1);
        //changed the reference
        s="B";

        Integer n=map.get(s);
        System.out.println(n);//this will return null
    }
}

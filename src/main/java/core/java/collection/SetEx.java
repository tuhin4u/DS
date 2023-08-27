package core.java.collection;


import java.util.*;

//why set doesnot allow duplicate
//a dummy object of Bject type is been added to Map
public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(null);
        set.add(null);
//        set.add(1);
        System.out.println(set);
        HashMap<String,String> map= new HashMap<>();
        map.put(null,null);
        map.put(null,null);
        System.out.println(map);


    }
}

package core.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionEx {
    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1);
//        list.add(2);
//
//        //concurrent modification exception
//        Iterator<Integer> it=list.iterator();
//        list.add(3);
//        while (it.hasNext()){
//
//            System.out.println(it.next());
//        }


        //with Hasmap it will throw concurrent modification exception
        ConcurrentHashMap<Integer,String> map= new ConcurrentHashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        Iterator<Integer> it=map.keySet().iterator();
        map.put(3,"C");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

package core.java;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
class Adder<T extends  Number>{
    public T add(T t1, T t2){
        return t1;
    }
}

public class Ex {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        list.add("A");
        String s=(String) list.get(0);
    }
}

package interviewTest.sap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TopFiveMaxEx {
    static Map<String,Integer> ocuuranceMap=new HashMap<>();
    static Map<String,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {

//            int n=(int)Math.random()%10+70;
            int n=(int)(65 + (Math.random() * (89 - 65)));
            Character c=(char)n;
            add(c.toString());
        }
        System.out.println(ocuuranceMap.size());

        ocuuranceMap.forEach((k,v)-> System.out.print(k+","+v+"  "));
        System.out.println();
        ocuuranceMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((k)-> System.out.print(k.getKey()+","+k.getValue()+"  "));
        System.out.println();
        System.out.println("-----");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((k)-> System.out.print(k.getKey()+","+k.getValue()+"  "));
    }
    public static void add(String s){
        if(ocuuranceMap.containsKey(s)){
            Integer integer = ocuuranceMap.get(s);
            ocuuranceMap.put(s,integer+1);
            addInMaxMap(s,integer+1);
        }else {
            ocuuranceMap.put(s,1);
            addInMaxMap(s,1);

        }
    }
    public static void addInMaxMap(String s,int occurance){
        if(map.size()<6){
            map.put(s,occurance);
        }else {
            Optional<Map.Entry<String, Integer>> optional = map.entrySet().stream().min(Map.Entry.comparingByValue());
            if(optional.get().getValue()<occurance){
                map.remove(optional.get().getKey());
                map.put(s,occurance);
            }
        }
    }
}

package interviewTest.test;

import java.util.*;
import java.util.stream.Collectors;

public class FunWithAnagram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("code");
        list.add("dcoe");
        list.add("ecod");
        list.add("dceo");
        list.add("frame");
        list.add("framer");

        List<String> lisStr = FunWithAnagram.funWithAnagrams(list);
        System.out.println(lisStr);
    }

    private static List<String> funWithAnagrams(List<String> list) {
        Map<String,String> map=new HashMap<>();
        for (String s:list){
            String key=sort(s);
            if(!map.containsKey(key)){
                map.put(key,s);
            }
        }
        return map.entrySet().stream().map(x->x.getValue()).sorted().collect(Collectors.toList());
    }
    public static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

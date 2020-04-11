package practice.sap;

import java.util.*;

/**
 * Find first character with only one occurrence in the String
 */
public class FirstNonRepeatingCharecter {
    public static void main(String[] args) {
//        String s="abcdeaabbcgf";
//        String s="hello";
        Scanner sc=new Scanner(System.in);

        getFirstNonRepeatingCharecter(sc.nextLine());
    }
    public static void getFirstNonRepeatingCharecter(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,-1);
            }else{
                map.put(c,1);
            }
        }
        Map.Entry<Character, Integer> entry = map.entrySet().stream().filter(e -> e.getValue() > 0).findFirst().orElse(new AbstractMap.SimpleEntry("",""));
        System.out.println(entry.getKey());


    }


}

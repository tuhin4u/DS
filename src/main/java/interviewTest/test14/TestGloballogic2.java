package interviewTest.test14;

import java.util.HashMap;

/*Input: str1 = “galpicfiol”, str2 = “logic”
Output: 1

Input: str1 = “ogalprlqgitoigycgsec”, str2 = “loggic”
Output: 2*/
public class TestGloballogic2 {
    public static void main(String[] args) {
//       String str1 ="galpicfiol";
//       String str2 = "logic";

        String str1 ="oalprlqgitoigycgsec";
        String str2 = "loggic";
       int n=noOfWord(str1,str2);
        System.out.println(n);
    }
    public  static int noOfWord(String s1, String s2){
        HashMap<Character,Integer> s2Map= new HashMap<>();
        HashMap<Character,Integer> s1Map= new HashMap<>();

        for (char ch: s2.toCharArray()) {
            s2Map.put(ch,s2Map.getOrDefault(ch,0)+1);
        }

        for (char ch: s1.toCharArray()) {
            s1Map.put(ch,s1Map.getOrDefault(ch,0)+1);
        }

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < s2.length(); i++) {
            char key=s2.charAt(i);
            if(s1Map.containsKey(key)){//if contains
                int count= s1Map.get(key) / s2Map.get(key);
                min=Math.min(min,count);
            }else {//false condition
                return 0;
            }
        }
        return min;
    }
}
//prev=null
//1->2->3->4
//current=root;
//prev=null;

//while(current!=null){
//    Node next= current.next;
//    current.next=prev;
//    prev= current;
//    current=next;
//
//        }
//return prev;
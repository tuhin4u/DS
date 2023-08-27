package interviewTest.test;



import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
                String content="[\"4732|119141-88-7\",\"7687|\",\"33625|\"]";
        HashMap<String,String> map=new HashMap<>();

                StringTokenizer token = new StringTokenizer(content.substring(1,content.length()-1), ",");
                //String[] strings={"",""};
                while (token.hasMoreTokens()) {

                    String s=token.nextToken().trim();
                    String[] split1 = s.split("\\|");
//                    String[] strings = StringUtils.splitString(token.nextToken().trim()+" ", "\\|");
                    map.put(split1[0],split1[1]);

                }
                Iterator<String> itr = map.keySet().iterator();
                while (itr.hasNext()) {
                    String key=itr.next();
                    System.out.println(key+"->"+map.get(key));
                }
            }

    }


package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * Created by U6042192 on 26-Feb-18.
 */
public class test3 {
    public static void main(String[] args) {
        String key="4732";
        String content="4732|119141-88-7:123;7687|;33625|119141-88-7:567";

//        content=content.substring(1,content.length()-1);
//        content=content.replaceAll("\"","");
        HashMap<String,String> map=new HashMap<>();

        StringTokenizer token = new StringTokenizer(content, ";");
        String casregno="";
        while (token.hasMoreTokens()) {

            String str=token.nextToken().trim()+" ";
            String[] strings = str.split("\\|");
            if(!strings[1].equals(" "))
                casregno+=strings[1].replaceAll(":",",\n").trim()+",\n";

        }

        System.out.println(casregno.substring(0, casregno.length() - 2));
    }

}

//["4732|119141-88-7","7687|","33625|"]


//old-4732|119141-88-7; 7687|; 33625|
//latest-45146|198711-29-4;198712-17-3
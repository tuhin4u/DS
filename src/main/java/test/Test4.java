package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by U6042192 on 29-Mar-18.
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        List<String> list=new ArrayList();
        list.add("vineel pathak , 520 , amkart, NOBODY");
        list.add("abc , 200 , amkart, xyz");
        list.add("def , 100 , flipkart, wxy");
        list.add("def , 500 , amazon, wxy");

        //to read the data from a file
       /* File f=new File("c:\\input.txt");
        list= Files.readAllLines(Paths.get("c:\\input.txt"));*/

        Map<String, Integer> data = processData(list);

        System.out.println(data);
    }
    public static Map<String,Integer> processData(List<String> list){
        Map<String,Integer> map=new HashMap<>();

        for (String s:list){
            String[] splits = s.split(",");
            String company=splits[2].trim();
            Integer salary=Integer.valueOf(splits[1].trim());
            if(map.containsKey(company)){
                int prevSal=map.get(company);
                salary+=prevSal;
            }
            map.put(company,salary);
        }

        return map;
    }
}

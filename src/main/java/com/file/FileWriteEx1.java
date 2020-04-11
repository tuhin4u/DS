package com.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by U6042192 on 01-Feb-17.
 * check if test_{depth}.txt is present
 * then delete it
 * else create the file and append 1-10;
 */
public class FileWriteEx1 {
    public static void writeToFile(List<String> emailList,String depth) {
        final String filePath = "C:\\test\\";
        String filename = "test";
        File file = new File(filePath + filename + "_" + depth + ".txt");
        //if file exist delete it
        if (file.exists()) {
            file.delete();
            System.out.println("file is deleted");
        }
        //else create the fie and append the data
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + filename + "_" + depth + ".txt"))) {
            System.out.println("successfully written to file");
            /*bw.write("1");
            bw.write("\n");
            bw.write("1");*/
            for (int i=0;i<emailList.size();i++){
                bw.write(emailList.get(i));
                bw.write("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        ArrayList<String> emailList=new ArrayList<>();
        emailList.add("a");
        emailList.add("b");
        emailList.add("c");
        emailList.add("d");
        emailList.add("e");

        writeToFile(emailList,"md");
    }

}

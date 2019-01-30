package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by U6042192 on 05-Jun-17.
 */
public class FormatterText {
    public static void main(String[] args) {
        String filePath="C:\\myfolder\\sample.txt";
        String currentLine;
        try {
            FileReader fr=new FileReader(filePath);
            BufferedReader br=new BufferedReader(fr);
            /*while ((currentLine = br.readLine()) != null && (currentLine.) ) {
                System.out.println(currentLine);
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.other;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by U6042192 on 24-Apr-17.
 */
public class FileFilterEx{
    public static void main(String[] args) {
/*
        FileFilter fileFilter=new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };
*/
        FileFilter fileFilter=(File pathname)->pathname.getName().endsWith(".java");
        File dir=new File("C:\\Delete");
        File[] files=dir.listFiles(fileFilter);
        for (File file:files){
            System.out.println(file);
        }


    }
}

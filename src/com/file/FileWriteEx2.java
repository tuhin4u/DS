package com.file;

import java.io.File;

/**
 * Created by u6042192 on 16-Feb-17.
 * check if a directory exist, if not then create it
 */
public class FileWriteEx2 {
    public static void main(String[] args) {
        String depth[]={"db","md","dmd"};

        String bulletinPath="\\myfolder\\app\\adcomm-static-files\\adcomm";
        String advancepath="\\myfolder\\app\\adcomm-static-files\\adcommAdv";

        for(int i=0;i<depth.length;i++) {
            String depthPath = bulletinPath + "-" + depth[i];
            String incomingPath = depthPath + "\\incoming";
            String outgoingPath = depthPath + "\\outgoing";
            String donePath = outgoingPath + "\\done";
            String emailLogsPath = outgoingPath + "\\emailLogs";
            String inProgressPath = outgoingPath + "\\inProgress";

            createDirectory(depthPath);
            createDirectory(incomingPath);
            createDirectory(outgoingPath);
            createDirectory(donePath);
            createDirectory(emailLogsPath);
            createDirectory(inProgressPath);
        }
    }
        public static void createDirectory(String path){
            File directory=new File(path);
            if(!directory.exists()) {
                if(directory.mkdirs())
                    System.out.println("directory created : "+path);
                else
                    System.out.println("unable to create directory"+path);
            }
        }

}

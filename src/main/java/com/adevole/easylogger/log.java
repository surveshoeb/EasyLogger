package com.adevole.easylogger;

import android.os.Environment;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by surve on 13-Jul-17.
 */

public class log {

    static File logFile = Environment.getExternalStorageDirectory();
    static String FolderName = "com.shoebsurve.logger";

    public static void d(Object data){
        String s = data.toString();
        Log.d("Debug Logger",s);
    }

    public static void d(Object data, boolean file){
        String s = data.toString();
        Log.d("Debug Logger",s);

        if (file){
            creatLogFile("Debug Logger "+s+"\n");
        }
    }

    public static void e(Object s){
        Log.d("Error Logger",s.toString());
    }

    public static void e(Object data, boolean file){
        String s = data.toString();
        Log.d("Error Logger",s);

        if (file){
            creatLogFile("Error Logger "+s+"\n");
        }
    }

    public static void setFolderName(String name){
        FolderName = name;
    }

    public static void creatLogFile(String s){

        BufferedWriter out;
        logFile = new File(logFile.getPath() + "/Android/data/"+FolderName+"/log.txt");

        if(!logFile.exists()){
            logFile.mkdirs();
        }

        try {
            FileWriter LogWriter = new FileWriter(logFile, true);
            out = new BufferedWriter(LogWriter);
            out.write(s);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

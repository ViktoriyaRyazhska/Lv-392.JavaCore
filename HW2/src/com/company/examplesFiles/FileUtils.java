package com.company.examplesFiles;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileUtils {

        private static final String FILE_NAME = "E:\\SoftServeAcademy\\IntellijIdea\\unit_1-home-1\\src\\com\\company\\otherFiles\\text.txt";

    public void write(String string){

        FileWriter fileWriter;
        BufferedWriter bw;
        try{
            fileWriter = new FileWriter(FILE_NAME);
            bw = new BufferedWriter(fileWriter);
            bw.write(string);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

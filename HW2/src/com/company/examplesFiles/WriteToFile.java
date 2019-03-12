package com.company.examplesFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToFile {

    private static final String FILE_NAME = "E:\\SoftServeAcademy\\IntellijIdea\\unit_1-home-1\\src\\com\\company\\otherFiles\\writeText.txt";
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeToFile(String line) {
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(FILE_NAME);
        if(!file.exists()) {
            try{
                file.createNewFile();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;

        try {
            fileWriter = new FileWriter(file.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}

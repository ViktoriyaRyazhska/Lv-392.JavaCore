package com.company.examplesFiles;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromFile {

    private static final String FILE_NAME = "E:\\SoftServeAcademy\\IntellijIdea\\unit_1-home-1\\src\\com\\company\\otherFiles\\writeText.txt";

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*    File file = new File("E:\\SoftServeAcademy\\IntellijIdea\\unit_1-home-1\\src\\com\\company\\otherFiles\\readText.txt");
    FileReader fileReader;
    BufferedReader br;
    String line = null;
    try{
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(fileReader);
    } catch(FileNotFoundException e1) {
        e1.printStackTrace();
    }*/

    public static void main(String[] args) {
/*        try {
            String content = "Данную строку запишем в файл";
            File file = new File("E:\\SoftServeAcademy\\IntellijIdea\\unit_1-home-1\\src\\com\\company\\otherFiles\\writeText.txt");

            // Если файл не существует, то создадим его
            if (!file.exists())
                file.createNewFile();

            FileWriter fw;
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Запись завершена");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        String content = null;
        int counter = 0;

        try{
            System.out.println("Enter text!");
            content = br.readLine();
            String[] words = content.split(" ");

            File file = new File(FILE_NAME);

            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw;
            BufferedWriter bw;
            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            if(words.length > 0) {
                for(String s : words) {
                    counter++;
                    s = String.format("№%,d\t->\t%s\n", counter, s);
                    bw.write(s);
                }

            }
            bw.write(file.getName());
            bw.write(file.getAbsolutePath());
            bw.write(String.valueOf(file.canWrite() ? true : false));
            bw.write(String.valueOf(file.length()));
//            System.out.printf("%s", bw.write(file.getName()));
            bw.close();

        } catch(IOException e){
            e.printStackTrace();
        }



    }



}

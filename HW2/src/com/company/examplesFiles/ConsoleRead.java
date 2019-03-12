package com.company.examplesFiles;

import java.io.*;

public class ConsoleRead {

        public static void main(String[] args) {
                String line = " ";
            try {
                File file = new File("E:\\SoftServeAcademy\\IntellijIdea\\unit_1-home-1\\src\\com\\company\\examplesFiles\\file.txt");
                InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

                FileWriter fileWriter = new FileWriter(file); // поток который подключается к текстовому файлу
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWitter

                System.out.println("Enter line: ");
                while(!(line = bufferedReader.readLine()).equals("exit")) {
                    bufferedWriter.write(line);
                }

                bufferedReader.close(); // закрываем поток
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}

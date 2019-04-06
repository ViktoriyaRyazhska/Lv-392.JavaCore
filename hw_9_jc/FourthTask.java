package hw_9_jc;

import java.io.*;
import java.util.ArrayList;

public class FourthTask {

    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "file1.txt"));
            String line = reader.readLine();
            while (line != null) {
                text.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "file2.txt"));
            writer.write("Number of lines in file1.txt = " + text.size() + "\n");
            writer.write("Longest line : " + maxString(text) + "\n");
            writer.write("Kate 14.12.99" + "\n");
            writer.close();
        }catch (IOException e){
            e.getMessage();
        }
    }

    public static String maxString(ArrayList<String> arr){
        String line = "";

        for (String i : arr){
            if (i.length() > line.length()){
                line = i;
            }
        }
        return line;
    }
}

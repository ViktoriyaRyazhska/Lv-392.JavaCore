package ua.com.lozinska.lesson10.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Files {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw;
        BufferedWriter bw;

        try {
            System.out.println("Read text!");
            fr = new FileReader("HomeWork/src/ua/com/lozinska/lesson10/task4/file1.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("HomeWork/src/ua/com/lozinska/lesson10/task4/file2.txt");
            bw = new BufferedWriter(fw);
            String s;

            List<String> myTextLines = new ArrayList<>();
            while ((s = br.readLine()) != null) {
                myTextLines.add(s);
            }
            br.close();

            int maxLenghtsLine = myTextLines.get(0).length();
            int numberMaxLenghtsLine = 0;
            for (int i = 1; i < myTextLines.size(); i++) {
                if (maxLenghtsLine < myTextLines.get(i).length()) {
                    maxLenghtsLine = myTextLines.get(i).length();
                    numberMaxLenghtsLine = i + 1;
                }
            }
            System.out.println("Write data to file: file2.txt");
            bw.write("Number of lines = " + myTextLines.size() + "; ");

            bw.write("The longest line in file is: " + numberMaxLenghtsLine + ": "
                    + myTextLines.get(numberMaxLenghtsLine) + " ");
            bw.write("My name is Olha, 04.02.1991.");

            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class File {

	public static void main(String[] args) {

		String fileName = "file1.txt";
		String fileName2 = "file2.txt";

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			List<String> str = new ArrayList<String>();
			String s = null;
			int count = 0;
			while ((s = br.readLine()) != null) {
				str.add(s);
				++count;
			}
			br.close();

			String numberrOfLines = "Numbers of lines in file1: " + count + "\n";
			String max = "Longest string in file1: " + Collections.max(str, Comparator.comparing(String::length)) + "\n";
			String name = str.get(0) + "\n";
			String age = str.get(1) + "\n";
			FileWriter fw = new FileWriter(fileName2);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(numberrOfLines);
			bw.write(max);
			bw.write(name);
			bw.write(age);
			bw.close();
		} catch (Exception e) {

		}

	}

}

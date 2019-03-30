package ua.edu.softserve.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {

		/*
		 * Implement a pattern for US currency: the first symbol "$", then any number of
		 * digits, dot and two digits after the dot. Enter the text from the console
		 * that contains several occurrences of US currency. Display all occurrences on
		 * the screen.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence with US : ");
		String str = br.readLine();

		Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(str.substring(m.start(), m.end()));
		}

	}
}

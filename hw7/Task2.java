package ua.edu.softserve.homework.hw7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Enter a sentence that contains the words between more than one space. Convert
		 * all spaces, consecutive, one. For example, if we introduce the sentence "I am
		 * learning Java Core», we have to get the "I'm learning Java Core»
		 */

		String str = "I  am    learning   Java  Core";

		String pattern = "[a-zA-Z]+";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		System.out.println("Before: " + str);
		String str1 = str.replaceAll("\\s+", " ");
		System.out.print("After: " + str1);

	}
}

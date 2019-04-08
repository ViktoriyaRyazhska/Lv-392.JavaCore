package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveWords {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String mama = br.readLine();

		String[] word = mama.split(" ");
		String longestWord = "";
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() >= longestWord.length()) {
				longestWord = word[i];
			}
		}

		String reversWord = "";
		for (int i = 0; i < word.length; i++) {
			if (i == 1) {
				reversWord = new StringBuilder(word[1]).reverse().toString();
			}
		}

		System.out.println("[" + longestWord + "]" + " is longest word with " + longestWord.length() + " characters");
		System.out.println("[" + reversWord + "]" + " is second reverse word ");
		br.close();
	}

}

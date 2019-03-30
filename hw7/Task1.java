package ua.edu.softserve.homework.hw7;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * display the longest word in the sentence determine the number of its letters
		 * bring the second word in reverse order
		 */

		String str = "My hobby is football";

		String[] arr = str.split(" ");
		String word = " ";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() >= word.length()) {
				word = arr[i];
			}
		}

		System.out.println("The longer word is: " + word);
		System.out.println("The number of letters of longest word:  " + word.length());

		String[] words = str.split(" ");
		System.out
				.println("Second word in reverse order: " + (words[1] = new StringBuffer(words[1]).reverse().toString()));

	}

}

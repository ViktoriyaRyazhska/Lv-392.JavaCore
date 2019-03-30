package ua.edu.softserve.homework.hw4;

public class FindPos {

	public static void main(String[] args) {

		int[] arr = { 43, 102, 1, 545, 2 };
		int min = arr[0];
		int indexForMin = 0;
		for (int i = 0; i < arr.length; i++) {
			int score = arr[i];
			if (score < min) {
				min = score;
				indexForMin = i;
			}
		}

		System.out.println("The min number is " + min + " on " + (indexForMin + 1) + " position");

		// 2-nd task

	}

}

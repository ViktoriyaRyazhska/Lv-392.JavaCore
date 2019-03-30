package ua.edu.softserve.homework.hw4;

import java.io.IOException;

public class SumFirst5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] arr = { 2, -7, 7, -4, 5, 10, 9, -6, -1, -5 };
		int sumPos = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] >= 0) {
				sumPos += arr[i];
			}
		}
		System.out.println(sumPos);

		int sumNeg = 0;
		for (int i = 5; i < arr.length; i++) {
			if ( arr[i] >= 0) {
				sumNeg += arr[i];
			}
		}
		System.out.println(sumNeg);

	}

}

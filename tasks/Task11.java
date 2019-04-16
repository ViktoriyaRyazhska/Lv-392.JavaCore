package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {

	public static void validationt() {

		System.out.println("Enter card number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String number = null;
		try {
			number = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		validateCreditCardNumber(number);
	}

	private static void validateCreditCardNumber(String str) {

		int[] ints = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ints[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			ints[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
		if (sum % 10 == 0) {
			System.out.println(str + " is a valid credit card number");
		} else {
			System.out.println(str + " is an invalid credit card number");
		}
	}

}
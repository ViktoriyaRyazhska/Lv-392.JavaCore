package ua.edu.softserve.homework.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTP {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		HTTPError httpError = HTTPError.NotFound;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of client error  ...");
		int n = Integer.parseInt(br.readLine());
		
		switch (n) {

		case 400:
			httpError = HTTPError.BadRequest;
			break;

		case 401:
			httpError = HTTPError.Forbidden;
			break;

		case 402:
			httpError = HTTPError.NotFound;
			break;

		case 403:
			httpError = HTTPError.PaymentRequired;
			break;

		case 404:
			httpError = HTTPError.Unauthorized;
			break;

		default:
			System.out.println("This isn't client Error.  Try again...");
			break;
		}
		
		if (n >= 400 && n <= 404) {
			System.out.println("This is " + httpError + " Error  ( " + n + " )");
		}
	}
}

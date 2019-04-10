package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dividing {

	public static double div(double a, double b) {
		try {
			return a / b;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Put first double number");
			double a = Double.parseDouble(br.readLine());
			System.out.println("Put second double number");
			double b = Double.parseDouble(br.readLine());
			System.out.println(div(a, b));

		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
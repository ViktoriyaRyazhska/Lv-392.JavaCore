package ua.edu.softserve.homework.hw8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {

	public static double div(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("PLS...Write correct second number");
		}
		return a / b;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
		try {
			System.out.println("Enter first number");
			double a = Double.parseDouble(br.readLine());
			System.out.println("Enter second number");
			double b = Double.parseDouble(br.readLine());
			System.out.println(div(a, b));

		} catch (NumberFormatException e) {
			System.out.println("Write number");
		} catch (Exception e) {
			System.err.println(e.getMessage() + "\n");

			e.printStackTrace();
		}
	}

}

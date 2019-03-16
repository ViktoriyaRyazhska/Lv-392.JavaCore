package ua.edu.softserve.homework.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ...");

		float a = Float.parseFloat(br.readLine());
		float b = Float.parseFloat(br.readLine());
		float c = Float.parseFloat(br.readLine());

		if (a >= -5.0 && a < 5.0) {
			System.out.println("This number belong to the range [-5,5]");
			if (b >= -5.0 && b < 5.0) {
				System.out.println("This number belong to the range [-5,5]");
				if (c >= -5.0 && c < 5.0) {
					System.out.println("This number belong to the range [-5,5]");
				}
			}
		} else {
			System.out.println("This number doesn't belong to the range [-5,5]");
		}
//
//		if (b >= -5.0 && b < 5.0) {
//			System.out.println("This number belong to the range [-5,5]");
//		} else {
//			System.out.println("This number doesn't belong to the range [-5,5]");
//		}
//
//		if (c >= -5.0 && c < 5.0) {
//			System.out.println("This number belong to the range [-5,5]");
//		} else {
//			System.out.println("This number doesn't belong to the range [-5,5]");
//
//		}
	}

}

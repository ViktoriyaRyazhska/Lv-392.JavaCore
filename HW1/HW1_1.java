package ua.edu.softserve.homework.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Task 1
		System.out.println("Write radius of circle ...");
		int r = Integer.parseInt(br.readLine());
		double pi = 3.14;

		System.out.println("Area: " + 2 * r * pi);
		System.out.println("Perimeter: " + pi * r * r); 
	}

}

package ua.edu.softserve.homework.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ...");

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		
		System.out.println("The max of three number is: " + max);
		System.out.println("The min of three number is: " + min);


	}

}

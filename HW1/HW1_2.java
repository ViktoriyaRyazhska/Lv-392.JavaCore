package ua.edu.softserve.homework.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Task 2

		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where do you live, " + name + "?");
		String address = br.readLine();
		System.out.println("My name is " + name + " and I live in " + address + ".");
	}

}

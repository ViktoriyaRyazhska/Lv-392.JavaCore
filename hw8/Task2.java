package ua.edu.softserve.homework.hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {

	public static ArrayList<Integer> readNumber(int start, int end) throws NumberFormatException, IOException {
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Enter 10 numbers...");
		for (int i = 0; i < 10; i++) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());

			if (num >= start && num <= end) {
				array.add(num);
			}

		}
		return array;
	}

	public static void main(String[] args) {
		try {
			System.out.println(readNumber(1, 100));

		} catch (IOException | NumberFormatException e) {
			System.out.println("You need to enter only numbers..!!!");
			System.out.println(e.getMessage());
		}
	}

}

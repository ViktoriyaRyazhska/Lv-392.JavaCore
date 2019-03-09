package ua.edu.softserve.homework.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Task 3

		System.out.println("Choose country ...");
		String name1 = br.readLine();
		System.out.println("How much minute do you need to " + name1 + " ?");
		int min1 = Integer.parseInt(br.readLine());
		System.out.println("Price per minute to " + name1);
		int tariff1 = Integer.parseInt(br.readLine());
		int price1 = min1 * tariff1;
		System.out.println("Call from UA to " + name1 + " will cost " + price1 + " UAH per " + min1 + " min");

		System.out.println("Choose country ...");
		String name2 = br.readLine();
		System.out.println("How much minute do you need to " + name2 + " ?");
		int min2 = Integer.parseInt(br.readLine());
		System.out.println("Price per minute to " + name2);
		int tariff2 = Integer.parseInt(br.readLine());
		int price2 = min2 * tariff2;
		System.out.println("Call from UA to " + name2 + " will cost " + price2 + " UAH per " + min2 + " min");

		System.out.println("Choose country ...");
		String name3 = br.readLine();
		System.out.println("How much minute do you need to " + name3 + " ?");
		int min3 = Integer.parseInt(br.readLine());
		System.out.println("Price per minute to " + name3);
		int tariff3 = Integer.parseInt(br.readLine());
		int price3 = min3 * tariff3;
		System.out.println("Call from UA to " + name3 + " will cost " + price3 + " UAH per " + min3 + " min");

		double price = price1 + price2 + price3;
		double time = min1 + min2 + min3;
		System.out.println("Call from UA to " + name1 + " will cost " + price1 + " UAH per " + min1 + " min");
		System.out.println("Call from UA to " + name2 + " will cost " + price2 + " UAH per " + min2 + " min");
		System.out.println("Call from UA to " + name3 + " will cost " + price3 + " UAH per " + min3 + " min");
		System.out.println("All calls together will cost " + price + " UAH per " + time + " min");
	}

}

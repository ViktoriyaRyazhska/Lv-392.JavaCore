package ua.edu.softserve.homework.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	/*
	 * Ask user to enter the number of month. Read the value and write the amount of
	 * days in this month (create array with amount days of each month).
	 */

	static int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static String[] month_name = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	static int monthNumber(int month) {
		if ((month >= 1) && (month <= 12)) {
			return month_days[month - 1];
		} else
			return -1;

	}

	static String monthName(int month) {
		if ((month >= 1) && (month <= 12)) {
			return month_name[month - 1];
		} else
			return monthName(month);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of month ...");
		int month = Integer.parseInt(br.readLine());

		int result = Month.monthNumber(month);
		String res = Month.monthName(month);
		if (month < 1 && month > 12) {
			System.out.println("Opps...Pls...Enter correct number of month");
		} else {
			System.out.println("There is " + res + ", he is " + month + " on the list and includes " + result + " day");
		}
	}

}

package ua.edu.softserve.homework.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	/*
	 * Ask user to enter the number of month. Read the value and write the amount of
	 * days in this month (create array with amount days of each month).
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] m31 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30, 31 };
		int[] m30 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30 };
		int[] m28 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28 };

		int amount28 = 0;
		for (int a : m28) {
			if (a > 0 && a <= 31) {
				amount28++;
			}
		}
		int amount30 = 0;
		for (int a : m30) {
			if (a > 0 && a <= 31) {
				amount30++;
			}
		}
		int amount31 = 0;
		for (int a : m31) {
			if (a > 0 && a <= 31) {
				amount31++;
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of month ...");
		int month = Integer.parseInt(br.readLine());

		switch (month) {
		case 1:
			System.out.println("January has " + amount31 + " days");
			break;
		case 2:
			System.out.println("February has " + amount28 + " days");
			break;
		case 3:
			System.out.println("March has " + amount31 + " days");
			break;
		case 4:
			System.out.println("April has " + amount30 + " days");
			break;
		case 5:
			System.out.println("May has " + amount31 + " days");
			break;
		case 6:
			System.out.println("June has " + amount30 + " days");
			break;
		case 7:
			System.out.println("July" + amount31 + " days");
			break;
		case 8:
			System.out.println("August has " + amount31 + " days");
			break;
		case 9:
			System.out.println("September has " + amount30 + " days");
			break;
		case 10:
			System.out.println("October has " + amount31 + " days");
			break;
		case 11:
			System.out.println("November has " + amount30 + " days");
			break;
		case 12:
			System.out.println("December has " + amount31 + " days");
			break;

		default:
			System.out.println("Opps...Pls...Enter correct number of month");
			break;
		}

	}

}

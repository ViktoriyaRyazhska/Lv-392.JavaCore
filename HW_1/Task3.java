package com.softserveinc.career.HW_1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		// units per minute counts in "$"
		double c1 = 5.50, c2 = 3.45, c3 = 12.50;
		
		// units of time are "minutes"
		int t1, t2, t3;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User1, Please, enter the time, that you would like to use by phone in minutes...");
		t1 = sc.nextInt();
		
		
		System.out.println("User2, Please, enter the time, that you would like to use by phone in minutes...");
		t2 = sc.nextInt();
		
		System.out.println("User3, Please, enter the time, that you would like to use by phone in minutes...");
		t3 = sc.nextInt();
		double user1 = t1 * c1, user2 = t2 * c2, user3 = t3 * c3;
		
		System.out.println("User1, your call per " + t1 + " min will cost: " + user1 + " $");
		System.out.println("User2, your call per " + t2 + " min will cost: " + user2 + " $");
		System.out.println("User3, your call per " + t3 + " min will cost: " + user3 + " $");
		
		System.out.println("Total price of call_1, call_2, call_3 will be: " + (user1 + user2 + user3)+ " $");
	}

} 

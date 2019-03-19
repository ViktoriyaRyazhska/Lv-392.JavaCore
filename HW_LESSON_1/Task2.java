package com.softserveinc.career.HW_1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("What is your name? ");
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine();
		System.out.println("Where do you live, " + name + "?" );
		String adress = sc.nextLine();
		System.out.println(name + ", your current adress is: " + adress);
	}

}

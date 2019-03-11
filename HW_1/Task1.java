package com.softserveinc.career.HW_1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius;
		double pi = 3.14;
			
		System.out.println("To count  perimetr and area of the circle, please enter the value of its radius in meters...");
		radius = sc.nextInt();
		double perimetr = 2 * pi * radius;
		double area = pi * (Math.pow(radius,2));
		
		System.out.println("Perimeter of the circle is: " +perimetr +" m");
		System.out.println("Area of the circle is: " +area +" m");		
				
			       

	}
	
			
	}



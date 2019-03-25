import java.util.Scanner;

public class MaxMinNambers {
	
		public static void main(String[] args){
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first  number, please ");
		a = sc.nextInt();
		System.out.println("Enter the second  number, please ");
		b = sc.nextInt();
		System.out.println("Enter the third number, please ");
		c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("a is the MAX number");
		}
		if (b > a && b > c) {
			System.out.println("b is the MAX number");
		}
		
		if (c > a && c > b) {
			System.out.println("a is the MAX number");
		}
		
		
		if (a < b && a < c) {
			System.out.println("a is the MIN number");
		}
		if (b < a && b < c) {
			System.out.println("b is the MIN number");
		}
		
		if (c < a && c < b) {
			System.out.println("c is the MIN number");
		}
		
	}

}

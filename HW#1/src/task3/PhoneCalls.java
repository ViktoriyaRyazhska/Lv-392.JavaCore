package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int c1;
		int c2;
		int c3;
		int t1;
		int t2;
		int t3;
		int c1cost;
		int c2cost;
		int c3cost;
		int summ;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the tariff per minute talk from USA (usd/min): ");
		c1=Integer.parseInt(br.readLine());
		System.out.println("Enter call duration (min): ");
		t1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the tariff per minute talk from Australia (usd/min): ");
		c2=Integer.parseInt(br.readLine());
		System.out.println("Enter call duration (min): ");
		t2=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the tariff per minute talk from France (usd/min): ");
		c3=Integer.parseInt(br.readLine());
		System.out.println("Enter call duration (min): ");
		t3=Integer.parseInt(br.readLine());
		c1cost=(c1*t1);
		c2cost=(c2*t2);
		c3cost=(c3*t3);
		summ=c1cost+c2cost+c3cost;
		System.out.println("Call cost from USA: " +c1cost +" $");
		System.out.println("Call cost from Australia: " +c2cost +" $");
		System.out.println("Call cost from France: " +c3cost +" $");
		System.out.println("Summary cost of all calls: " +summ +" $");
		
		
	}

}

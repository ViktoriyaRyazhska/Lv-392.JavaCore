package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAddress {
	public static void main(String[] args) throws IOException {
		String name;
		String address;
		System.out.println("What is your name?");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		name = br.readLine();
		System.out.println("Where are you live, " +name +"?");
		address = br.readLine();
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
	}
}

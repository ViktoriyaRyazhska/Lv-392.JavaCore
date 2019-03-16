package ua.edu.softserve.homework.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {

	private String name;
	private int birthYear;

	public Person() {

	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void age() throws NumberFormatException, IOException {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(birthYear, Month.JANUARY, 1);
		int a = Period.between(birthday, today).getYears();
		System.out.print("Now! You're " + a + " years old.");
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write your name  ");
		String name = br.readLine();
		System.out.println("Write birthday year: ");
		int birthYear = Integer.parseInt(br.readLine());
		this.name = name;
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Person name = " + name + ", birthYear = " + birthYear + "";
	}

	public void output() {
		System.out.print(name + " you was born in " + birthYear + "  ");
		
	}

	public void changeName() throws IOException {
		System.out.println("Your current name is: " + name);
		System.out.println("Write your new name  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Congrats! Your new name is:  " + name);
	}

	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("John", 1974);

		p1.input();
		p1.output();
		System.out.println(" ");
		p1.age();
		System.out.println(" \n");
		p2.input();
		p2.output();
		System.out.println(" ");
		p2.age();
		System.out.println(" \n");
	
		p3.output();
		p3.age();
		System.out.println(" \n");
		p3.changeName();

	}

}
import java.time.*;
import java.util.Scanner;

public class Person {
	private static String name;
	private static int birthYear;
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
        this.name = name;
	}
	public int getAge() {
		return this.birthYear;
		}
	public void setAge(int birthYear) {
		this.birthYear = birthYear;
	}
	public void age() {
        LocalDate today = LocalDate.now();                          
	    Scanner input = new Scanner(System.in);
	    System.out.println("\nEnter your year of birth :  ");
	    int myInt = input.nextInt();
	    LocalDate birthday = LocalDate.of(myInt, Month.JANUARY, 1);
	    int p = Period.between(birthday, today).getYears();
	    System.out.print("You're "+p+" years old.");
	}
	public void input(String name ,int birthYear) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your name: ");
    	String myString = input.next();
    	System.out.println("Your name is " + myString);
    	System.out.print("Enter your age: ");
    	int myInt = input.nextInt();
    	System.out.print("Your name is "+myString+" , Your age is " +myInt);
	}
	public void output() {
		System.out.println("Your name is  "+name+", Your age is  "+birthYear);
	}
	public void changeName() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your name: ");
    	String myString = input.next();
    	System.out.print("Your name is "+myString+" , enter your new name : ");
    	String myString1 = input.next();
		System.out.println("Your new name is: "+myString1);
	}

 public static void main(String [] args) {
    Person p1 = new Person(name, birthYear);
    p1.setName("Kate");
    p1.setAge(33);
    p1.output();
    Person p2 = new Person(name, birthYear);
    p2.setName("Petya");
    p2.setAge(22);
    p2.output();
    Person p3 = new Person(name, birthYear);
    p3.setName("Yulia");
    p3.setAge(42);
    p3.output();
    Person p4 = new Person(name, birthYear);
    p4.setName("Maria");
    p4.setAge(20);
    p4.output();                                   
    Person p5 = new Person(name, birthYear);
    p5.setName("Nadia");
    p5.setAge(35);
    p5.output();    
    p5.input(name, birthYear);  
    p5.changeName();                           
	p5.age();
	
	}
}

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {

	
	private String name;
	private int birthYear;
	
	public Person () {} // default constructor
	
	public Person (String name, int birthYear) {this.name = name; this.birthYear = birthYear;} // constructor with two param

	public String getName() {
		return name;
	}
		
		// method setter that forbid entering the length of name more then 30
	public void setName(String name) {
		if (name.length()>20)
		{
			this.name = name.substring(0, 30);
		}
		else
		{this.name = name;}
	}
	
	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
		public void changeName(Scanner sc) {
		System.out.println("If you want to change  this name, enter a new name, please: ");
		String name = sc.nextLine();
		setName (name);
		System.out.println("Enter a new birth year, please: ");
		int birthYear = sc.nextInt();
		setBirthYear (birthYear);
		System.out.printf("New name is: " + getName() + " New age is: " + age());
				
		}
		
	// method for counting current age of person
	 public int age () {
		LocalDate localDate = LocalDate.now();
        return localDate.getYear() - birthYear;} 
	 	 	
	@Override
    public String toString() {
		return ("The name is: " + name + ", " + "The age is: " + age() );}
	}

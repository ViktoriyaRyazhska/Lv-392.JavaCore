import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
	
	private String name;
	private int birthYear;
	Scanner scanner = new Scanner(System.in);
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;		
	}	
	public int getBirthYear() {
		return birthYear;
	}
	
	public Person() {
		
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Name = " + name + ", Age = " + age();
	}
	
	public int age() {
		LocalDate date = LocalDate.now();
        return date.getYear() - birthYear;

	}
	
	public String inputName() {
		String newName = scanner.nextLine();
		this.name=newName;
		return newName;
	}
	
	public int inputAge() {
		int newAge = scanner.nextInt();
		this.birthYear=newAge;
		return newAge;
	}

}

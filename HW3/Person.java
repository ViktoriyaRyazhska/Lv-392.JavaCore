
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
	
	public void  age() throws NumberFormatException, IOException {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(birthYear, Month.JANUARY, 1);
	    int a = Period.between(birthday, today).getYears();
	    System.out.print("You're "+a+" years old.");
	}
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int birthYear = Integer.parseInt(br.readLine());	
		this.name = name;
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Person name = " + name + ", birthYear = "  + birthYear +"";
	}
	
	public void output() {
		System.out.print(name);
		System.out.print(" ");
		System.out.print(birthYear);
	}
	
	public void changeName() throws IOException {
		System.out.println("Your name is: "+name);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Your new name is: "+name);
	}
	
	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("Katya", 1998);
		Person p4 = new Person("Olya", 2000);
		Person p5 = new Person("Misha", 1899);
		System.out.println("Write name and birthday year: ");
		
		p1.input();		
		p1.output();
		System.out.println(" ");
		p1.age();
	    System.out.println(" ");
	    p2.input();    
	    p2.output();
	    System.out.println(" ");
	    p2.age();
	    System.out.println(" ");
	    p3.output();
	    System.out.println(" ");
	    p4.output();
	    System.out.println(" ");
	    p5.output();
	    System.out.println(" ");
	    p5.changeName();
						
	}

}

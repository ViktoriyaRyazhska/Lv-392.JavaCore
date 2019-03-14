import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Person person1 = new Person("Yulia", 1989);
		
		Person person2 = new Person();
		person2.setName("Kate");
		person2.setBirthYear(2001);
		
		Person person3 = new Person();
		person3.setName("Olha");
		person3.setBirthYear(1998);
		
		Person person4 = new Person();
		person4.setName("Vika");
		person4.setBirthYear(1990);
		
		Person person5 = new Person();
		System.out.println("Put ur name: ");
		person5.inputName();
		System.out.println("Put birhyear: ");
		person5.inputAge();
		person5.changeName();
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();


		
	}
}

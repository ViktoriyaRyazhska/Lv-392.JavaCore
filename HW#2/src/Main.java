
public class Main {
	
	public static void main(String[] args) {
		
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
		
		System.out.println("Put name for Person5: ");
		Person person5 = new Person();
		person5.inputName();
		System.out.println("Put birth year for Person5: ");
		person5.inputAge();
		
		System.out.println("Person1: " +person1);
		System.out.println("Person2: " +person2);
		System.out.println("Person3: " +person3);
		System.out.println("Person4: " +person4);
		System.out.println("Person5: " +person5);
		
	}
}

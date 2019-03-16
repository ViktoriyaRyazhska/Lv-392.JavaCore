package task2;

public class Dog {
	
	private String name;
	private Breed breed;
	private int age;
	
	public Dog (String name, Breed breed, int age) {
		this.age = age;
		this.breed = breed;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	public void output() {
		System.out.println("Name: " +name+ " | Breed: " +breed+ " | Age: " +age);
	}
}

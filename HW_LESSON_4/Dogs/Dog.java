
public class Dog {
	private String name;
	private int age;
	private Breed breed;
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	 public String toString() {
		return ("Dogs are " + name +  breed +  age);} 
	
	
}

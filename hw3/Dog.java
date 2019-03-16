package ua.edu.softserve.homework.hw3;

public class Dog {

	private String name;
	private int age;
	DogBreed Breed;

	public Dog(String name, int age, DogBreed breed) {
		super();
		this.name = name;
		this.age = age;
		Breed = breed;
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

	public void setBreed(DogBreed breed) {
		Breed = breed;
	}

	public DogBreed getBreed() {
		return Breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", Breed=" + Breed + "]";
	}

	public static Dog oldestDog(Dog old, Dog young) {
		return (old.getAge() >= young.getAge()) ? old : young;
	}

	public static void main(String[] args) {

		Dog dog1 = new Dog("Betty", 1, DogBreed.SiberianHusky);
		Dog dog2 = new Dog("Bernard", 3, DogBreed.GermanShepherd);
		Dog dog3 = new Dog("Admiral", 5, DogBreed.Boxer);

		System.out.println(Dog.oldestDog(Dog.oldestDog(dog1, dog2), dog3).getName()
				+ " is the oldest dog and his breed is: " + Dog.oldestDog(Dog.oldestDog(dog1, dog2), dog3).getBreed());

	}

}

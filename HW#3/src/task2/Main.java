package task2;


public class Main {

	public static void main(String[] args) {
		
		
		Breed akit = Breed.AKITA;
		Breed corg = Breed.CORGI;
		Breed saint = Breed.SAINTBERNARD; 
		
		Dog dog1 = new Dog("Hatiko", akit, 2);
		Dog dog2 = new Dog("Beethoven", saint, 12);
		Dog dog3 = new Dog("Whisky", corg, 18);
		
		dog1.output();
		dog2.output();
		dog3.output();
		
		
		System.out.println("Oldest dog: " +Dog.oldestDog(Dog.oldestDog(dog1, dog2), dog3).getName());
		
		if(dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName() == dog3.getName()) {
			System.out.println("There are dogs with equals names!");
		}
		else {
			System.out.println("All names are unique :)");
		}
				
	}

}

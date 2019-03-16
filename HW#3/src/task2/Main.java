package task2;

public class Main {

	public static void main(String[] args) {
		
		
		Breed akit = Breed.AKITA;
		Breed corg = Breed.CORGI;
		Breed saint = Breed.SAINTBERNARD; 
		
		Dog dog1 = new Dog("Hatiko", akit, 9);
		Dog dog2 = new Dog("Beethoven", saint, 12);
		Dog dog3 = new Dog("Whisky", corg, 18);
		
		dog1.output();
		dog2.output();
		dog3.output();
		
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println(dog1.getName()+ " is the oldest dog ever!");
		}
		else if(dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			System.out.println(dog2.getName()+ " is the oldest dog ever!");
		}
		else {
			System.out.println(dog3.getName()+ " is the oldest dog ever!");
		}
		
		if(dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName() == dog3.getName()) {
			System.out.println("There are dogs with equals names!");
		}
		else {
			System.out.println("All names are unique :)");
		}
				
	}

}

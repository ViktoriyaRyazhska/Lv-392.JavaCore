

public class MainDog {

	public static void main(String[] args) {
		Dog D1 = new Dog ("Dina", Breed.LABRADOR, 3);
		Dog D2 = new Dog ("Bonya", Breed.JACKRASSEL, 4);
		Dog D3 = new Dog ("Balu", Breed.TAKSA,5);
		
			if (D1.getName().equals(D2.getName()) || D1.getName().equals(D3.getName())||D2.getName().equals(D3.getName())) {
	            System.out.println("There are dogs with the same name ");}
	        else
	            System.out.println("There are no dogs with the same name");
	        
			if(D1.getAge() > D2.getAge() && D1.getAge() > D3.getAge()) {
				System.out.println(D1.getName()+ " is the oldest dog, kind "+ D1.getBreed());
			}
			else if(D2.getAge() > D1.getAge() && D2.getAge() > D3.getAge()) {
				System.out.println(D2.getName()+ " is the oldest dog, kind "+ D2.getBreed());
			}
			else {
				System.out.println(D3.getName()+ " is the oldest dog, kind "+D3.getBreed());
			
	}

	}
}
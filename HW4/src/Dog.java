
public class Dog {
	private String name;
	private String breed;
	private int age;
	
	public enum Beerd {
		BOXER, DOBERMAN, PUG, POODLE;
	}
	private Beerd beerd;
	
	public Beerd getBeerd() {
		return beerd;
	}
	public void setBeerd(Beerd beerd){
        this.beerd = beerd;
    }   
	

    public String getBreed() {
	    return breed;
    }
    public void setBreed(String breed) {
	    this.breed = breed;
    }
	
	public Dog() {	
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return name+" "+ beerd +" "+age+" ";
	}
	public static Dog oldestDog(Dog old, Dog young) {
		if (old.getAge() > young.getAge()) {
			return old;
		} else {
			return young;
		}
	}
	public static void main(String[] args) {
		Dog dog1 = new Dog("Rex", 7);
		dog1.setBeerd(Dog.Beerd.DOBERMAN);
		Dog dog2 = new Dog("Lusya",   4);
		dog2.setBeerd(Dog.Beerd.DOBERMAN);
		Dog dog3 = new Dog("Lord",  3);
		dog3.setBeerd(Dog.Beerd.PUG);
		
		System.out.println(dog1.toString().equals(dog2.toString()));
		System.out.println(dog1.toString().equals(dog3.toString()));
		System.out.println(dog2.toString().equals(dog3.toString()));
		
		System.out.println("The oldest Dog is "+Dog.oldestDog(Dog.oldestDog(dog1, dog2),dog3).getName());

	
	}
}

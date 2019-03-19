public class Dog {
	private String name;
	private int age;
	DBreed breed;
	public enum DBreed {
		Taxa, Chihuahua, Pug;
	}
	public Dog(String name, int age, DBreed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
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
	public String toString() {
		return "Dog (name" + name + ", age" + age + ", Breed" + breed + ")";
	}
	public DBreed getBreed() {
		return breed;
	}
	public void setBreed(DBreed breed){
       this.breed = breed;
	}
	public static Dog theOldest(Dog youngest, Dog oldest) {
		if (oldest.getAge() > youngest.getAge()) {
			return oldest;
		}
		return youngest;
	}
	public static void main(String[] args) {
		Dog d1 = new Dog("Pushok",2,DBreed.Taxa);
		Dog d2 = new Dog("Druzhok",9,DBreed.Pug);
		Dog d3 = new Dog("Musia",1,DBreed.Chihuahua);
		System.out.println(d1.equals(d3));
		System.out.println(d2.equals(d1));
		System.out.println(d3.equals(d2));
		System.out.println("The oldest is "+Dog.theOldest(Dog.theOldest(d1,d2),d3).getName()
		 +" the kind "+Dog.theOldest(Dog.theOldest(d1,d2),d3).getBreed());
	}
}
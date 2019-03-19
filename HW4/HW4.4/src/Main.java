public class Main {

	public static void main(String[] args) {
		Dog d1=new Dog("Psina",10,dogBreed.DOBERMAN);
		Dog d2=new Dog("Sirko",8,dogBreed.LAIKA);
		Dog d3=new Dog("Dog",2,dogBreed.LABRADOR);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("-----------------------------------------------------------------------------------------");
		
		if(d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
			System.out.println(d1.getName()+ " is the oldest "+d1.getBreed());
		}
		else if(d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
			System.out.println(d2.getName()+ " is the oldest "+d2.getBreed());
		}
		else {
			System.out.println(d3.getName()+ " is the oldest "+d3.getBreed());
		}
	
		if(d1.getName().equals(d2.getName())||d1.getName().equals(d3.getName())||d2.getName().equals(d3.getName()))
				{
			System.out.println("error");
				}

		

	}

}

public class Dog {
private String name;
private int age;
dogBreed Breed;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public dogBreed getBreed() {
	return Breed;
}
public void setBreed(dogBreed breed) {
	Breed = breed;
}
public Dog(String name, int age,dogBreed breed)
{
	this.name=name;
	this.age=age;
	Breed=breed;
}
@Override
public String toString()
{
	return "Dog - "+name+" Age - "+age+" Breed - "+Breed+"";
}

}



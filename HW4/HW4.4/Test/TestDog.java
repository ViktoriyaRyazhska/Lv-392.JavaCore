import static org.junit.Assert.*;

import org.junit.Test;

public class TestDog {
private Dog dog1=new Dog("Cheburek",2,dogBreed.SPITZ);

@Test
public void testGetName()
{
	assertEquals("Cheburek",dog1.getName());
}
@Test
public void testSetName()
{
	String name="Dog";
	dog1.setName(name);
	assertEquals(name, dog1.getName());
}
@Test
public void testGet()
{
	assertEquals(2, dog1.getAge());
}
@Test
public void testSetAge() {
int age=5;
dog1.setAge(age);
assertEquals(age, dog1.getAge());
}
@Test
public void testGetBreed() {
	assertEquals(dogBreed.SPITZ, dog1.getBreed());
}

@Test
public void testSetBreed() {
	dog1.setBreed(dogBreed.BULDOG);
	
	assertEquals(dogBreed.BULDOG, dog1.getBreed());
}
}
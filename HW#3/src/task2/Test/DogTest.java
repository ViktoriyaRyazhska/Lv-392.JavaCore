package task2.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import task2.Breed;
import task2.Dog;

public class DogTest {
	
	private Dog dog1 = new Dog("Hatiko", Breed.AKITA, 9);
	private Dog dog2 = new Dog("Beethoven", Breed.SAINTBERNARD, 12);

	@Test
	public void testGetName() {
		assertEquals("Hatiko", dog1.getName());
	}

	@Test
	public void testSetName() {
		String name = "KeK";
		dog1.setName(name);
		assertEquals(name, dog1.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(12, dog2.getAge());
	}

	@Test
	public void testSetAge() {
		int age = 9;
		dog1.setAge(age);
		assertEquals(9, dog1.getAge());
	}

	@Test
	public void testGetBreed() {
		assertEquals(Breed.SAINTBERNARD, dog2.getBreed());
	}

	@Test
	public void testSetBreed() {
		dog2.setBreed(Breed.CORGI);
		
		assertEquals(Breed.CORGI, dog2.getBreed());
	}

	@Test
	public void testOutput() {
		assertEquals("Name: " +dog1.getName()+ " | Breed: " +dog1.getBreed()+ " | Age: " +dog1.getAge(), dog1.toString());
	}

}

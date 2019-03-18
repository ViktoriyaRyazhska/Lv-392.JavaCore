package homework3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    private Dog d1 = new Dog("Baxter", Breeds.SiberianHuskies, 12);
    private Dog d2 = new Dog("Baxter", Breeds.SiberianHuskies, 12);

    @Test
    public void getName() {
        assertEquals("Baxter", d1.getName());
    }

    @Test
    public void setName() {
        String name = "Rory";
        d1.setName(name);

        assertEquals(name, d1.getName());
    }

    @Test
    public void getBreed() {
        assertEquals(Breeds.SiberianHuskies, d1.getBreed());
    }

    @Test
    public void setBreed() {
        d1.setBreed(Breeds.Collie);

        assertEquals(Breeds.Collie, d1.getBreed());
    }

    @Test
    public void getAge() {
        assertEquals(12, d1.getAge());
    }

    @Test
    public void setAge() {
        int age = 2;
        d1.setAge(age);

        assertEquals(age, d1.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("Dog{name='Baxter', breed=SiberianHuskies, age=12}", d1.toString());
    }

    @Test
    public void equals() {
        assertEquals(d1, d2);
    }
}
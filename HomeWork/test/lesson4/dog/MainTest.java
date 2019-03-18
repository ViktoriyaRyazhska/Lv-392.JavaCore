package lesson4.dog;

import org.junit.Assert;
import org.junit.Test;
import ua.com.lozinska.lesson4.dog.Breed;
import ua.com.lozinska.lesson4.dog.Dog;
import ua.com.lozinska.lesson4.dog.Main;

public class MainTest {


    @Test
    public void checkNameDifferent() {
        Dog dog1 = new Dog("Phluphy", 3, Breed.BOXER);
        Dog dog2 = new Dog("Molly", 2, Breed.DALMATIAN);
        Dog dog3 = new Dog("Shally", 6, Breed.HUSKY);
        boolean result = Main.checkName(dog1, dog2, dog3);
        Assert.assertFalse(result);

    }
    @Test
    public void checkNameSame() {
        Dog dog1 = new Dog("Phluphy", 3, Breed.BOXER);
        Dog dog2 = new Dog("Shally", 2, Breed.DALMATIAN);
        Dog dog3 = new Dog("Shally", 6, Breed.HUSKY);
        boolean result = Main.checkName(dog1, dog2, dog3);
        Assert.assertTrue(result);

    }

    @Test
    public void oldestDog() {
        Dog dog1 = new Dog("Phluphy", 3, Breed.BOXER);
        Dog dog2 = new Dog("Molly", 2, Breed.DALMATIAN);
        Dog dog3 = new Dog("Shally", 6, Breed.HUSKY);
        int result = Main.oldestDog(dog1, dog2, dog3);
        Assert.assertEquals(6, result);
    }
}

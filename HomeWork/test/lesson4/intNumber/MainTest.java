package lesson4.intNumber;

import org.junit.Assert;
import org.junit.Test;
import ua.com.lozinska.lesson4.intNumber.Main;


public class MainTest {

    @Test
    public void maxNumber() {
        int num1 = 2;
        int num2 = 6;
        int num3 = 4;
        int result = Main.maxNumber(num1, num2, num3);
        Assert.assertEquals(6, result);
    }

    @Test
    public void minNumber() {
        int num1 = 2;
        int num2 = 6;
        int num3 = 4;
        int result = Main.minNumber(num1, num2, num3);
        Assert.assertEquals(2, result);
    }
}

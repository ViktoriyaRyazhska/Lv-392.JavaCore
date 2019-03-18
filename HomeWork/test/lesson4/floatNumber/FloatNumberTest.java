package lesson4.floatNumber;

import org.junit.Assert;
import org.junit.Test;
import ua.com.lozinska.lesson4.floatNumbers.FloatNumber;

public class FloatNumberTest {

    @Test
    public void checkNumberTrue() {
        float num1 = (float) 2.3;
        float num2 = (float) -3.02;
        float num3 = (float) 1.25;
        boolean result = FloatNumber.checkNumber(num1, num2, num3);
        Assert.assertTrue(result);

    }

    @Test
    public void checkNumberFalse() {
        float num1 = (float) 12.3;
        float num2 = (float) -3.02;
        float num3 = (float) 1.25;
        boolean result = FloatNumber.checkNumber(num1, num2, num3);
        Assert.assertFalse(result);

    }
}

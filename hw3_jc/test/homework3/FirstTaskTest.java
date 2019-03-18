package homework3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTaskTest {
    private FirstTask task = new FirstTask();

    @Test
    public void rangeNumbers() {
        assertEquals("All numbers are in range [-5;5].", task.rangeNumbers(1.1, 2.2, 3.3));
        assertEquals("Not all numbers are in range [-5;5].", task.rangeNumbers(5.1, -4.2, 10.3));
        assertEquals("All numbers are in range [-5;5].", task.rangeNumbers(5.0, -5.0, 0));
        assertNotEquals("All numbers are in range [-5;5].", task.rangeNumbers(5.1, -4.2, 3.3));
    }

    @Test
    public void minMaxNumber() {
        assertEquals("Max number = 33, min number = 2.", task.minMaxNumber(2, 33,7));
        assertNotEquals("Max number = 33, min number = 2.", task.minMaxNumber(1, 2, 3));
    }

    @Test
    public void httpErrors() {
        assertEquals("NOT_FOUND", task.httpErrors(404));
        assertEquals("No this error", task.httpErrors(3));
        assertNotEquals("NOT_FOUND", task.httpErrors(401));
    }
}
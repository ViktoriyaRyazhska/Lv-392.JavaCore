import static org.junit.Assert.*;

import org.junit.Test;

public class testMain {
@Test
public void testCheck() {
	int a=3;
	int b=20;
	
	assertEquals(true, Main.check(a));
	assertEquals(false, Main.check(b));
	}
}

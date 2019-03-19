import static org.junit.Assert.*;

import org.junit.Test;

public class testMain {
@Test
public void testCheckMax()
{
	int a=2;
	int b=4;
	int c=20;
	int max=0;
	max=Main.checkMax(a, b, c);
	assertEquals(20, max);	
}
@Test
public void testCheckMin()
{
	int a=2;
	int b=4;
	int c=20;
	int min=0;
	min=Main.checkMin(a, b, c);
	assertEquals(2, min);	
}

}

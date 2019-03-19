import static org.junit.Assert.*;

import org.junit.Test;

public class testMain {

	@Test
	public void testChoice() {
		int num=400;
		HTTPError res=Main.choice(num);
		assertEquals(HTTPError.BadRequest,res);
	
	}

}

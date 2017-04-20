import static org.junit.Assert.*;

import org.junit.Test;



/*With this exercise I learned the importance of using MVC projects, because for 
 *unit tests the difficulty increases when the models classes are containing views*/

public class Tester {

	@Test
	public void testVerifyCoordinate() {
		Rover rover = new Rover();
	
		assertEquals('M', rover.verifyCoordinate("mmm"));
		assertNotEquals("k", rover.verifyCoordinate("klns"));	
		
	}
	
	@Test
	public void testSetCodeOrientation(){
		Rover rover = new Rover();
		
		assertEquals(true, rover.setCodeOrientation('C'));
		
		assertNotEquals(false, rover.setCodeOrientation('N'));
		
	}
}
package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void PositiveCase() {
		JunitTesting test = new JunitTesting();
		double output= test.divide(6,2);
		assertEquals(3,output);
		
		
	}
	
	@Test
	void NegativeCase() {
		JunitTesting test = new JunitTesting();
		double output= test.divide(5,2);
		assertEquals(3,output);
		
		
	}

}

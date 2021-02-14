package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(2,3));	
	}
	@Test
	public void testSub() {
		//fail("Not yet implemented");
	
		Calculator c=new Calculator();
		assertEquals(20,c.sub(100,80));}
	}



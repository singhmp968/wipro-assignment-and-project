package JUnitTet;

import static org.junit.Assert.*;

import org.junit.Test;

import SupportClass.SBAccount;

public class SBAccountTest {
SBAccount sb = new SBAccount();
	@Test
	public void testCalculateIntrest() {
		//fail("Not yet implemented");
		sb.setAmount(10000.0);
		assertEquals(40.0,sb.calculateIntrest(), 0.0);	
	}

	@Test
	public void testSetIntrate() {
		//fail("Not yet implemented");
		sb.setIntrate(5);	
	assertEquals(5,sb.getIntrate(),0);
	}

//	@Test
//	public void testGetIntrate() {
//		//fail("Not yet implemented");
//
//	}

	@Test
	public void testSetAmount() {
		//fail("Not yet implemented");
		sb.setAmount(10000.0);
	assertEquals(10000.0,sb.getAmount(),0.0);
	
	}

//	@Test
//	public void testGetAmount() {
//	//	fail("Not yet implemented");
//	
//	
//	}

	//@Test
//	public void testGetTypeOfAcc() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetTypeOfAcc() {
//		fail("Not yet implemented");
//	}
//
}

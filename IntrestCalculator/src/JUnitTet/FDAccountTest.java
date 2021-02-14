package JUnitTet;

import static org.junit.Assert.*;

import org.junit.Test;

import SupportClass.FDAccount;

public class FDAccountTest {
private FDAccount fd=new FDAccount();
	@Test
	public void testCalculateIntrest() {
	//	fail("Not yet implemented");
fd.setDays(10);
fd.setAge(65);
fd.setAmt(10000.00);
assertEquals(500,fd.calculateIntrest(),0.0);
	
	}

//	@Test
//	public void testGetAge() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetAge() {
		//fail("Not yet implemented");
	fd.setAge(65);
	assertEquals(65,fd.getAge());
	
	}

	@Test
	public void testSetDays() {
	//	fail("Not yet implemented");
	fd.setDays(10);
	assertEquals(10,fd.getDay());
	}

//	@Test
//	public void testGetDay() {
//	//	fail("Not yet implemented");
//	
//	
//	}

//	@Test
//	public void testGetAmt() {
//	//	fail("Not yet implemented");
////fd.getAmt();
//
//	}

	@Test
	public void testSetAmt() {
		//fail("Not yet implemented");
	
	fd.setAmt(10000.00);
	assertEquals(10000.00,fd.getAmt(),0.0);
	}

}

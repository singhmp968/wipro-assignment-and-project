package JUnitTet;

import static org.junit.Assert.*;

import org.junit.Test;

import SupportClass.RDintrest;

public class RDintrestTest {
	
private RDintrest rd=new RDintrest();
	@Test
	public void testCalculateIntrest() {
		//fail("Not yet implemented");
	
	rd.setageACHol(65);
	rd.setamt(1000.0);
	rd.setNomOfmon(6);
	assertEquals(800.0,rd.calculateIntrest(),0.0);
	}

	@Test
	public void testSetamt() {
	//	fail("Not yet implemented");
	rd.setamt(1000.00);
	assertEquals(1000.00,rd.getamt(),00);
	}

//	@Test
//	public void testGetamt() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetNomOfmon() {
		//fail("Not yet implemented");
	rd.setNomOfmon(6);
	assertEquals(6,rd.getNomOfmon());
	}

//	@Test
//	public void testGetNomOfmon() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetmonthlyAmount() {
		//fail("Not yet implemented");
	rd.setmonthlyAmount(500.00);
	assertEquals(500,rd.getmonthlyAmount(),00);
	}

//	@Test
//	public void testGetmonthlyAmount() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetageACHol() {
//		fail("Not yet implemented");
	rd.setageACHol(65);
	assertEquals(65,rd.getageAVHol());
	}

//	@Test
//	public void testGetageAVHol() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testGetInterestRate() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetInterestRate() {
		//fail("Not yet implemented");
rd.setInterestRate(5);
assertEquals(5,rd.getInterestRate(),00);
	
	}

}

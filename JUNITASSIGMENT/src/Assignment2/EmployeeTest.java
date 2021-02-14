package Assignment2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	Employee s=new Employee();
	
	@Test
	public void testFindName() {
		//fail("Not yet implemented");
		
		ArrayList<String> li=new ArrayList<>();
		li.add("rahu");
		li.add("ketu");
	
	assertEquals("found", s.findName(li,"rahu"));
	
	
	}

}

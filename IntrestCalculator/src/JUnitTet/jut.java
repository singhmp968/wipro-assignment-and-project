package JUnitTet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

import org.junit.Test;
@RunWith(Suite.class)
@Suite.SuiteClasses({
FDAccountTest.class,
RDintrestTest.class,
SBAccountTest.class
})
public class jut {

	
	

	public void test() {
		//fail("Not yet implemented");
	}

}

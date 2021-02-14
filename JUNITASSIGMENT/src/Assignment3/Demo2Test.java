package Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {
Demo2 d=new Demo2();
	@Test
	public void testPalindrome() {
		
	assertTrue("result",d.palindrome("malam"));
	assertTrue("result",d.palindrome("101"));
	assertFalse("result",d.palindrome("yavav"));
	}

}

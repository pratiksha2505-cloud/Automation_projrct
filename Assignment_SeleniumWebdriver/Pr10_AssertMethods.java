//W.a.junit program to handled Assert class with all method to check its 
//pass or fail
package Assignment_SeleniumWebdriver;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class Pr10_AssertMethods {
	//1. assertEquals
	@Test
	public void testAssertEqualsPass()
	{
		int expected=10;
		int actual=10;
		assertEquals(expected, actual);
	}
	@Test
	public void testAssertEqualsFail()
	{
		int expected=10;
		int actual=20;
		assertEquals(expected, actual);
	}
	
	// 2. assertNotEquals()
	
	@Test
	public void testAssertNotEqualsPass()
	{
		int expected=10;
		int actual=20;
		assertNotEquals(expected, actual);
	}
	
	//3. assertTrue()
	@Test
	public void testAssertTruePass()
	{
		assertTrue(10>5);
	}
	@Test
	public void testAssertTrueFail()
	{
		assertTrue(10<5);
	}
	
	//4. assertFalse()
	@Test
	public void testAssertFalsePass()
	{
		assertFalse(10<5);
	}
	
	@Test
	public void testAssertFalseFail()
	{
		assertFalse(10>5);
	}
	
	//5. assertNull
	@Test
	public void testAssertNullPass()
	{
		String name=null;
		assertNull(name);
	}
	
	@Test
	public void testAssertNullFail()
	{
		String name="Hitanshi";
		assertNull(name);
	}
	
	//6. assertNotNull()
	@Test
	public void testAssertNotNullPass()
	{
		String name="JAVA";
		assertNotNull(name);
	}
	
	//7. assertSame()
	@Test
	public void testAssertSamePass()
	{
		String s1="Python";
		String s2=s1;
		
		assertSame(s1, s2);
	}
	
	//8. assertNotSame
	@Test
	public void testAssertNotSamePass()
	{
		String s1="JAVA";
		String s2="PHP";
		
		assertNotSame(s1, s2);
	}
	
	//9. fail
	@Test
	public void testFailMethod()
	{
		fail("This test is intentionally failed.");
	}
}

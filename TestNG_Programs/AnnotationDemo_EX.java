package TestNG_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationDemo_EX {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite..");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Befor Class Logic.");
	}
	@BeforeMethod
	public void boforeMethod()
	{
		System.out.println("Before Method Logic!");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test !");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Logic!");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Logic..");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite..");
	}
}

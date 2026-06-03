package TestNG_Programs;

import org.testng.annotations.Test;

public class Priority_Test_Ex {

	@Test(priority=1)
	public void login()
	{
		System.out.println("Login Event Done..");
	}
	
	@Test(priority=2)
	public void search()
	{
		System.out.println("Search Event Done..");
	}
	
	@Test (priority =3 )
	public void logout()
	{
		System.out.println("Logout Event Done..");
	}
}

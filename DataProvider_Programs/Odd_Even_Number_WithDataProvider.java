//Use @DataProvider to test even and odd number validation
package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Odd_Even_Number_WithDataProvider {
	@DataProvider(name="numbers")
	public Object[] number()
	{
		return new Object[]{10,11,3,56,70,1001,1230,45,79};
	}
	
	@Test(dataProvider = "numbers")
	public void Test_Odd_Even_Numbers(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" is even number.");
		}
		else
		{
			System.out.println(a+" is odd number.");
		}
	}
}

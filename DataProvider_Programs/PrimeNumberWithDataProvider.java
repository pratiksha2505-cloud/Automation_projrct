//Create a prime number checking test using multiple inputs from @DataProvider.
package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeNumberWithDataProvider {
	@DataProvider(name="numbers")
	public Object[] data()
	{
		return new Object[]{100,11,13,24,17,19,75,30,7,71};
	}
	
	@Test(dataProvider = "numbers")
	public void TestPrimeNumber(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				count++;
			if(count>2)
				break;
		}
		if(count==2)
			System.out.println(a+" is a Prime Number.");
		else
			System.out.println(a+" is not a Prime Number");
		
	}

}

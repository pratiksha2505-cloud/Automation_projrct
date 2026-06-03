package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo_Ex {
	@DataProvider(name="numbers")
	public Object[][] data()
	{
		return new Object[][] {
			{100,200},
			{10,30},
			{200,300}
		};
	}
	@Test(dataProvider = "numbers")
	public void Addition(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	@Test(dataProvider = "numbers")
	public void Subtraction(int a,int b)
	{
		System.out.println("Subtraction : "+(a-b));
	}
}

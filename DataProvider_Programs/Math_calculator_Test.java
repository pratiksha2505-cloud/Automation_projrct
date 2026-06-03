package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Math_calculator_Test {
@DataProvider(name ="numbers")
public Object[][] myData()
{
	return new Object[][]
			{
		{25.30,21.25},
		{4.56,7.90},
		{12.45,60.45}
		
			};
}
@Test(dataProvider = "numbers")
public void Addition(Double a,Double b)
{
	System.out.println("Addition : "+(a+b));
}

@Test(dataProvider = "numbers")
public void Multiplication(Double a,Double b)
{
	System.out.println("Multiplication : "+(a*b));
}

@Test(dataProvider = "numbers")
public void Subtraction(Double a,Double b)
{
	System.out.println("Subtraction : "+(a-b));
}

}

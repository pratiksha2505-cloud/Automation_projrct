package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Age_Validation_For_Election_Ex {
	
	@DataProvider (name="Age")
	public Object[][] AgeData()
	{
		return new Object[][] {
			{"Pratiksha",34},
			{"Himanshi",11},
			{"Palak",23},
			{"Hiral",32},
			{"Vyom",17},
			{"Dipanki",16}
};
	}
	
	@Test(dataProvider = "Age")
	public void validateAge(String name,int age)
	{
		if(age<18)
			System.out.println(name + " is not elegible for voting.");
		else
			System.out.println(name + " is eligible for voting.");
	}
}

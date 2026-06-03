
//Pass different mobile numbers and validate their length.
package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidateMobileNo_Program {
	@DataProvider(name="mobile_numbers")
	public Object[][] mobiledata()
	{
		return new Object[][]
		{
			{"9876543210"},
            {"98765432"},
            {"9988776655"},
            {"123456789012"},
            {"9080706050"},
            {"5467567890"},
            {"AB2324444"}
		};
	}
	
	@Test(dataProvider = "mobile_numbers")
	public void validateMobileNo(String m_no)
	{
		System.out.println("--------------------------------------------");
		System.out.println("Mobile No : "+m_no);
		if(m_no.matches("[6-9][0-9]{9}"))
		{
			System.out.println("STATUS : Valid Mobile Number.");
		}
		else
		{
			System.out.println("STATUS : Invalid Mobile Number.");
		}
	}
}

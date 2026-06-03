/*
 * w.a. TestNG  program to create dataprovider. //here we are taking sample website rather thN FACEBOOK
 */
package Assignment_SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pr18_dataProviderLoginTest {
	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
}

@DataProvider(name="loginData")
public Object[][] LoginData()
{
	return new Object[][] {
		{"student","Password123"},
		{"incorrectUser","Password123"},
		{"student","incorrectPassword"}
	};
}
@Test(dataProvider = "loginData")
public void loginTest(String username,String password)
{
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("submit")).click();
	if(driver.getCurrentUrl().contains("logged-in"))
	{
		System.out.println("Login Successful for username : "+username);
		driver.navigate().back();
	}
	else
	{
		System.out.println("Can't login for username : "+username);
	}
	
}

@AfterTest
public void close()
{
	driver.close();
}
}

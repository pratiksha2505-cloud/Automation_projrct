/*
 * W.a. TestNG program to check gmail login using with 
@beforetest,@aftertest,@Test (Here I am taking test automation website other than Gamil..
https://practicetestautomation.com/practice-test-login/
 */
package Assignment_SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pr15_testngGmailLogin {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
}

//positive test
@Test(priority=1)
public void positiveLoginTest()
{
	driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.id("submit")).click();
	
	if(driver.getCurrentUrl().contains("logged-in"))
	{
		System.out.println("Login Successful for username : student");
	}
	else
	{
		System.out.println("Can't login for username : student");
	}
	driver.navigate().back();
}

@Test(priority=2)
public void NegativeUsernameTest()
{
	String username="incorrectUser";
	String password="Password123";
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("submit")).click();
	if(driver.getCurrentUrl().contains("logged-in"))
	{
		System.out.println("Login Successful for username : "+username);
	}
	else
	{
		System.out.println("Can't login for username : "+username);
	}
	//driver.navigate().back();
}
@Test(priority=3)
public void  NegativePasswordTest()
{
	String username="student";
	String password="incorrectPassword";
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("submit")).click();
	if(driver.getCurrentUrl().contains("logged-in"))
	{
		System.out.println("Login Successful for username : "+username);
	}
	else
	{
		System.out.println("Can't login for username : "+username);
	}
}

@AfterTest
public void close()
{
	driver.quit();
}
}

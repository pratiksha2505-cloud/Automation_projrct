package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pr17_testngGroup_Ex {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
	}
	
	//Login Test Group
	@Test(groups="login")
	public void loginTest() throws InterruptedException
	{
		/*
		 * driver.findElement(By.linkText("Signup / Login")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("test123");
		 * driver.findElement(By.xpath("//button[@data-qa='login-button']")) .click();
		 */

		System.out.println("Login Test Executed.");
	}
	//Search Group
	@Test(groups="search")
	public void searchProductTest()
	{
		
		  driver.findElement(By.linkText("Products")).click();
		  driver.findElement(By.id("search_product")).sendKeys("Tshirt");
		  driver.findElement(By.id("submit_search")).click();
		 
		System.out.println("Search Product Test Executed");
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}

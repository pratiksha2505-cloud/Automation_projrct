/*
 * To validate the tops technologies website Contact us page and enter 
your friend detail at last “Guest Call Back” https://www.tops
int.com/contact-us/  
  1. To use assert  
  2. To use click and wait  
  3. To use locators  
  4. To use other command
 */
package Selenium_IDE_Programs;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Open Chrom Browser
		WebDriver driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url tops contact us page
		driver.get("https://www.tops-int.com/contact-us/");
		
		//Get Title of page
		String actualTitle=driver.getTitle();
		
		//Assertion of title
		String expectedTitle="Contact us";
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		System.out.println("Title Validated Successfully!");
		
		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		//Enter Name By using Name Locator
		driver.findElement(By.name("name")).sendKeys("Maulik");
		
		//Enter Email By using ID Locator
		driver.findElement(By.id("inq_email")).sendKeys("maulik@gmail.com");
		
		//Locate Phone No using css_selector
		driver.findElement(By.cssSelector("input[name='contact']")).sendKeys("9879235004");
		
		//Other Commands
		//getCurrentURL
		System.out.println("Current URL : "+driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println("Page Source Length : "+driver.getPageSource().length());
		
		//isDisabled
		System.out.println("Submit button disabled : "+driver.findElement(By.linkText("Send Inquiry")).isDisplayed());
		
		//isEnabled
		System.out.println("Submit button enabled : "+driver.findElement(By.linkText("Send Inquiry")).isEnabled());
		
		// ====== Click and Wait ======

		WebElement submitBtn = driver.findElement(By.linkText("Send Inquiry"));

		submitBtn.click();

		System.out.println("Form Submitted Successfully");

		// Wait after click
		Thread.sleep(3000);
		
		driver.close();
	}

}

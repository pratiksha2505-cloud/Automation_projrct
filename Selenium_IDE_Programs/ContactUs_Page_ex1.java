/*To validate the tops technologies website Contact us page and enter 
your friend detail at last “Guest Call Back” https://www.tops
int.com/contact-us/
*/
package Selenium_IDE_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs_Page_ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//Implicitetly wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		//open website
		driver.get("https://www.tops-int.com/contact-us/");
		//validate title
		String title=driver.getTitle();
		if(title.contains("Contact"))
		{
			System.out.println("Contact us page open successfully!");
		}
		else
		{
			System.out.println("Page Validation Failed.");
		}
		Thread.sleep(1000);
		// Scroll Down to Guest Call Back Form
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(2000);
		//Enter Friend Name
		driver.findElement(By.id("inq_name")).sendKeys("Pratiksha Shah");
		//Enter Email Id
		driver.findElement(By.id("inq_email")).sendKeys("pratiksha2505@gmail.com");
		//Enter Phone No
		driver.findElement(By.id("inq_contact")).sendKeys("9979336595");
		//Submit Friend Data
		driver.findElement(By.linkText("Send Inquiry")).click();
		System.out.println("Guest Call Back Form Submitted");
		Thread.sleep(3000);
		//Close the Driver for closing page..
		driver.close();
		
		
		
	}

}

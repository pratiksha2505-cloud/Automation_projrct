/*
 * W.a. TestNG program to use parameterized demo with multiple 
parameter of Facebook login with TestNG. 
 */
package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pr16ParameterdFacebooklogin {

	WebDriver driver;
	@Test
	@Parameters({"email","pass"})
	public void loginTest(String email,String pass) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		System.out.println("Login test passed.");
		driver.quit();
	}
}

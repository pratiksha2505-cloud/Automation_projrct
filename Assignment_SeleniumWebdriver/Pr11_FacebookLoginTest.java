//W.a. junit program to perform test with webdriver to login process of facebook
package Assignment_SeleniumWebdriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pr11_FacebookLoginTest {
	WebDriver driver;
@BeforeEach
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
}
@Test
public void testLogin()
{
	driver.findElement(By.name("email")).sendKeys("pratik1235@gmail.com");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("prm@&123");
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	System.out.println("Login Test Done.");
}
@AfterEach
public void PageDown()
{
	driver.quit();
}
	
}

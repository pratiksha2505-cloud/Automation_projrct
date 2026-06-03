package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Pr14_FBLoginTestng {
WebDriver driver;
@BeforeTest
public void openLoginPage()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}
@Test
public void loginTest()
{
	driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("test@&123");
	driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click();
	
	System.out.println("Login Test Successfully.");
}

@AfterTest
public void closePage()
{
	driver.close();
}
}

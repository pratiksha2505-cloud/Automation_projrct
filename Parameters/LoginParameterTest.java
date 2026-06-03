package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginParameterTest {
WebDriver driver;
@Parameters({"url","username","password"})
@Test
public void loginTest(String url,String uname,String pass)
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("submit")).click();
	System.out.println("Login Test Passed.");
	driver.quit();
}
}

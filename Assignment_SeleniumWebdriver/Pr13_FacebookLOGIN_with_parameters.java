/*
 * W.a. junit program to use parameterized demo with multiple 
parameter of Facebook login in junit. 
 */
package Assignment_SeleniumWebdriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr13_FacebookLOGIN_with_parameters {
WebDriver driver;
String username;
String password;
public Pr13_FacebookLOGIN_with_parameters(String username, String password) {
	//super();
	this.username = username;
	this.password = password;
}

@BeforeEach
public void setup() {

	//System.setProperty("webdriver.chrome.driver",
		//	"C:\\chromedriver\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
}

@ParameterizedTest
@CsvSource(
	{

		"pratiksha2505@gmail.com, Pmshah@&2505",
		"demo@gmail.com, demo123",
		"abc@gmail.com, abc123",
		"wrong@gmail.com, wrong123"

	})
public void facebookLogin(String username, String password)
		throws InterruptedException {


	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
	driver.findElement(By.xpath("//span[text()='Log in']")).click();

	Thread.sleep(3000);

	System.out.println("Login checked with : "
			+ username + " | " + password);
}

@AfterEach
public void closeBrowser()
{
	driver.close();
}


}

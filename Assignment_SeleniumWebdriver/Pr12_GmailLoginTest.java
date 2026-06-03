//W.a. junit program to check gmail login using with 
//@before,@after,@Test 
package Assignment_SeleniumWebdriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pr12_GmailLoginTest {
	WebDriver driver;
@BeforeEach
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/");
}

@org.junit.jupiter.api.Test
public void login() throws InterruptedException
{
	// Enter email
    driver.findElement(By.cssSelector("input[type='email']"))
          .sendKeys("pratiksha2505@gmail.com");

    // Click Next button
    driver.findElement(By.xpath("//span[text()='Next']"))
          .click();

    
    //Thread.sleep(3000);
//driver.getWindowHandle();
   // driver.navigate().forward();
    // Enter password
    WebDriverWait wait = new WebDriverWait(driver, null);
    WebElement element = wait.until(
    		ExpectedConditions.visibilityOfElementLocated(By.name("Passwd"))
    		);

    driver.findElement(By.name("Passwd"))
          .sendKeys("prati123");

    // Click Next button
    driver.findElement(By.xpath("//span[text()='Next']"))
          .click();

    Thread.sleep(5000);

    System.out.println("Gmail Login Test Executed");
}

@AfterEach
public void testDown()
{
	driver.quit();
}
}

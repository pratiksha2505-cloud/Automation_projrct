package locators_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LoginPageEx {

	void TestLoginButton(WebDriver driver) throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.className("radius"));
		submit.click();
		Thread.sleep(3000);
		
	}
	
	void TestLink(WebDriver driver) throws InterruptedException
	{
		WebElement link=driver.findElement(By.linkText("Elemental Selenium"));
		link.click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	void TestTAgline(WebDriver driver)
	{
		 String heading=driver.findElement(By.tagName("h2")).getText();
		 System.out.println(heading); 
		 if(heading.equals("Login Page")) 
		 {
			 System.out.println("heading text is proper"); 
		 } 
		 else 
		 {
			 System.out.println("heading text is not as expected"); 
		 }
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Locator_LoginPageEx l=new Locator_LoginPageEx();
		l.TestLoginButton(driver);
		
		l.TestTAgline(driver);
		
		l.TestLink(driver);
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}

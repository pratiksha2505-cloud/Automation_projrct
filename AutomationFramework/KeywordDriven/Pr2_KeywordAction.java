package AutomationFramework.KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr2_KeywordAction {
	String username="pratiksha2505@gmail.com";
	String password="Test%&123456";
	WebDriver driver;
	public void waitTime() 
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void EnterURL()
	{
		driver.get("https://practice.automationtesting.in/");
		waitTime();
	}
	public void ClickSignIn()
	{
		driver.findElement(By.linkText("My Account")).click();
		waitTime();
	}
	public void EnterEmail()
	{
		driver.findElement(By.id("username")).sendKeys(username);
		waitTime();
	}
	public void EnterPassword()
	{
		driver.findElement(By.id("password")).sendKeys(password);
		waitTime();
	}
	public void clickLogin()
	{
		driver.findElement(By.name("login")).click();
		try
		{
			if(driver.findElement(By.linkText("Sign out")).isDisplayed())
			{
				System.out.println("Login Successful for : "+username);
				
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Can't login for username : "+username);
		}
	}
	public void clickLogout()
	{
		
		if(driver.findElement(By.linkText("Sign out")).isDisplayed())
		{
			driver.findElement(By.linkText("Sign out")).click();
			System.out.println("Logout Done For User : "+username);
			
		}
			//System.out.println("Login Successful for : "+username);
			
			waitTime();
		
	}
	public void CloseBrowser()
	{
		driver.quit();
	}
	
}

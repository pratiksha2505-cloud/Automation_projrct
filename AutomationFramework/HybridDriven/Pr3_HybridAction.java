package AutomationFramework.HybridDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr3_HybridAction {
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
	public void EnterURL(String url)
	{
		driver.get(url);
		waitTime();
	}
	public void ClickSignIn()
	{
		driver.findElement(By.linkText("My Account")).click();
		waitTime();
	}
	public void EnterEmail(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		waitTime();
	}
	public void EnterPassword(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		waitTime();
	}
	public void clickLogin(String username)
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
	public void clickLogout(String username)
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

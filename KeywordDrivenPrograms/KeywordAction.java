package KeywordDrivenPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordAction {

	WebDriver driver;
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//open URL
	public void OpenURL(String URL) throws InterruptedException
	{
		driver.get(URL);
		Thread.sleep(2000);
	}
	//enter TEXT
	public void enterText(String locator,String value) throws InterruptedException
	{
		WebElement element=getElement(locator);
		element.sendKeys(value);
		Thread.sleep(2000);
	}
	//locator Method
	public WebElement getElement(String locator)
	{
		if(locator.startsWith("id="))
		{
			return driver.findElement(By.id(locator.substring(3)));
		}
		else if(locator.startsWith("name="))
		{
			return driver.findElement(By.name(locator.substring(5)));
		}
		else if(locator.startsWith("xpath="))
		{
			return driver.findElement(By.xpath(locator.substring(6)));
		}
		return null;
	}
	
	//click element
	public void click(String locator) throws InterruptedException
	{
		WebElement element=getElement(locator);
		element.click();
		Thread.sleep(2000);
	}
	//close browser
	public void closeBrowser()
	{
		driver.quit();
	}



}

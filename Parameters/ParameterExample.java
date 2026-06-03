package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

	WebDriver driver;
	@Parameters({"url"})
	@Test
	public void OpenWebsite(String url)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Title : "+driver.getTitle());
		driver.quit();
	}
}

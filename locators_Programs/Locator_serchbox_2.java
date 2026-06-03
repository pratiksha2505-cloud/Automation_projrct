package locators_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_serchbox_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("maulikshah1810@yahoo.com");
		WebElement submit=driver.findElement(By.name("signin"));
		submit.click();
		
		Thread.sleep(10000);
		driver.close();
		
		
	}

}

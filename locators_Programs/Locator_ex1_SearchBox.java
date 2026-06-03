package locators_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ex1_SearchBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium java");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}

}

package locators_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//xpath->//*[@id="APjFqb"]
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().getImplicitWaitTimeout().wait(10);
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);
		// Submit search
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
		driver.close();
	}

}

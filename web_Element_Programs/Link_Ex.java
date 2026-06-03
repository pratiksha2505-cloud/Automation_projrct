package web_Element_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Home")).click();
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 WebElement exactLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dynamicLink")));
		exactLink.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"created\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

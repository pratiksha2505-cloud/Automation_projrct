//Program 1 : W.A.J.Script for Locating links by linkText() and partialLinkText()
package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		
		driver.findElement(By.linkText("Instant Access")).click();
		System.out.println("Link Access by linkText : Instant Access : successfully");
		Thread.sleep(2000);
		
		 driver.navigate().refresh();
		 Thread.sleep(2000);
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,10)");
			 */
			 
		driver.findElement(By.partialLinkText("TRAVELS")).click();
		System.out.println("Link Access by partiallinkText : TRAVELS : successfully");
		Thread.sleep(2000);
		driver.close();
	}

}

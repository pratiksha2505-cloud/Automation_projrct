package Assignment_SeleniumWebdriver;
import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
//Main Item 2
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr8_Mouse_hover_effect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement menuItem=driver.findElement(By.linkText("Main Item 2"));
		Actions act=new Actions(driver);
		
		act.moveToElement(menuItem).perform();
		
		System.out.println("Mouse Hover Effect Done Successfully!..");
		Thread.sleep(2000);
		driver.close();
	}

}

package Action_Programs;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button_Action_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Thread.sleep(2000);
		
		WebElement doubleclick_btn=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick_btn).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		Thread.sleep(2000);
		WebElement rightclick_btn=driver.findElement(By.id("rightClickBtn"));
		
		act.contextClick(rightclick_btn).perform();
		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//button[text()='Click Me']"));
		btn.click();
		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
		Thread.sleep(2000);
		driver.close();
		
	}

}

//Keyboard Event using Actions

package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr8_Keyboard_Copy_paste_event {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	//wait
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
	//locate text-box element for keyboard effect
	WebElement currentAdd=driver.findElement(By.id("currentAddress"));
	WebElement PermanantAdd=driver.findElement(By.id("permanentAddress"));
	
	//send value to currentAddress
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	//send data to current address field and copy that data
	act.click(currentAdd).sendKeys("A-101,Vivanta Arcade,Diwalipura,Vadpdara").keyDown(Keys.CONTROL)
	.sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	//paste date to permanant address
	act.click(PermanantAdd).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	System.out.println("Keyboard Event Test Passed Successfully...");
	Thread.sleep(3000);
	driver.close();
}
}

package Action_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_copy_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement currentAdd=driver.findElement(By.id("currentAddress"));
		WebElement permanantAdd=driver.findElement(By.id("permanentAddress"));
		
		currentAdd.sendKeys("Tops Technologies, Sayajigunj , Vadodara");
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		//Ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		//Ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		//click on second textbox
		act.click(permanantAdd).perform();
		Thread.sleep(1000);
		//ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

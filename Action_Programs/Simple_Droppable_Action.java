package Action_Programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Simple_Droppable_Action {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));

		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		Thread.sleep(3000);
		String text=target.getText();
		if(text.equals("Dropped!"))
		{
			System.out.println("Drag and Drop Done!");
		}
		else
			System.out.println("Drag and Drop not possible..");
		//System.out.println("draggable done");
driver.quit();
	}

}

package web_Element_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		try
		{
			
			driver.get("https://demoqa.com/buttons");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		
			
			WebElement clickMeBTN=driver.findElement(By.id("hyq2Q"));
			clickMeBTN.click();
			System.out.println("Button clicked successfully..");
			
			Thread.sleep(2000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error during button click: " + e.getLocalizedMessage());
		}
		finally {
			driver.close();
		}
		
	}

}

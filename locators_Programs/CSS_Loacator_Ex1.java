package locators_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Loacator_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("[class=gLFyf")).sendKeys("selenium");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}

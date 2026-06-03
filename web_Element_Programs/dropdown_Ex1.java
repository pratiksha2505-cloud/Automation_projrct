package web_Element_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select selectoption=new Select(dropdown);
		selectoption.selectByIndex(1);
		Thread.sleep(2000);
		driver.close();
		
	}

}

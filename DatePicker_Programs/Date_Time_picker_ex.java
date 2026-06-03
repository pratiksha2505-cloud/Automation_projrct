package DatePicker_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Time_picker_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		WebElement date=driver.findElement(By.id("dateAndTimePickerInput"));
		Thread.sleep(6000);
		date.sendKeys(Keys.CONTROL+"a");
		date.sendKeys(Keys.CLEAR);
		date.sendKeys("December 20, 2026 6:00 PM");
		date.click();
		Thread.sleep(6000);
		driver.close();
	}

}

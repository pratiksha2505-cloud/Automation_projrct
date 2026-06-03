package DatePicker_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		WebElement date=driver.findElement(By.id("datePickerMonthYearInput"));
		Thread.sleep(6000);
		date.sendKeys(Keys.CONTROL+"a");
		date.sendKeys(Keys.CLEAR);
		date.sendKeys("05/20/2026");
		Thread.sleep(6000);
		driver.close();
		
	}

}

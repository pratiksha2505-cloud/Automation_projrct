package web_Element_Programs;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Form_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.findElement(By.id("firstName")).sendKeys("Misha");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Shah");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("test123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[value='Other']")).click();
		driver.findElement(By.cssSelector("input[id='userNumber'")).sendKeys("9734523459");
		Thread.sleep(2000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
		Select selectMonth=new Select(month);
		selectMonth.selectByVisibleText("September");
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
		Select selectYear=new Select(year);
		selectYear.selectByVisibleText("1991");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='react-datepicker__day react-datepicker__day--025']")).click();
		Thread.sleep(1000);
		WebElement subject= driver.findElement(By.cssSelector("input[class='subjects-auto-complete__input']"));
		subject.sendKeys("Oracle PHP");
		
		//subject.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#hobbies-checkbox-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#hobbies-checkbox-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#hobbies-checkbox-3")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[type='file']")).click();
		//driver.manage().window().getPosition().moveBy(0, 0)
		subject.submit();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

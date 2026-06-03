package AlertPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement btnSimpleAlert=driver.findElement(By.id("alertButton"));
		btnSimpleAlert.click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		al.accept();
		
		WebElement btnWaitAlert=driver.findElement(By.id("timerAlertButton"));
		btnWaitAlert.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al1=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al1.getText());
		al1.accept();
		
		//btn with prompt
		WebElement btn=driver.findElement(By.id("confirmButton"));
		btn.click();
		Alert al2=driver.switchTo().alert();
		Thread.sleep(2000);
		//al2.sendKeys("Pratiksha");
		System.out.println(al2.getText());
		al2.dismiss();
		WebElement alert_result=driver.findElement(By.xpath("//*[@id=\"confirmResult\"]"));
		System.out.println(alert_result.getText());
		
		
		driver.findElement(By.id("promtButton")).click();
		Alert al3=driver.switchTo().alert();
		Thread.sleep(2000);
		al3.sendKeys("Pratiksha");
		al3.accept();
		WebElement prompt_result=driver.findElement(By.id("promptResult"));
		System.out.println(prompt_result.getText());
		driver.close();
	}

}

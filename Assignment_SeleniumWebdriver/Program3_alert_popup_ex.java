//W.A.J. script to use different methods to manage the windows-alerts and pop ups. 
package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program3_alert_popup_ex {

	void simple_alert_clicl(WebDriver driver) throws InterruptedException
	{
		WebElement btn=driver.findElement(By.id("alertButton"));
		btn.click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(al.getText());
		al.accept();
	}
	void alert_with_wait(WebDriver driver) throws InterruptedException
	{
		WebElement btn=driver.findElement(By.id("timerAlertButton"));
		btn.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		al.accept();
	}
	void popup_alert(WebDriver driver) throws InterruptedException
	{
		WebElement btn=driver.findElement(By.id("confirmButton"));
		btn.click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		//al.sendKeys("Pratiksha");
		System.out.println(al.getText());
		al.accept();
		WebElement alert_result=driver.findElement(By.xpath("//*[@id=\"confirmResult\"]"));
		System.out.println(alert_result.getText());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Program3_alert_popup_ex p=new Program3_alert_popup_ex();
		p.simple_alert_clicl(driver);
		Thread.sleep(2000);
		p.alert_with_wait(driver);
		Thread.sleep(2000);
		p.popup_alert(driver);
		Thread.sleep(2000);
		driver.close();
		
	}

}

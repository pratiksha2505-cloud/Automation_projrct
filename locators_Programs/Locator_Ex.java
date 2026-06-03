//Using locator open amazon website and type in search bar diapers and just press enter key
package locators_Programs;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;

public class Locator_Ex {

	public static void main(String[] args) throws InterruptedException {
	
		//Step 1: Launch Crome browser and maximize window
		WebDriver driver=new ChromeDriver();
		
		//Step 2:Open website
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Optionalyou can global implicit  wait--> It is wait to load all elements of page and start next scipts..
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
		//Step 3: Manage Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10));
		
		//Step 4: Wait for search bar explicit
		WebElement searchbar=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		
		//Step-5 :send text data to searchbar element time to action
		searchbar.sendKeys("diapers");
		searchbar.sendKeys(Keys.ENTER);		
		//better than Thread.sleep()
		
		wait.until(ExpectedConditions.titleContains("diapers"));
		
		//close browser
		driver.close();
		
	}
}

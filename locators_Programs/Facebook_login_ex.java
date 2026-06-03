package locators_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		WebElement username_feild=driver.findElement(By.name("email"));
		WebElement password_feild=driver.findElement(By.name("pass"));
		
		username_feild.sendKeys("pratiksha2502@gmail.com");
		password_feild.sendKeys("pmshah@&2505");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}

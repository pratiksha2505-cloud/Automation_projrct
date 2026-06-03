package locators_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_Selector_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.nopcommerce.com/login");
			
			//Select css selector by id
			driver.findElement(By.cssSelector("#Email")).sendKeys("test123@gmail.com");
			
			Thread.sleep(3000);
			
			//css selector for password using css by id
			//driver.findElement(By.cssSelector("#Password")).sendKeys("password");
			
			//css selector by attribute css
			//css selector by css attribute input with its id,name, class name etc
			//driver.findElement(By.cssSelector("input[id=Password]")).sendKeys("password");
			//driver.findElement(By.cssSelector("input[name=Password]")).sendKeys("password");
			driver.findElement(By.cssSelector("input[class=password]")).sendKeys("pass123");
			Thread.sleep(3000);
			//to select button or any data which is from multiple classes
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			Thread.sleep(3000);
			
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

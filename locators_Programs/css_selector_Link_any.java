package locators_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_Link_any {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login");
		
		//Select css selector by id
		//driver.findElement(By.cssSelector("#Email")).sendKeys("test123@gmail.com");
		//css selector by any name contains
		driver.findElement(By.cssSelector("input[id*='mail']")).sendKeys("test123@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id*='Pass']")).sendKeys("password123");
		Thread.sleep(3000);
		//cssselector for link
		driver.findElement(By.cssSelector("a[href='/passwordrecovery']")).click();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}

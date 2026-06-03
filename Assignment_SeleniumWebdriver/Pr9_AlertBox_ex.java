// W.A.J. Script How to handled Alert in selenium  
//"http://demo.guru99.com/test/delete_customer.php "
package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr9_AlertBox_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("53920");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		
		System.out.println("Alert Pop up tested successfully..");
		driver.close();
	}

}

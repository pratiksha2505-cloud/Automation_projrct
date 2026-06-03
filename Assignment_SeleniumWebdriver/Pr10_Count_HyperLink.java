/*W.A.J. Script To find the total hyperlink from this web page http://demo.guru99.com/test/web-table-element.php
*/
package Assignment_SeleniumWebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr10_Count_HyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("TOTAL NO OF HYPERLINKS : "+links.size());
		Thread.sleep(2000);
		driver.close();
	}

}

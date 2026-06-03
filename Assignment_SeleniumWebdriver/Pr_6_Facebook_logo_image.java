//W.A.J. script To write the script for image of logo facebook using xpath.
package Assignment_SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr_6_Facebook_logo_image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"mount_0_0_km\"]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/svg"));
		if(logo.isDisplayed())
		{
			System.out.println("Facebook Logo is Displayed");
		}
		else
		{
			System.out.println("Facebook Logo is Not Displayed");
		}
		Thread.sleep(4000);
		driver.close();
	}

}

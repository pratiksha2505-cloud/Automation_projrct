//W.A.J.Script To write a script for drop down. 
  
// http://demo.guru99.com/test/newtours/register.php
package Assignment_SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr7_Dropdown_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.name("country"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("BURMA");
		
		Thread.sleep(3000);
		String selectedoption=select.getFirstSelectedOption().getText();
		if(selectedoption.equals("BURMA"))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
		driver.quit();
	}

}

package web_Element_Programs;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	void VisibletestSelect(WebDriver driver) throws InterruptedException
	{
		WebElement dropdown=driver.findElement(By.xpath("//select"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("India");
		
		Thread.sleep(3000);
		String selectedoption=select.getFirstSelectedOption().getText();
		if(selectedoption.equals("India"))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
		driver.close();
	}
	void ValueSelection(WebDriver driver) throws InterruptedException
	{
		WebElement dropdown=driver.findElement(By.xpath("//select"));
		Select select=new Select(dropdown);
		select.selectByValue("DZA");
		Thread.sleep(3000);
		String selectedoption=select.getFirstSelectedOption().getAttribute("value");
		String expectedvalue="DZA";
		  if(selectedoption.equals(expectedvalue)) {
		  System.out.println("Test passed!"); } else {
		  System.out.println("Test Failed!"); }
		 
		System.out.println(selectedoption.toString());
		
		Thread.sleep(3000);
		driver.close();
	}
	void IndexSelection(WebDriver driver) throws InterruptedException
	{
		WebElement dropdown=driver.findElement(By.xpath("//select"));
		Select select=new Select(dropdown);
		select.selectByIndex(10);
	//	int index=select.getFirstSelectedOption().
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		DropDownTest d=new DropDownTest();
		//d.VisibletestSelect(driver);
		//d.ValueSelection(driver);
		d.IndexSelection(driver);
	}

}

package web_Element_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		//get all checkbox
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(1000);
		if(!checkboxes.get(0).isSelected())
		{
			checkboxes.get(0).click();
		}
		Thread.sleep(2000);
		if(!checkboxes.get(1).isSelected())
		{
			checkboxes.get(1).click();
		}
		//print all check box status
		for(int i=0;i<checkboxes.size();i++)
		{
			System.out.println("Checkbox-"+(i+1)+" selected : "+checkboxes.get(i).isSelected());
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}

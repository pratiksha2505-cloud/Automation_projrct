package web_Element_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButon_YesOrNO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement yesRadioButton=driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
		yesRadioButton.click();
		
		Thread.sleep(2000);
		
		//verify selected text
		WebElement result=driver.findElement(By.className("text-success"));
		System.out.println("Selected Result : "+result.getText());
		
		Thread.sleep(3000);
		
		WebElement impressive=driver.findElement(By.cssSelector("#impressiveRadio"));
		impressive.click();
		Thread.sleep(2000);
		System.out.println("Selected Result : "+result.getText());
		Thread.sleep(2000);
		
		WebElement NoRadioButton=driver.findElement(By.xpath("//*[@id=\"noRadio\"]"));
		System.out.println("Option NO : is disabled : "+NoRadioButton.isDisplayed());
		Thread.sleep(2000);
		//System.out.println("Selected Result : "+result.getText());
		driver.close();
	}

}

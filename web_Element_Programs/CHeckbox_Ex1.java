package web_Element_Programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHeckbox_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		WebElement homeTrees =driver.findElement(By.xpath("//span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]"));
		homeTrees.click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[3]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'rc-tree-switcher rc-tree-switcher_close')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[3]/span[3]")).click();
		Thread.sleep(2000);
		List<WebElement> selectList=driver.findElements(By.cssSelector(".text-success"));
		
		for(WebElement item:selectList)
		{
			System.out.println(item.getText().toString());
		}
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}

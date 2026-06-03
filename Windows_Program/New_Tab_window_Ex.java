package Windows_Program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab_window_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		WebElement tab_btn=driver.findElement(By.id("tabButton"));
		tab_btn.click();
		
		Set<String> allWindows=driver.getWindowHandles();
		for(String win:allWindows)
		{
			if(!win.equals(parent))
			{
				driver.switchTo().window(win);
				System.out.println("Current Window URL: "+driver.getCurrentUrl());
				System.out.println("Page Title : "+driver.getTitle());
				System.out.println("Page Sourcer : "+driver.getPageSource());
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}

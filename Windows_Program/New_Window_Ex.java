package Windows_Program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Window_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String win:windows)
		{
			if(!win.equals(parent))
			{
				driver.switchTo().window(win);
				System.out.println("Current URL : "+driver.getCurrentUrl());
				System.out.println("Page Source : "+driver.getPageSource());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		
	}

}

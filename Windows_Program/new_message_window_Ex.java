package Windows_Program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class new_message_window_Ex {
//messageWindowButton
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mauli\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> windows=driver.getWindowHandles();
		for(String win:windows)
		{
			if(!win.equals(parent))
			{
				driver.switchTo().window(win);
				 System.out.println("Switched to child window");

	                System.out.println("Title : " + driver.getTitle());
	                

	              //  System.out.println("URL : " + driver.getCurrentUrl());

	               // System.out.println("Page Source Length : " + driver.getPageSource().length());

	                driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.quit();
		
	}

}

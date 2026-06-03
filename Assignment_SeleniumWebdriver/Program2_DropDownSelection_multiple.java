//Program 2 : W.A.J.Script for Selecting multiple items in a drop dropdown 
package Assignment_SeleniumWebdriver;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2_DropDownSelection_multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch Browser
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.get("https://demoqa.com/select-menu");

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1200)");
				// Locate Multi Select Dropdown
				WebElement multiDropdown = driver.findElement(By.id("cars"));

				// Create Select Class Object
				Select s = new Select(multiDropdown);

				// Check whether dropdown is multi-select
				if(s.isMultiple())
				{
					System.out.println("Dropdown is Multi Select");

					// Select Multiple Items
					s.selectByVisibleText("Volvo");
					Thread.sleep(1000);

					s.selectByVisibleText("Saab");
					Thread.sleep(1000);

					s.selectByVisibleText("Audi");
					Thread.sleep(1000);

					// Get All Selected Options
					List<WebElement> list = s.getAllSelectedOptions();

					System.out.println("Selected Options are :");

					for(WebElement ele : list)
					{
						System.out.println(ele.getText());
					}

					// Deselect Option
					s.deselectByVisibleText("Saab");

					Thread.sleep(2000);

					// Deselect All
					s.deselectAll();
				}
				else
				{
					System.out.println("Dropdown is NOT Multi Select");
				}

				// Close Browser
				driver.quit();
	}

}

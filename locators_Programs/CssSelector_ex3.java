package locators_Programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelector_ex3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://secure.testrail.com/customers/testrail/trial/?type=signup");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
			/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement paragraph = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.trial-new-title-text"))
            );
			*/
			//for class name by.cssSelector(tagname.class-name)
			WebElement paragraph= driver.findElement(By.cssSelector("p.trial-new-title-text"));
			String text=paragraph.getAttribute("textContent").trim();
			System.out.println(text);
			Thread.sleep(2000);
			
			WebElement header=driver.findElement(By.cssSelector("p.product-testrail-main-text"));
			System.out.println(header.getAttribute("textContent").trim());
			
			WebElement subtext=driver.findElement(By.cssSelector("p.product-testrail-subheader"));
			System.out.println(subtext.getAttribute("textContent").trim());
			//by classname
			//both syntax are used 
			//cssselector(tagname.classname)
			//2nd. by.classname("classname")
			//WebElement label=driver.findElement(By.cssSelector("label.control-label"));
			WebElement label=driver.findElement(By.className("control-label"));
			System.out.println(label.getAttribute("textContent").trim());
			//1. select element by id(#id)
			
			
			driver.findElement(By.cssSelector("#first_name")).sendKeys("Pratiksha");
			Thread.sleep(2000);
			
			//by attribute name tagname[attribute='value']
			driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Mehta");
			Thread.sleep(2000);
			
			//by partial attribute
			driver.findElement(By.cssSelector("input[id*='mail']")).sendKeys("test123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name*='pho']")).sendKeys("9979336595");
			Thread.sleep(2000);
			//by xpath
			driver.findElement(By.xpath("//*[@id=\"organization\"]")).sendKeys("GLS");
			Thread.sleep(3000);
		
			//by tag with perticular classname
			
			driver.close();
			
				
	}

}

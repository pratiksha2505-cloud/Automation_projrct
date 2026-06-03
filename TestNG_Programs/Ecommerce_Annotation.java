package TestNG_Programs;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ecommerce_Annotation {
	WebDriver driver;
	ChromeOptions options;
	String homeScreen, CHeckoutScreen,CheckoutInfo;
	Set<String> windows;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Database Connected..");
	}
	
	@BeforeClass
	public void LaunchBrowser()
	{
		options=new ChromeOptions();
		// Disable notifications popup
				options.addArguments("--disable-notifications");

				// Open browser in incognito mode
				options.addArguments("--incognito");

				// Disable info bar
				options.addArguments("disable-infobars");

				// Disable automation controlled message
				options.setExperimentalOption("excludeSwitches",
						new String[] { "enable-automation" });

				// Disable password manager and save password popup
				
				Map<String, Boolean> prefs=new HashMap<String, Boolean>();
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);

				options.setExperimentalOption("prefs", prefs);

				// Launch Chrome browser
				 driver = new ChromeDriver(options);
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				System.out.println("broswer launched");

		
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name"))
		.sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password"))
		.sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button"))
		.click();
		Thread.sleep(3000);
		System.out.println("login successfull");
	}

	@org.testng.annotations.Test(priority=1)
	public void addItem()
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		homeScreen=driver.getWindowHandle();
		driver.findElement(By.className("shopping_cart_link")).click();
		 System.out.println("product added to cart");
		 

	}
	
	
	  @Test(priority =2) public void checkout() {
		  windows=driver.getWindowHandles();
			for(String win:windows)
			{
				if(!win.equals(homeScreen))
				{
					driver.switchTo().window(win);
					CHeckoutScreen=driver.getWindowHandle();
					 driver.findElement(By.id("checkout")).click();
					  System.out.println("Checkout DOne..");
					  
					  
				}
				
			}
		 
	  }
	  @Test(priority =3) public void checkoutInfo()
	  {
		  windows=driver.getWindowHandles();
			for(String win:windows)
			{
				if(!win.equals(CHeckoutScreen) && !win.equals(homeScreen))
				{
					driver.switchTo().window(win);
					CheckoutInfo=driver.getWindowHandle();
					driver.findElement(By.id("first-name")).sendKeys("Pratik");
					driver.findElement(By.id("last-name")).sendKeys("Gandhi");
					driver.findElement(By.id("postal-code")).sendKeys("390008");
					 driver.findElement(By.id("continue")).click();
					  System.out.println("Checkout Info DOne..");
					  
				}
				
			}
	  }
	 
	
	@AfterMethod
	public void logout() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.id("react-burger-menu-btn"))).click();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.id("logout_sidebar_link")));

	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.id("logout_sidebar_link"))).click();

	    System.out.println("logout successful");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser Closed..");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Database Disconnected..");
	}
}

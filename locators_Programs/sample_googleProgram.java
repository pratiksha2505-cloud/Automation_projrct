package locators_Programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample_googleProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		//driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//)
		Thread.sleep(3000);
		
		//goto back page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.close();
	}

}

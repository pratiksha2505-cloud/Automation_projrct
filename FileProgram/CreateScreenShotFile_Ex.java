package FileProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CreateScreenShotFile_Ex {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		
		//take Screen shot
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcer=ts.getScreenshotAs(OutputType.FILE);
	    File destination =new File("google1.png");
	    FileHandler.copy(sourcer, destination);
	    System.out.println("Scrrenshot taken");
	    Thread.sleep(3000);
	    driver.close();
	}

}

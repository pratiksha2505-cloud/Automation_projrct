/*W.A.J. Script To perform the radio button to select one by one in loop 
http://demo.guru99.com/test/radio.html
*/
package Assignment_SeleniumWebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr5_Radio_Ex {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/radio.html");

        driver.manage().window().maximize();

        // Find all radio buttons
        List<WebElement> radio_Buttons = driver.findElements(By.xpath("//input[@type='radio']"));

        // Select radio buttons one by one
        for(WebElement radio_btn : radio_Buttons)
        {
            radio_btn.click();

            System.out.println("Selected Radio Button Value : " + radio_btn.getAttribute("value"));

            Thread.sleep(2000);
        }

        driver.quit();
		
	}

}

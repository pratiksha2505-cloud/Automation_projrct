//W.A.J.script to register your self in Gmail. in java code example// we are doing it with demo registration form
package Assignment_SeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_gmail_registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Browser
				WebDriver driver = new ChromeDriver();

				// Maximize Browser
				driver.manage().window().maximize();

				// Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Open Demo Registration Page
				driver.get("https://demoqa.com/automation-practice-form");

				// Enter First Name
				driver.findElement(By.id("firstName")).sendKeys("Rahul");

				// Enter Last Name
				driver.findElement(By.id("lastName")).sendKeys("Sharma");

				// Enter Email
				driver.findElement(By.id("userEmail"))
						.sendKeys("rahul@gmail.com");

				// Select Gender
				driver.findElement(By.xpath("//label[text()='Male']")).click();

				// Enter Mobile Number
				driver.findElement(By.id("userNumber"))
						.sendKeys("9876543210");

				// Enter Subject
				WebElement subject= driver.findElement(By.id("subjectsInput"));
				subject.sendKeys("Computer");
				
				subject.sendKeys(Keys.ENTER);
				/*
				 * Actions act=new Actions(driver); act.click(subject).perform();
				 */

				// Select Hobby
				driver.findElement(By.xpath("//label[text()='Sports']")).click();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1200)");
				// Enter Address
				driver.findElement(By.id("currentAddress"))
						.sendKeys("Ahmedabad Gujarat");

				Thread.sleep(2000);

				// Submit Form
				WebElement submitBtn = driver.findElement(By.id("submit"));

				submitBtn.click();

				System.out.println("Registration Form Submitted Successfully");

				Thread.sleep(3000);

				driver.quit();
	}

}

/*
 * WebDriver driver=new ChromeDriver(); driver.get(
 * "https://accounts.google.com/lifecycle/steps/signup/kids/accountsetupchapter?continue=https://mail.google.com/mail/u/0/&dsh=S-953696555:1778671181732640&emr=1&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https://mail.google.com/mail/u/0/&ifkv=AWa2Pat8hDJIR1QSSJNydVv4KdL7zyOqkkzPrvRDKYwwfdrNAJ5DNNt_U5PgFLCO-Vlv9HM1KuWvUA&ksf=1&osid=1&service=mail&TL=APouJz5bkL4fw43cA90swAfT6jOdBlU3QywwHax5qRY5TwXMBToiYw5WS0ZP08JB"
 * ); Thread.sleep(1000); driver.findElement(By.xpath(
 * "//*[@id=\"yDmH0d\"]/c-wiz/main/div[3]/div/div/div/div/button/span")).click()
 * ; driver.findElement(By.id("firstName")).sendKeys("Hitanshi");
 * Thread.sleep(1000); driver.findElement(By.id("lastName")).sendKeys("Mehra");
 * Thread.sleep(1000);
 * driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).
 * click();
 * driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[1]/div")).click();
 * driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[2]/ul/li[1]")).click(
 * ); driver.quit();
 */
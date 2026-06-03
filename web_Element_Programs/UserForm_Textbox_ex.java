package web_Element_Programs;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Take data from user and open browser and fill data and submit.
public class UserForm_Textbox_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Full Name :"); Scanner sc=new Scanner(System.in); String
		 * name=sc.nextLine(); System.out.println("Email :"); String
		 * email=sc.nextLine(); System.out.println("Current Address :"); String
		 * cAddress=sc.nextLine(); System.out.println("Permanant Address :"); String
		 * pAddress=sc.nextLine();
		 */
		String name,email,c_address,p_address;
		name="Pratiksha Shah Maulikkumar";
		email="pratiksha2505@gmail.com";
		c_address="A-101,Vivanta Elite, Opp. Shakuntal Appartment, Vadodara-Gujarat";
		p_address="A-101,Vivanta Elite, Opp. Shakuntal Appartment, Vadodara-Gujarat";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys(c_address);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys(p_address);
		Thread.sleep(3000);
		driver.findElement(By.className("btn-primary")).click();
		System.out.println("Data Submitted successfully!!");
		Thread.sleep(6000);
		driver.close();
		
	}

}

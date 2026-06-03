/*
 * W.a.framework program for data driven framework -to get value from the excel and check into your website 
(http://automationpractice.com/index.php?controller=authentication&b
ack=my-account) instead of this we take this
https://practice.automationtesting.in/my-account/
Direct check with login which emaild through login successful or not) excel file
 */
package AutomationFramework.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Row;

public class Pr1LoginTestDataDriven {
public static void main(String[] args) throws InterruptedException, IOException {
	String filePath="D:\\Pratiksha\\Automation_Project\\Automation_practice_workbook.xlsx";
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	FileInputStream fin=new FileInputStream(new File(filePath));
	Workbook workbook=new XSSFWorkbook(fin);
	Sheet sheet=workbook.getSheet("LoginData");
	int rows=sheet.getLastRowNum();
	for(int i=0;i<=rows;i++)
	{
		Row row=sheet.getRow(i);
		String username=row.getCell(0).getStringCellValue();
		String password=row.getCell(1).getStringCellValue();
		//navigate to login page
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		try
		{
			if(driver.findElement(By.linkText("Sign out")).isDisplayed())
			{
				System.out.println("Login Successful for : "+username);
				driver.findElement(By.linkText("Sign out")).click();
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Can't login for username : "+username);
		}
		
	}
	driver.close();
	workbook.close();
	fin.close();
}

}

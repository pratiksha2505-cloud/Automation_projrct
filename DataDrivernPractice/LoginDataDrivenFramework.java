package DataDrivernPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDataDrivenFramework {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	FileInputStream fin=new FileInputStream(new File("D:\\Pratiksha\\Automation_Project\\Automation_practice_workbook.xlsx"));
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheet("UserLoginInfo");
	int rows=sheet.getLastRowNum();
	for(int i=1;i<=rows;i++)
	{
		Row row=sheet.getRow(i);
		String username=row.getCell(0).getStringCellValue();
		String pass=row.getCell(1).getStringCellValue();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		if(driver.getCurrentUrl().contains("secure"))
		{
			System.out.println("Login Successful For User : "+username);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href,'/logout')]")).click();
			System.out.println("Logout DONE : "+username);
		}
		else
		{
			System.out.println("Can't do Login For User : "+username);
			driver.navigate().refresh();
		}
	}
	driver.close();
	workbook.close();
	fin.close();
}
}

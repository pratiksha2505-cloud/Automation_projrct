package DataDrivenPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataDrivenProgramEx {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	FileInputStream file=new FileInputStream(new File("D:\\Pratiksha\\Softwear Testing Material\\Shefali Mem\\Excel_parametrs\\Dataset.xlsx"));
	//Workbook is an interface from apache poi. It represent
	//complete excel file

	Workbook workbook=new XSSFWorkbook(file);
	Sheet sheet=workbook.getSheetAt(0);
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		Row row=sheet.getRow(i);
		//read data from excel sheet
		String username=row.getCell(0).getStringCellValue();
		String password=row.getCell(1).getStringCellValue();
		
		//navigate to login page
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		System.out.println("FROM Excel -> "+username+ " | "+password);
		//verify login
		String currentURL=driver.getCurrentUrl();
		if(currentURL.equals("https://practicetestautomation.com/logged-in-successfully/"))
		{
			System.out.println("Login Successful for : "+username);
			
		}
		else
		{
			System.out.println("Login failed for: " + username);
		}
		driver.navigate().back();
		
	}
	driver.close();
	workbook.close();
	file.close();
}
}

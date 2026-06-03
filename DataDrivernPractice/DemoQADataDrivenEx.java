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

public class DemoQADataDrivenEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		FileInputStream fin=new FileInputStream(new File("D:\\Pratiksha\\Automation_Project\\Automation_practice_workbook.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("DataQA_textbox");
		int rows=sheet.getLastRowNum();
		for(int i=1;i<=rows;i++)
		{
			driver=new ChromeDriver();
			Row row=sheet.getRow(i);
			String name=row.getCell(0).getStringCellValue();
			String email=row.getCell(1).getStringCellValue();
			String c_address=row.getCell(2).getStringCellValue();
			String p_address=row.getCell(3).getStringCellValue();
			driver.get("https://demoqa.com/text-box");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.id("userName")).sendKeys(name);
			Thread.sleep(1000);
			driver.findElement(By.id("userEmail")).sendKeys(email);
			Thread.sleep(1000);
			driver.findElement(By.id("currentAddress")).sendKeys(c_address);
			Thread.sleep(1000);
			driver.findElement(By.id("permanentAddress")).sendKeys(p_address);
			Thread.sleep(1000);
			driver.findElement(By.id("submit")).click();
			Thread.sleep(1000);
			System.out.println("Data Submit for User : "+name);
			driver.quit();
			
		}
		workbook.close();
		fin.close();
	}

}

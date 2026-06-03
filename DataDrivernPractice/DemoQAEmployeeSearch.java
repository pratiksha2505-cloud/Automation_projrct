package DataDrivernPractice;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAEmployeeSearch {
public static void main(String[] args) throws Exception {
	WebDriver driver;
	FileInputStream fin=new FileInputStream(new File("D:\\Pratiksha\\Automation_Project\\Automation_practice_workbook.xlsx"));
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheet("DemoQA_Emp_list");
	int rows=sheet.getLastRowNum();
	for(int i=1;i<=rows;i++)
	{
		Row row=sheet.getRow(i);
		String name=row.getCell(0).getStringCellValue();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		WebElement searchbox=driver.findElement(By.id("searchBox"));
		searchbox.sendKeys(name);
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.close();
	}
	workbook.close();
	fin.close();
}
}

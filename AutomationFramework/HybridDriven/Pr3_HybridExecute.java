package AutomationFramework.HybridDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Pr3_HybridExecute {
@Test
public void executeHybridFramework() throws Exception
{
	String FilePath="D:\\Pratiksha\\Automation_Project\\Automation_practice_workbook.xlsx";
	FileInputStream fin=new FileInputStream(new File(FilePath));
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheet("HybridDrivenData");
	Pr3_HybridAction action=new Pr3_HybridAction();
	int rows=sheet.getLastRowNum();
	String username="";
	String url="";
	for(int i=0;i<=rows;i++)
	{
		
		Row row=sheet.getRow(i);
		String keyword=row.getCell(0).getStringCellValue();
		String data=row.getCell(1).getStringCellValue();
			
		if(keyword!=null)
		{
			switch(keyword)
			{
				case "open browser":
					action.OpenBrowser();
					break;
				case "enter url":
					url=data;
					action.EnterURL(url);
					break;
				case "click signin":
					action.ClickSignIn();
					break;
				case "enter email":
					username=data;
					action.EnterEmail(username);
					break;
				case "enter password":
					action.EnterPassword(data);
					break;
				case "click login":
					action.clickLogin(username);
					break;
				case "click logout":
					action.clickLogout(username);
					break;
				case "close browser":
					action.CloseBrowser();
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
				
	}
	workbook.close();
	fin.close();
}
}

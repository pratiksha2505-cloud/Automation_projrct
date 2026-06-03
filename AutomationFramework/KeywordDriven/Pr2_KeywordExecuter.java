package AutomationFramework.KeywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Pr2_KeywordExecuter {
@Test
public void keywordExecut() throws IOException
{
	String FilePath="D:\\Pratiksha\\Automation_Project\\Automation_practice_workbook.xlsx";
	FileInputStream fin=new FileInputStream(new File(FilePath));
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheet("KeywordDrivenData");
	Pr2_KeywordAction action=new Pr2_KeywordAction();
	int rows=sheet.getLastRowNum();
	for(int i=0;i<=rows;i++)
	{
		String keyword=null;
		Row row=sheet.getRow(i);
		keyword=row.getCell(0).getStringCellValue();
		if(keyword!=null)
		{
			switch(keyword)
			{
				case "open browser":
					action.OpenBrowser();
					break;
				case "enter url":
					action.EnterURL();
					break;
				case "click signin":
					action.ClickSignIn();
					break;
				case "enter email":
					action.EnterEmail();
					break;
				case "enter password":
					action.EnterPassword();
					break;
				case "click login":
					action.clickLogin();
					break;
				case "click logout":
					action.clickLogout();
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

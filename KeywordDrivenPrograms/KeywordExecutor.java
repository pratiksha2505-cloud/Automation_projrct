package KeywordDrivenPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class KeywordExecutor {
@Test
public void executeTest() throws IOException, InterruptedException
{
	FileInputStream fin=new FileInputStream(new File("D:\\Pratiksha\\Softwear Testing Material\\Shefali Mem\\Excel_parametrs\\Dataset.xlsx"));
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheetAt(1);
	KeywordAction action=new KeywordAction();
	int rows=sheet.getLastRowNum();
	for(int i=1;i<=rows;i++)
	{
		String keyword=sheet.getRow(i).getCell(1).getStringCellValue();
		String locator="";
		String value="";
		if(sheet.getRow(i).getCell(2)!=null)
		{
			locator=sheet.getRow(i).getCell(2).getStringCellValue();
		}
		if(sheet.getRow(i).getCell(3)!=null)
		{
			value=sheet.getRow(i).getCell(3).getStringCellValue();
		}
		switch(keyword)
		{
		case "OpenBrowser":
			action.OpenBrowser();
			break;
		case "OpenURL":
			action.OpenURL(value);
			break;
		case "enterText":
			action.enterText(locator, value);
			break;
		case "click":
			action.click(locator);
			break;
		case "closeBrowser":
			action.closeBrowser();
			break;
		default:
			System.out.println("Invalid Choice");
			break;

		}
	}
	workbook.close();
	fin.close();
}
}

package TablePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTableEx_1 {

	void LocateTable(WebDriver driver) throws InterruptedException
	{
		//Locate Table 
		WebElement table=driver.findElement(By.id("table1"));
		//print complete table
		System.out.println(table.getText());
		
		Thread.sleep(3000);
		
	}
	void printRaw(WebDriver driver) throws InterruptedException
	{
		//print specific raw index 1 with xpath
		WebElement raw=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]"));
		//print whole raw
		System.out.println(raw.getText());
		Thread.sleep(2000);
	}
	void printCellData(WebDriver driver) throws InterruptedException
	{
		WebElement cell=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]"));
		System.out.println(cell.getText());
		Thread.sleep(2000);
	}
	void countRaw(WebDriver driver)
	{
		List<WebElement> raws=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println(raws.size());
	}
	void CountColumn(WebDriver driver)
	{
		List<WebElement> coulmn=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		System.out.println(coulmn.size());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		TestTableEx_1 t1=new TestTableEx_1();
		System.out.println("-------------------");
		System.out.println("Print Table");
		System.out.println("-------------------");
		t1.LocateTable(driver);
		System.out.println("-------------------");
		System.out.println("Print raw 1:");
		System.out.println("-------------------");
		t1.printRaw(driver);
		System.out.println("-------------------");
		System.out.println("Print Raw2 column 3 data :");
		System.out.println("-------------------");
		t1.printCellData(driver);
		System.out.println("-------------------");
		System.out.println("Total No of Raws:");
		t1.countRaw(driver);
		System.out.println("-------------------");
		System.out.println("Total No of Coulmns:");
		t1.CountColumn(driver);
		driver.close();
	}

}

package TablePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		//Print table data using table id
		WebElement table=driver.findElement(By.id("table2"));
		System.out.println("Table 2:");
		System.out.println("-----------------------------------------------");
		System.out.println(table.getText());
		System.out.println("-----------------------------------------------");
		WebElement table_raw=driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[1]"));
		System.out.println("Raw 1:");
		System.out.println("-----------------------------------------------");
		System.out.println(table_raw.getText());
		System.out.println("-----------------------------------------------");
		WebElement cell=driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[3]/td[5]"));
		System.out.println("Raw 3 column 5 Data : "+ cell.getText());
		System.out.println("-----------------------------------------------");
		List<WebElement> raws=driver.findElements(By.xpath("//*[@id=\"table2\"]/tbody/tr"));
		System.out.println("Total No of Raws in table 2 : "+raws.size());
		System.out.println("-----------------------------------------------");
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"table2\"]/thead/tr/th"));
		System.out.println("Total No of Columns : "+columns.size());
		driver.quit();
	}

}

package Action_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Accept_Droppable_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		////*[@id="droppableExample-tab-accept"]
		WebElement accept=driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-accept\"]"));
		accept.click();
		Thread.sleep(2000);
		WebElement source1=driver.findElement(By.id("acceptable"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"acceptDropContainer\"]/div[2]"));
		WebElement notAcceptSource=driver.findElement(By.xpath("//*[@id=\"acceptDropContainer\"]/div[1]/div[2]"));
		//acceptable Drag drop code
		/*
		 * act.dragAndDrop(source1, target).perform(); Thread.sleep(2000);
		 * if(target.getText().equals("Dropped!")) {
		 * System.out.println("Acceptable Drag and Drop done!"); } else {
		 * System.out.println("Acceptable Drag and Drop is not done!"); }
		 */
		
		//Not acceptable Drag drop code
		act.dragAndDrop(notAcceptSource, target).perform(); 
		Thread.sleep(2000);
		if(!target.getText().equals("Dropped!")) {
		System.out.println("Not Acceptable Drag and Drop done!"); } else {
		System.out.println("Not Acceptable Drag and Drop is not done!"); }
		driver.quit();
	}

}

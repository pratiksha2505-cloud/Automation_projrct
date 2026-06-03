package locators_Programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector_Ex_method {

	public static void main(String[] args)  {
		WebDriver driver =new ChromeDriver();
		try
		{
			// TODO Auto-generated method stub
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/cssref/trysel.asp");
		
		//1.find element by id(#id) 
		WebElement elementById=driver.findElement(By.cssSelector("#iframeResult"));
		System.out.println("By ID : "+ elementById.getTagName());
		
		Thread.sleep(3000);
		// 2. By Class (.className)
        WebElement elementByClass = driver.findElement(By.cssSelector(".w3-btn"));
        System.out.println("By Class: " + elementByClass.getText());

        // 3. By Tag Name (tag)
        WebElement elementByTag = driver.findElement(By.cssSelector("iframe"));
        System.out.println("By Tag: " + elementByTag.getAttribute("name"));

        // 4. By Attribute ([attr='value'])
        WebElement elementByAttr = driver.findElement(By.cssSelector("[title='CSS Selector Reference']"));
        System.out.println("By Attribute: " + elementByAttr.getText());

        // 5. By Multiple Attributes ([attr1='value'][attr2='value'])
        List<WebElement> multiAttrElements = driver.findElements(
                By.cssSelector("a[target='_blank'][class='w3-btn']")
        );
        System.out.println("Multiple Attributes Count: " + multiAttrElements.size());

        // 6. Starts With (^=)
        WebElement startsWith = driver.findElement(By.cssSelector("a[href^='https']"));
        System.out.println("Starts With: " + startsWith.getAttribute("href"));

        // 7. Ends With ($=)
        WebElement endsWith = driver.findElement(By.cssSelector("a[href$='.asp']"));
        System.out.println("Ends With: " + endsWith.getAttribute("href"));

        // 8. Contains (*=)
        WebElement contains = driver.findElement(By.cssSelector("a[href*='css']"));
        System.out.println("Contains: " + contains.getAttribute("href"));

        // 9. Descendant Selector (parent child)
        WebElement descendant = driver.findElement(By.cssSelector("div.w3-example a"));
        System.out.println("Descendant: " + descendant.getText());

        // 10. Direct Child Selector (parent > child)
        WebElement directChild = driver.findElement(By.cssSelector("div.w3-example > a"));
        System.out.println("Direct Child: " + directChild.getText());

        // 11. nth-child (nth element in parent)
        WebElement nthChild = driver.findElement(By.cssSelector("ul li:nth-child(2)"));
        System.out.println("nth-child: " + nthChild.getText());

        // 12. First-child
        WebElement firstChild = driver.findElement(By.cssSelector("ul li:first-child"));
        System.out.println("First-child: " + firstChild.getText());

        // 13. Last-child
        WebElement lastChild = driver.findElement(By.cssSelector("ul li:last-child"));
        System.out.println("Last-child: " + lastChild.getText());

        // 14. Adjacent Sibling (+)
        WebElement adjacentSibling = driver.findElement(By.cssSelector("h2 + p"));
        System.out.println("Adjacent Sibling: " + adjacentSibling.getText());

        // 15. General Sibling (~)
        List<WebElement> generalSiblings = driver.findElements(By.cssSelector("h2 ~ p"));
        System.out.println("General Siblings Count: " + generalSiblings.size());

    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    } finally {
        driver.quit();
    }
		
	}

}

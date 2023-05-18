package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SiblingAndParentInXpath {
	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		driver.get("https://demo.guru99.com/test/guru99home/");
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,600);", "");
		driver.findElement(By.id("rt-section")).click();
		
//Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,
		//Here first we will find a h2 whose text is ''A few of our most popular courses' 
		//,then we move to its parent element which is a 'div' , inside this div we will find a link whose text is 'SELENIUM' then at last we will find all of the sibling elements of this link('SELENIUM')
        
        List <WebElement> dateBox = 
        		driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }     

       // driver.close();
	}

}

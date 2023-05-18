package xpath_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_guru99 {
	public static 	WebDriver driver = new EdgeDriver();
	public static void main(String[] args) throws InterruptedException {
		WebElement w3;

		//driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		//driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/guru99home/");
      //Print the searched element
    	 
    	 JavascriptExecutor JS = (JavascriptExecutor) driver;
  		JS.executeScript("window.scrollBy(0,550);", "");
  		driver.findElement(By.id("rt-section")).click();

		
      	//Search the element by using descendant method
        	 w3=driver.findElement(By.xpath("//*[@id='rt-feature']//descendant::a"));
        	 //w3.click();
        	 System.out.println(w3.getText());
    		
}
}
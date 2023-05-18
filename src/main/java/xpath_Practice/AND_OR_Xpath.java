package xpath_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AND_OR_Xpath {
	public static	WebDriver driver = new FirefoxDriver();    
	public static void main(String[] args) {
		WebElement w,x;
		         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/v1/");
      //Search element using OR in the xpath
    	 w=driver.findElement(By.xpath("//*[@type='submit' OR @name='btnReset']"));
     	
    	 //Print the text of the element
			System.out.println(w.getText());
			
		//Search element using AND in the xpath
			x=driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']"));	
			 
		//Print the text of the searched element
			System.out.println(x.getText());
			 
	//Close the browser
    driver.quit();
       

}
}
package xpath_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_Xpath {
	public static	WebDriver driver = new FirefoxDriver();    
	public static void main(String[] args) {
		WebElement w,x,y,b;
		         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        w= driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//b[text()='Testing']"));
        System.out.println("lable1:"+w.getText());
        
        
       
        
        JavascriptExecutor JS = (JavascriptExecutor) driver;
  		JS.executeScript("window.scrollBy(0,750);", "");
  		driver.findElement(By.className("featured-box cloumnsize1")).click();
  		
  		 x= driver.findElement(By.xpath("//*[@type='password']//self::input"));
         
         System.out.println("lable2:"+x.getText());
         
  	   b= driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input"));
  	   b.click();
  	   b.sendKeys("hi");
       System.out.println("lable3:"+b.getText());
       
	
        y= driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input"));
     
        System.out.println("lable4:"+x.getText());
        
        
         

}
}////*[@type='password']//self::input     //*[@type='submit']//following-sibling::input
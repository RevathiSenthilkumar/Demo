package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Xpath {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebElement w,w1,w3,w4;
		
		
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://demo.guru99.com/v1/");
     	//Search the element by using preceding method
     	 w=driver.findElement(By.xpath("//*[@type='submit']//preceding::input"));
     	//Print the searched element
     	 w.click();
     	 w.sendKeys("Hi");
     	 System.out.println(w.getText());
     	//Search the element by using Following method
     	 w4=driver.findElement(By.xpath("//*[@type='text']//following::input[1]"));
      	w4.click();
      	w4.sendKeys("ready");
		//Print the text of the searched element
     	 System.out.println(w4.getText());
     	 
     	
      	 
      	
     	 //Search the element by using PARENT
     	 
	 
	//Close the browser
    // driver.quit();

	}


}

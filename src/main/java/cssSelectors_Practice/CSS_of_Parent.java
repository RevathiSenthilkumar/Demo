package cssSelectors_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_of_Parent {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebElement w,w1,w3,w4;
		
		
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("http://hrm.pragmatictestlabs.com/symfony/web/index.php/auth/login");
     	//Search the element by using preceding method
     	boolean  	 flag =driver.findElement(By.cssSelector("//div#divUsername>input")).isDisplayed();
     	w=driver.findElement(By.cssSelector("//div#divUsername>input"));
     	 w.click();
     	 w.sendKeys("Hii");
     	 System.out.println("lable"+w.getText());
	
	//div#divUsername>input
	}
}

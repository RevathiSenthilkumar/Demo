package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AutoComplete {
	
	public static void main(String[] args)  {
		
	
	 //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
	//driver = BrowserConfiguration.browserSetup("https://www.google.com");
		/*
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://formy-project.herokuapp.com/autocomplete");
		 * 
		 * WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		 * autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
		 * 
		 * //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * 
		 * WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		 * autocompleteResult.click();
		 * 
		 * driver.quit();
		 */
	     //***********************************************
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://formy-project.herokuapp.com/autocomplete");

	        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
	        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

	       // WebDriverWait wait = new WebDriverWait(driver, 10);
	      //  WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

	     //   autocompleteResult.click();

	        driver.quit();
	        
	        
	        
	        
	        
	        
	        
 }

}


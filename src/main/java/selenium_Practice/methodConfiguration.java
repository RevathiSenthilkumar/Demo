package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class methodConfiguration {
	public static WebDriver driver;
	
	public static void textboxt_typing(By locator) {
	driver.findElement(locator).click();
	
		
	}

	public static void sendValue(By locator, String text ) {
	WebElement element=	driver.findElement(locator);
	element.click();
	element.sendKeys(text);
	
		}
	public static void scroll_down(By locator, String text, String text1 ) {
	
		WebElement element=	driver.findElement(locator);
	element.click();
			
		}
	public static void close() {
		driver.close();
	}
}
package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseUI {
	public static WebDriver driver =new ChromeDriver();
	
	public static void dropdown(By locator,String option) {
		WebElement dropdown= driver.findElement(locator);
		Select s = new Select(dropdown);
		s.selectByVisibleText(option);
	}
	public static void sendtexttofield(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	
	}
	public static void clicking(By locator) {
		driver.findElement(locator).click();
		
	
	}
	public static void clicking2(By locator,By locator2) {
			driver.findElement(locator);
		
	
	}
	public static void sendtexttofieldDate(By locator,String option) {
		WebElement datefield= driver.findElement( locator);
		datefield.sendKeys(option);
		datefield.sendKeys(Keys.RETURN);
	
	}
	
	public static void ClickMultiAnswer(By locator) {
		List<WebElement> numberOfSizes = driver.findElements(locator);
		
		
		System.out.println("size:"+numberOfSizes.size());
		
		
	}
	public static void close() {
		driver.close();
	}
}
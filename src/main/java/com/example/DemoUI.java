package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoUI {
	public static WebDriver driver;

	public static void cliking(By locator) {
		driver.findElement(locator).click();
	}

	public static void allleft_col_top(By locator) {
		List<WebElement> numberOfSizes = driver.findElements(locator);

		System.out.println("size:" + numberOfSizes.size());

	}
	public static void blockOfLinks(By locator) {
		List<WebElement> linksinForm = driver.findElements(locator);
		 System.out.println(linksinForm.size());
		 
		  Actions a=new Actions (driver);

		  for(int i=1; i<linksinForm.size(); i++) {
			  linksinForm = driver.findElements(locator);
		   a.moveToElement(linksinForm.get(i)).build().perform();
		   linksinForm.get(i).click();
		  }
	}
	public static void close() {
		driver.close();
	}

}

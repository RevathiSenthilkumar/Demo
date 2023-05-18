package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Mouseactions extends BaseUI {
	public static void main(String[] args) {
		// control+shift+o= auto to download

		/*
		 * WebDriver driver =
		 * BrowserConfiguration.browserSetup("https://www.google.com");
		 * driver.get("http://jqueryui.com/droppable"); WebElement frame
		 * =driver.findElement(By.className("demo-frame"));
		 * driver.switchTo().frame(frame); WebElement draggable =
		 * driver.findElement(By.id("draggable")); WebElement dropable =
		 * driver.findElement(By.id("droppable")); Actions a = new Actions(driver);
		 * a.clickAndHold(draggable).moveToElement(dropable).release(dropable).build().
		 * perform(); driver.close();
		 */

		/*
		 * WebDriver driver =
		 * BrowserConfiguration.browserSetup("https://www.google.com");
		 * driver.get("http://amazon.com"); WebElement span =
		 * driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span")); Actions
		 * s = new Actions(driver); s.moveToElement(span).build().perform();
		 * 
		 * // a.moveToElement(x).build().perform();
		 */	
		
		WebDriver driver =
			BrowserConfiguration.browserSetup("https://www.google.com");
				 driver.get("https://www.mycontactform.com");
				 WebElement span = driver.findElement(By.xpath("//*[@id=\"docs-main\"]/div[2]/scripta")); 
				 Actions s = new Actions(driver); 
				 s.moveToElement(span).build().perform();
		 
				 // a.moveToElement(x).build().perform();
	
	
	}
	
	
	
	
}
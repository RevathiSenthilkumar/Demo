package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMutipleLinks extends DemoUI {
	
public static 	WebDriver driver= new ChromeDriver();
	public static void main(String[] args) {
		 driver =
				BrowserConfiguration.browserSetup("https://www.mycontactform.com");
		
		driver.findElement(By.linkText("Sample Forms")).click();
		WebElement OpenBrowser=   driver.findElement(By.xpath("//div[@id=\'left_col_wrapper\']//ul[1]//li[1]//a"));
		System.out.println("child:"+OpenBrowser.findElements(By.tagName("h5")).size());
		//System.out.println("child:"+OpenBrowser.findElements(By.tagName("a")).size());
		
	}

}

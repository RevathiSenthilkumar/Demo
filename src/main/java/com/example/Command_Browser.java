package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Command_Browser {
	public static 	WebDriver driver= new ChromeDriver();
	public static void main(String[] args) {
		
	
	 driver =Configuration_Browser.getBrowser("https://www.google.com");
	driver.navigate().to("https://mycontactform.com");
	//driver.findElement(By.linkText("Sample Forms")).click();
	//driver.findElement(By.id("subject")).sendKeys("hooray!!");
	}
}

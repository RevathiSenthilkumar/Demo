package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Propertyfilehandling {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\revat\\JavaWorkspace\\SeleniumDemos\\ObjectRepository\\configuration.properties");
		p.load(fis);
	
		
		driver= BrowserConfiguration.browserSetup(p.getProperty("url"));
		driver.findElement(By.id("username_id")).sendKeys("Revathi");
		driver.findElement(By.id("password_id")).sendKeys("Revathi123");
	}
}


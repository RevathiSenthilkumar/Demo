package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfiguration {
	 //WebDriver driver = new ChromeDriver();
	public static  WebDriver browserSetup(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revat\\JavaWorkspace\\SeleniumDemos\\Driver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remove-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		
		 driver.manage().window().maximize();
			driver.get(url);
	return driver;
	
}
}
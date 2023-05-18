package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Alert_demo extends BaseUI {
	
	static By firstName = By.id("firstName");
	static By lastName = By.id("lastName");
	static By malerb = By.id("malerb");
	static By englishchbx = By.id("englishchbx");
	static By email = By.id("email");
	static By password = By.id("password");
	static By registerbtn = By.id("registerbtn");

	public static void main(String[] args) {
		//WebDriver driver = BrowserConfiguration.browserSetup("https://www.hyrtutorials.com/p/window-handles-practice.html#");
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html#");
		driver.findElement(By.xpath(""));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,200);", "");
		driver.findElement(By.id("newWindowBtn")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<>(windows);
		
		System.out.println("windowsList no of windows:" + windowsList.size());
		
		
		
		driver.switchTo().window(windowsList.get(1));
		driver.manage().window().maximize();
		
		sendtexttofield(firstName, "Krish");
		sendtexttofield(lastName, "Sen");
		clicking(malerb);
		clicking(englishchbx);
		sendtexttofield(email, "revrai7@gmail.com");
		sendtexttofield(password, "rev@123");
		clicking(registerbtn);

	}

}



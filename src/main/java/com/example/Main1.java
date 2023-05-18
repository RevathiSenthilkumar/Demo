package com.example;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main1 {
	static WebDriver driver = null;
	
	public static WebDriver getBrowser() {

		System.out.println("which websites do you what to open");
		Scanner k = new Scanner(System.in);
		String inputs = k.nextLine().toLowerCase();

		/*
		 * String a = "chromedriver"; String b = "firefoxdriver"; String c =
		 * " edgedriver"; String d = "safaridriver";
		 */
		
		if(inputs.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			System.out.println("launched sucessfully");
			}
			else	if(inputs.equalsIgnoreCase("firefox")) {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println("launched sucessfully");
				
				}
			else	if(inputs.equalsIgnoreCase("edge")) {
			//	else	if(inputs=="edge") {
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println("launched sucessfully");
				
				}
			else	if(inputs.equalsIgnoreCase("safari")){
			//else	if(inputs=="safari"){
				WebDriver driver = new SafariDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println("launched sucessfully");
				
				}
			
			//new SafariDriver();
			
			return driver;
		}

	public static void main(String[] args) {

		Main1.getBrowser();
		//getBrowser().close();

	}
}
/*
 * public static void getBrowser() {
 * 
 * System.out.println("which websites do you what to open"); Scanner k = new
 * Scanner(System.in); String inputs = k.nextLine().toLowerCase();
 * 
 * String a="chromedriver"; String b="firefoxdriver"; String c=" edgedriver";
 * String d="safaridriver";
 * 
 * { if (inputs == a) { WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize(); driver.get("https://www.google.com"); }
 * else if (inputs == b) { WebDriver driver = new FirefoxDriver();
 * driver.manage().window().maximize(); driver.get("https://www.google.com"); }
 * else if (inputs == c) { WebDriver driver = new EdgeDriver();
 * driver.manage().window().maximize(); // driver.get(url); } else if (inputs ==
 * d) { WebDriver driver = new SafariDriver();} //
 * driver.manage().window().maximize();} // driver.get(url); } }
 */

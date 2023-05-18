package com.example;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configuration_Browser {
	static WebDriver driver = null;

	public static WebDriver getBrowser(String url) {

		System.out.println("which websites do you what to open: \n"
				+ "choose anyone of these,chrome or firefox or edge or safari:");
		Scanner k = new Scanner(System.in);
		String inputs = k.nextLine().toLowerCase();

		if (inputs.equalsIgnoreCase("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\revat\\JavaWorkspace\\SeleniumDemos\\Driver\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remove-allow-origins=*");
			 WebDriver driver = new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.get(url);
			//System.out.println(inputs + "  launched sucessfully");

		} else if (inputs.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get(url);
			//System.out.println(inputs + "  launched sucessfully");

		} else if (inputs.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println(inputs + "  launched sucessfully");
			

		} else if (inputs.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			WebDriver driver = new SafariDriver();
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println(inputs + "  launched sucessfully");

		}
		
		

		return driver;
	}

}




/*
 * public static WebDriver BrowserSetup(String url) {
 * System.out.println("which websites do you what to open"); Scanner k= new
 * Scanner(System.in); String inputs= k.nextLine().toLowerCase(); String
 * chromedriver; String firefox; String edge; String safaridriver; String
 * operadriver;
 * 
 * 
 * if(inputs==chromedriver ) { WebDriver driver = new ChromeDriver(); } else
 * if(inputs==firefox ) { WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize(); driver.get(url); } else if(inputs==edge
 * ) { WebDriver driver = new EdgeDriver(); driver.manage().window().maximize();
 * driver.get(url); } else if(inputs==safaridriver ) { WebDriver driver = new
 * SafariDriver(); driver.manage().window().maximize(); driver.get(url); }
 * 
 * //new SafariDriver(); return null ;
 */

//}
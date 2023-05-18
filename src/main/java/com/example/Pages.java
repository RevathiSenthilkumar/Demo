package com.example;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Pages {
	
	    private static WebDriver driver;
	    private static Scanner reader;

	    public static void main(String[] args) throws InterruptedException
	    {
	        char ch;
	        do
	        {
	            System.out.println();
	            reader = new Scanner(System.in);
	            System.out.print("Please enter the browser name:  ");
	            driver = getDriver(reader.nextLine());
	            driver.get("http://qa-0.ls.vu");
	            System.out.print("Press q to quit followed by ENTER:  ");
	            reader = new Scanner(System.in);
	            ch = reader.next().charAt(0);
	        } while (ch != 'q');
	    }

	    public static WebDriver getDriver(String browserName)
	    {
	        WebDriver driver = null;
	        Browsers browser = Browsers.valueOf(browserName.toUpperCase());
	        switch (browser)
	        {
	            case FIREFOX:
	                System.out.println("Launching Firefox");
	                driver = new FirefoxDriver();
	                break;
	            case CHROME:
	                System.out.println("Launching Chrome");
	                System.setProperty("webdriver.chrome.driver", "E:\\workspace\\chromeDriver\\chromeDriver.exe");
	                driver = new ChromeDriver();
	                break;
	            case IE:
	                System.out.println("Launching IE");
	                System.setProperty("webdriver.ie.driver", "C:/Users/mkv/workspace/ServerDrivers/IEDriverServer.exe");
	                driver = new InternetExplorerDriver();
	                break;
	            default:
	                System.out.println("You have selected a browser that isn't available.");
	        }

	        return driver;
	    }

	    private enum Browsers
	    {
	        FIREFOX, CHROME, IE
	    }
}

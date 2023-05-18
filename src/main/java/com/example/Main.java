package com.example;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
	public static void main(String[] args) {
	
	Main.getBrowser();

	}

	public static void getBrowser() {

		System.out.println("which websites do you what to open");
		Scanner k = new Scanner(System.in);
		String inputs = k.nextLine().toLowerCase();
		String chromedriver=" ";
		String firefoxdriver = "";
		String edge = "";
		String safaridriver = "";
		// String operadriver;

		if (inputs == chromedriver) {
			WebDriver driver = new ChromeDriver();
		} else if (inputs == firefoxdriver) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		} else if (inputs == edge) {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			// driver.get(url);
		} else if (inputs == safaridriver) {
			WebDriver driver = new SafariDriver();
			driver.manage().window().maximize();
			// driver.get(url);
		}
		// new SafariDriver();

		
	}

}

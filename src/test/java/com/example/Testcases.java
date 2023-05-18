package com.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.POM.Sampleforms;
public class Testcases extends BaseUI {
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver.get("https://www.mycontactform.com");
		
		driver.manage().window().maximize();
	}

	@Test

	public void testcase1() {
		Sampleforms sample = new Sampleforms();
		System.out.println("testing the login with valid inputs");
		sample.subject("RWE");
	}

	@Test
	public void testcase2() {
		Sampleforms sample = new Sampleforms();
		System.out.println("testing the login with invalid inputs");
		sample.email("rev@gmail.com");
		// (driver,"reva");
	}

	@AfterClass
	public void tearsup() {
		System.out.println("close the drive");
		driver.close();
	}
}

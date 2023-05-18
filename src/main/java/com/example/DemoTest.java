package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import library.Browser;

public class DemoTest {
public static void main(String[] args) {
	Browser browser=new Browser(); // control,shift o enter
	browser.launchBrowser("https://www.google.com");//default browser method
	browser.navigateTo("https://mycontactform.com");
	//https://formy-project.herokuapp.com/
	
}
}

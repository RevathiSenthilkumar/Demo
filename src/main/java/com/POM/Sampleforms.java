package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.BaseUI;

public class Sampleforms extends BaseUI {
public static	WebDriver driver = new ChromeDriver();
static	By subject = By.id("subject");
static	By email = By.id("email");
	
	public void subject(String subjectdata) {
		sendtexttofield(subject,subjectdata);
	}
	public void email(String emaildata) {
		sendtexttofield(email,emaildata);
	}
}

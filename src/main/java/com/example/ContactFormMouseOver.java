package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContactFormMouseOver extends DemoUI {
	static By left_col_top = By.id("//*[@id='left_col_top']");
	static By sampleforms = By.linkText("Sample Forms");
	 static By links = By.xpath("//div[@id='left_col_wrapper']//ul//li/a");

	// left_col_top
	public static void main(String[] args) {
		
	
	WebDriver driver =
			BrowserConfiguration.browserSetup("https://www.mycontactform.com");
	
	driver.findElement(By.linkText("Sample Forms")).click();
	
	 List<WebElement> linksinContactForm = driver.findElements(links);
	 System.out.println(linksinContactForm.size());
	  Actions a=new Actions (driver);

	  for(int i=0; i<linksinContactForm.size(); i++) {
		  linksinContactForm = driver.findElements(links);
	   a.moveToElement(linksinContactForm.get(i)).build().perform();
	   linksinContactForm.get(i).click();
	  }
	
}
	
	
	
}


/*
 * //cliking(sampleforms); //allleft_col_top(left_col_top); //static By tagname
 * = By.tagName("select");
 * 
 * List<WebElement> numberOfSizes =
 * driver.findElements(By.xpath("//div[@id=\"left_col_wrapper\"][1]"));
 * 
 * //System.out.println("size:" + numberOfSizes.size()); for(int i=0;
 * i<=numberOfSizes.size()-1;i++) { numberOfSizes.get(i).click(); } WebElement
 * OpenBrowser1=
 * driver.findElement(By.xpath("//*[@id=\"left_col_top\"]/ul[1]"));
 * 
 * System.out.println("General Contact Forms: "+OpenBrowser1.findElements(By.
 * tagName("li")).size());
 * 
 * for(int i=0;i<OpenBrowser1.findElements(By.tagName("li")).size()-1;i++){
 * String opentabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
 * OpenBrowser1.findElements(By.tagName("ul")).get(i).sendKeys(opentabs); }
 * //WebElement span =
 * driver.findElement(By.xpath("//html/body/div[3]/div[1]/div[1]/ul[1]/li[1]/a")
 * ); //Actions s = new Actions(driver);
 * //s.moveToElement(span).build().perform();
 * 
 * String opentabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
 * OpenBrowser.findElements(By.tagName("h5")).get(i).sendKeys(opentabs);
 * 
 */

package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ParentChildRelationships_xpath extends DemoUI {
	public static WebDriver driver;
	static By left_col_top = By.id("//*[@id='left_col_top']");
	static By sampleforms = By.linkText("Sample Forms");
	static By links = By.xpath("//div[@id='left_col_wrapper']//ul//li/a");
	static By amazon_links1 = By.xpath("//*[@id='navFooter']/div[1]/div/div[1]//ul//li//a");
	static By amazon_links3 = By.xpath("//div[@id='navFooter']/div[1]/div/div[3]//ul//li//a");
	static By amazon_links5 = By.xpath("//div[@id='navFooter']/div[1]/div/div[5]//ul//li//a");
	static By allAmazon_links = By.xpath("//*[@id=\'navFooter\']/div[1]//ul//li//a");

	public static void main(String[] args) {
		driver = BrowserConfiguration.browserSetup("https://www.amazon.com");
		// driver.findElements(amazon_links).click();
		
		//blockOfLinks(amazon_links1);
		List<WebElement> GettoKnowUs_links1 = driver.findElements(amazon_links1);
		System.out.println(GettoKnowUs_links1.size());
		Actions a = new Actions(driver);
		for (int i = 1; i < GettoKnowUs_links1.size(); i++) {

			GettoKnowUs_links1 = driver.findElements(amazon_links1);
			a.moveToElement(GettoKnowUs_links1.get(i)).build().perform();

		}
		List<WebElement> MakeMoneywithUs_links3 = driver.findElements(amazon_links3);
		System.out.println(MakeMoneywithUs_links3.size());
		Actions a2 = new Actions(driver);
		for (int i = 1; i < MakeMoneywithUs_links3.size(); i++) {

			MakeMoneywithUs_links3 = driver.findElements(amazon_links3);
			a2.moveToElement(MakeMoneywithUs_links3.get(i)).build().perform();

		}
		List<WebElement> AmazonPaymentProducts5 = driver.findElements(amazon_links5);
		System.out.println(AmazonPaymentProducts5.size());
		Actions a5 = new Actions(driver);
		for (int i = 1; i < AmazonPaymentProducts5.size(); i++) {

			AmazonPaymentProducts5 = driver.findElements(amazon_links5);
			a5.moveToElement(AmazonPaymentProducts5.get(i)).build().perform();

		}
		List<WebElement> links = driver.findElements(allAmazon_links);
		System.out.println(links.size());
		Actions all = new Actions(driver);
		for (int i = 1; i < links.size(); i++) {

			links = driver.findElements(allAmazon_links);
			all.moveToElement(links.get(i)).build().perform();

		}
	}

}
////*[@id="navFooter"]/div/div/div[3]//ul//li//a
/*
 * 
 * /*public static void blockOfLinks(By locator) { List<WebElement>
 * linksinContactForm = driver.findElements(locator);
 * System.out.println(linksinContactForm.size());
 * 
 * Actions a=new Actions (driver);
 * 
 * for(int i=1; i<linksinContactForm.size(); i++) { linksinContactForm =
 * driver.findElements(locator);
 * a.moveToElement(linksinContactForm.get(i)).build().perform();
 * linksinContactForm.get(i).click(); }}
 * 
 */
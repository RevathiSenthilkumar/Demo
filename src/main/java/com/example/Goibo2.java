package com.example;

import java.time.Duration;
import java.util.Formatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibo2 extends BaseUI {
	// static By From_location=
	// By.xpath("//*[@id=\'content\']/div/div[1]/div[5]/div/div/div[1]/div/div[1]/input");
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver =
		// BrowserConfiguration.browserSetup("https://www.ixigo.com/");
		// String input= keyboard.nextLine();

		String expMonth = "May";
		String expYear = "2023";
		String ExpDate = "19";
		String ExpYear2 = "2023";
		String ExpMonth2 = "june";
		String ExpDate2 = "3";
		driver.navigate().to("https://www.ixigo.com/");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys("bangalore");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		while (true) {

			{
				Thread.sleep(500);
				String monthYear = driver.findElement(By.xpath("//div[@class='rd-month-label'][1]")).getText();
				Thread.sleep(1000);
				String arr[] = monthYear.split(" ");
				Thread.sleep(500);
				
				if (arr[0].equalsIgnoreCase(expMonth) && arr[1].equals(expYear))

					break;

				else
					Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
				Thread.sleep(1000);

			}
			
			List<WebElement> allDates = driver.findElements(By.cssSelector("div.day.has-info"));
			Thread.sleep(500);
			Thread.sleep(2000);
			for (int i=0;i<allDates.size();i++) {
				Thread.sleep(2000);
				String date = allDates.get(i).getText();
				Thread.sleep(2000);
				if (date.equalsIgnoreCase(ExpDate)) {
					Thread.sleep(2000);

					allDates.get(i).click();
					Thread.sleep(2000);

					break;

				}

				WebElement Return = driver.findElement(By.cssSelector("input.c-input[placeholder='Return']"));
				Thread.sleep(300);
				Return.click();
					
						driver.findElement(By.cssSelector("input#passenger-list")).click();
						WebElement passenger_listClass1 = driver
								.findElement(By.xpath(" (//span[contains(text(),'2')])[1]"));
						passenger_listClass1.click();
						WebElement passenger_listClass2 = driver
								.findElement(By.xpath(" (//span[contains(text(),'0')])[2]"));
						passenger_listClass2.click();
						WebElement passenger_listClass3 = driver
								.findElement(By.xpath(" (//span[contains(text(),'2')])[3]"));
						passenger_listClass3.click();
						WebElement passenger_listClass4 = driver
								.findElement(By.xpath("//span[contains(@class,'radio-list')]//div[3]//span[1]"));
						passenger_listClass4.click();
						Thread.sleep(500);

						 WebElement search =
						 driver.findElement(By.xpath("(//div[contains(@class,'u-ripple')])[1]"));
						Thread.sleep(300);
						 search.click();
						Thread.sleep(300);
					}

				}
			}
		
	
}

/*
 * WebElement Return =
 * driver.findElement(By.cssSelector("input.c-input[placeholder='Return']"));
 * Thread.sleep(300); Return.click(); Return.sendKeys("23 Apr, Sun");
 * Thread.sleep(500); WebElement Return1 = driver .findElement(By.xpath(
 * "//html/body/div[7]/div[2]/div[1]/table/tbody/tr[5]/td[1]/div[1]"));
 * Return1.click(); Return1.click(); WebElement close_key =
 * driver.findElement(By.xpath(
 * "//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[6]/button"));
 * Thread.sleep(600); close_key.click(); close_key.sendKeys(Keys.RETURN);
 * Thread.sleep(600); WebElement Return =
 * driver.findElement(By.cssSelector("input.c-input[placeholder='Return']"));
 * Thread.sleep(300); Return.click(); } Thread.sleep(200);
 * 
 * 
 * 
 * 
 * WebElement Return =
 * driver.findElement(By.xpath("//input[@placeholder='Return']"));
 * Thread.sleep(600); Return.click();
 * 
 * 
 * while (true) {
 * 
 * { Thread.sleep(500);
 * 
 * String monthYear2 =
 * driver.findElement(By.xpath("(//div[@class='rd-month'])[2]")).getText();
 * Thread.sleep(500); String ar[] = monthYear2.split(" "); String Month2 =
 * ar[0]; String Year2 = ar[1];
 * 
 * 
 * 
 * Thread.sleep(1000); if (Month2.equalsIgnoreCase(ExpMonth2) &&
 * Year2.equals(ExpYear2)) break;
 * 
 * else Thread.sleep(100);
 * driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).
 * click();
 * 
 * } List<WebElement> allDates2 =
 * driver.findElements(By.xpath("(//table[@class='rd-days'])[2]//td"));
 * Thread.sleep(10); for (WebElement element : allDates2) { String date2 =
 * element.getText(); if (date2.equals(ExpDate2)) { Thread.sleep(1000);
 * element.click(); break;
 * 
 * }
 * 	WebElement Return = driver.findElement(By.xpath("//input[@placeholder='Return']"));
				Thread.sleep(600);
				Return.click();

				while (true) {

					{
						Thread.sleep(500);

						String monthYear2 = driver.findElement(By.xpath("(//div[@class='rd-month'])[2]")).getText();
						Thread.sleep(500);
						String ar[] = monthYear2.split(" ");
						String Month2 = ar[0];
						String Year2 = ar[1];

						Thread.sleep(1000);
						if (Month2.equalsIgnoreCase(ExpMonth2) && Year2.equals(ExpYear2))
							break;

						else
							Thread.sleep(100);
						driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();

					}
					List<WebElement> allDates2 = driver.findElements(By.xpath("(//table[@class='rd-days'])[2]//td"));
					Thread.sleep(10);
					for (WebElement element1 : allDates2) {
						String date2 = element1.getText();
						if (date2.equals(ExpDate2)) {
							Thread.sleep(1000);
							element1.click();
							break;

						}
 */

// WebElement passenger_list =
// driver.findElement(By.cssSelector("input#passenger-list"));

// passenger_list.sendKeys(Keys.RETURN); (//span[contains(text(),'2')])[1]
// Thread.sleep(300);

//// *[@id="content"]/div/div[1]/div[5]/div/div/div[6]/button
//// div[class='banner'] button:nth-child(1)

//https://www.ixigo.com/

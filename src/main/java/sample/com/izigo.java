package sample.com;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class izigo {

	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver =
		// BrowserConfiguration.browserSetup("https://www.ixigo.com/");
		// Scanner keyboard = new Scanner(System.in);
		// String input= keyboard.nextLine();
		String ExpMonth = "May";
		String ExpYear = "2023";
		String ExpDate = "3";
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
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys(Keys.ENTER);
		// WebElement searchText =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys("bangalore");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys(Keys.ENTER);
		

		while (true) {

			{
				Thread.sleep(500);
				String monthYear = driver.findElement(By.xpath("//div[@class='rd-month-label'][1]")).getText();
				Thread.sleep(500);
				String arr[] = monthYear.split(" ");
				String Month = arr[0];
				String Year = arr[1];

				if (Month.equalsIgnoreCase(ExpMonth) && Year.equals(ExpYear))
					break;

				else
					Thread.sleep(500);
					driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();

			}
			List<WebElement> allDates = driver.findElements(By.xpath("//tbody[@class='rd-days-body'][1]//td"));
			Thread.sleep(500);
			for (WebElement element : allDates) {
				String date = element.getText();
				if (date.equals(ExpDate)) {

					element.click();
					break;

				}

			}
			Thread.sleep(200);
			WebElement Return = driver.findElement(By.cssSelector("input.c-input[placeholder='Return']"));
			Thread.sleep(100);
			Return.click();
		}
		

		
		
		 driver.findElement(By.cssSelector("input#passenger-list")).click();
			WebElement passenger_listClass1 = driver.findElement(By.xpath (" (//span[contains(text(),'2')])[1]"));
			passenger_listClass1.click();
			WebElement passenger_listClass2 = driver.findElement(By.xpath (" (//span[contains(text(),'0')])[2]"));
			passenger_listClass2.click();
			WebElement passenger_listClass3 = driver.findElement(By.xpath (" (//span[contains(text(),'2')])[3]"));
			passenger_listClass3.click();
			WebElement passenger_listClass4 = driver.findElement(By.xpath ("//span[contains(@class,'radio-list')]//div[3]//span[1]"));
			passenger_listClass4.click();
			Thread.sleep(500);
	}
}

/*
 * while (true) {
 * 
 * { Thread.sleep(500); String monthYear =
 * driver.findElement(By.xpath("(//div[@class='rd-month-label'])[2]")).getText()
 * ; String arr[] = monthYear.split(" "); String Month = arr[0]; String Year =
 * arr[1];
 * 
 * if (Month.equalsIgnoreCase(ExpMonth2) && Year.equals(ExpYear2)) break;
 * 
 * else Thread.sleep(500);
 * driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).
 * click();
 * 
 * } List<WebElement> allDates =
 * driver.findElements(By.xpath("(//tbody[@class='rd-days-body'])[2]//td")); for
 * (WebElement element : allDates) { String date = element.getText(); if
 * (date.equals(ExpDate2)) { element.click(); break;
 * 
 * } } }
 * 
 * 
 * Thread.sleep(600); WebElement Return =
 * driver.findElement(By.cssSelector("input.c-input[placeholder='Return']"));
 * Thread.sleep(600); Return.click();
 * 
 * 
 * 
 * //(//table[@class='rd-days'])[2] (//table[@class='rd-days'])[2]//td
 * 
 * /* public static void selectDatePicker(String ExpMonth ,String ExpYear ,
 * String ExpDate) throws InterruptedException{ while (true) {
 * 
 * { Thread.sleep(500); String monthYear =
 * driver.findElement(By.xpath("//div[@class='rd-month-label'][1]")).getText();
 * String arr[] = monthYear.split(" "); String Month = arr[0]; String Year =
 * arr[1];
 * 
 * if (Month.equalsIgnoreCase(ExpMonth) && Year.equals(ExpYear)) break;
 * 
 * else Thread.sleep(500);
 * driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).
 * click();
 * 
 * } List<WebElement> allDates =
 * driver.findElements(By.xpath("//tbody[@class='rd-days-body'][1]//td")); for
 * (WebElement element : allDates) { String date = element.getText(); if
 * (date.equals(ExpDate)) { element.click(); break;
 * 
 * }
 * 
 * } }
 * 
 * } while (true) {
 * 
 * { Thread.sleep(500); String monthYear =
 * driver.findElement(By.xpath("//div[@class='rd-month-label'][1]")).getText();
 * String arr[] = monthYear.split(" "); String Month = arr[0]; String Year =
 * arr[1];
 * 
 * if (Month.equalsIgnoreCase(ExpMonth) && Year.equals(ExpYear)) break;
 * 
 * else Thread.sleep(500);
 * driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).
 * click();
 * 
 * } List<WebElement> allDates =
 * driver.findElements(By.xpath("//tbody[@class='rd-days-body'][1]//td")); for
 * (WebElement element : allDates) { String date = element.getText(); if
 * (date.equals(ExpDate)) { element.click(); break;
 * 
 * }
 * 
 * }
 */
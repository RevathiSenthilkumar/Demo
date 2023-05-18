package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goibo extends BaseUI {
	// static By From_location=
	// By.xpath("//*[@id=\'content\']/div/div[1]/div[5]/div/div/div[1]/div/div[1]/input");
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver =
		// BrowserConfiguration.browserSetup("https://www.ixigo.com/");
		driver.navigate().to("https://www.ixigo.com/");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement From_location = driver
				.findElement(By.xpath("//*[@id=\'content\']/div/div[1]/div[5]/div/div/div[1]/div/div[1]/input"));
		From_location.click();
		From_location.sendKeys("BLR - Bengaluru");
		Thread.sleep(300);
		From_location.sendKeys(Keys.ENTER);
		WebElement autoComplete = driver
				.findElement(By.xpath("//*[@id=\'content\']/div/div[1]/div[5]/div/div/div[3]/div/div[1]/input"));

		Thread.sleep(300);
		autoComplete.sendKeys("MAA - Chennai");
		WebElement autoCompleteResult = driver
				.findElement(By.xpath("//*[@id=\'content\']/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/input"));
		Thread.sleep(300);
		autoCompleteResult.sendKeys(Keys.TAB);
		Thread.sleep(300);

		autoCompleteResult.sendKeys(Keys.RETURN);

		WebElement DepatureClick = driver.findElement(By.cssSelector("input.c-input[placeholder='Depart']"));
		Thread.sleep(600);
		DepatureClick.click();

		WebElement Return = driver.findElement(By.cssSelector("input.c-input[placeholder='Return']"));
		Thread.sleep(300);
		Return.click();
		Return.sendKeys("23 Apr, Sun");
		Thread.sleep(500);
		WebElement Return1 = driver
				.findElement(By.xpath("//html/body/div[7]/div[2]/div[1]/table/tbody/tr[5]/td[1]/div[1]"));
		Return1.click();
		Return1.click();
		Thread.sleep(600);

		WebElement passenger_list = driver.findElement(By.cssSelector("input#passenger-list"));

		Thread.sleep(500);

		// passenger_list.sendKeys(Keys.RETURN);
		// Thread.sleep(300);

		WebElement close_key = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[6]/button"));
		Thread.sleep(600);
		close_key.click();
		close_key.sendKeys(Keys.RETURN);
		Thread.sleep(600);

		WebElement search = driver.findElement(By.xpath(""));
		Thread.sleep(300);
		search.click();
		Thread.sleep(300);

	}////*[@id="content"]/div/div[1]/div[5]/div/div/div[6]/button   div[class='banner'] button:nth-child(1)
}

//https://www.ixigo.com/
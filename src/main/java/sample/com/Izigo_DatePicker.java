package sample.com;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.BrowserConfiguration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Izigo_DatePicker {
	
	public static WebDriver driver = new ChromeDriver();
	 
	  

		public static void main(String[] args) throws InterruptedException {
			
			
			 Scanner s= new Scanner(System.in);
			  System.out.println("which month you want to travel");
			  String expMonth_D = s.nextLine();
			  
			  System.out.println("which date you want to travel");
			  String ExpDate_D = s.nextLine();
			  
			  System.out.println("which month you want to return");
			  String expMonth_R = s.nextLine();
			  
			  System.out.println("which date you want to return");
			  String ExpDate_R = s.nextLine();
			  
			  driver = BrowserConfiguration.browserSetup("https://www.ixigo.com");
			 
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			Dimension d = new Dimension(1280, 1024);
			driver.manage().window().setSize(d);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			// click on calendar
			driver.findElement (By.xpath ("(//input[@placeholder='Depart'])[1]")).click ();
			new WebDriverWait (driver, Duration.ofSeconds (5))
			.until (ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody[@class='rd-days-body']")));
		

		
			
			  
			 
			  
			  
			  
			  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).click();
			  driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys("chennai");
			  driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys(Keys.ENTER);
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).click();
			  driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys("bangalore");
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys(Keys.ENTER);
			  
			    
			  while(true) {
			   String monthYear=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			   System.out.println("monthYear:" + monthYear); 
			   String[]month = monthYear.split(" ");
			   System.out.println("monthof depature:" + month[0]); 
			   if(month[0].equalsIgnoreCase(expMonth_D)) {
			    break;
			   }
			   else {
			    driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next'][1]")).click();
			    Thread.sleep(1000);
			   }
			  }
			  driver.findElement(By.xpath("//div[@class='day has-info'][normalize-space()='"+ExpDate_D+"']")).click();
			  
			  WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(2));
			  waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Return')]"))));
			  
			  driver.findElement(By.xpath("//div[contains(text(),'Return')]")).click();
			  Thread.sleep(2000);
			  
			  
			  while(true) {
			   String monthYearForReturn=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			   System.out.println("mon_text2:" + monthYearForReturn); 
			   String[]month2 = monthYearForReturn.split(" ");
			   System.out.println("monthofReturn:" + month2[0]); 
			   if(month2[0].equalsIgnoreCase(expMonth_R)) {
			    break;
			   }
			   else {
			    driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next'][1]")).click();
			    Thread.sleep(1000);
			   }
			  }
	WebElement w=		  driver.findElement(By.xpath("//div[@class='day has-info'][normalize-space()='"+ExpDate_R+"']"));
	
			  
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
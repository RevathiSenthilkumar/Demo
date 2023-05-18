package sample.com;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.BrowserConfiguration;

public class RedBusDatePicker {
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("prefered month");

		//String ExpMonth = keyboard.nextLine();
		System.out.println("prefered year");
		//String ExpYear = keyboard.nextLine();
		System.out.println("prefered date");
		//String date = keyboard.nextLine();
Thread.sleep(2000);
String ExpMonth="June";
String ExpYear="2024";
String ExpDate="3";




driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.redbus.com/");
		Dimension d = new Dimension(1280, 1024);
		driver.manage().window().setSize(d);
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		while (true) {

			{
				Thread.sleep(500);
				String monthYear = driver.findElement(By.xpath("(//td[@class='monthTitle'])")).getText();
				String arr[] = monthYear.split(" ");
				String Month = arr[0];
				String Year = arr[1];

				if (Month.equalsIgnoreCase(ExpMonth) && Year.equals(ExpYear))
					break;

				
				else
					Thread.sleep(500);
					driver.findElement(By.xpath("(//button[normalize-space()='>']")).click();

			}
	List<WebElement> allDates=		driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
			for (WebElement element:allDates) {
				String date =element.getText();
				if(ExpDate.equals(date)) {
					element.click();
					break;
					////div[@class='rd-month']//table[@class='rd-days']//td
				}
			}
		}

	}
}
//	String monthText = driver.findElement(By.xpath("")).getText();
package sample.com;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.example.BrowserConfiguration;

public class Alert_demo {
	WebDriver driver= new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BrowserConfiguration
				.browserSetup("https://clarle.github.io/yui3/yui/docs/charts/charts-pie.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,350);", "");
	WebElement ele1=	driver.findElement(By.xpath("//*[@id=\"docs-main\"]/div[2]/script"));
	ele1.getSize();
	 Thread.sleep(2000);
	 System.out.println(ele1.getSize());
	
	
	
	}

}
/*
// driver.findElement(By.xpath("//*[@id=\'alertBox\']")).click();
 * Actions s = new Actions(driver); 
	 s.moveToElement(ele1).build().perform();
	String color =ele1.getText();
	System.out.println(color);
 
		// driver.findElement(By.xpath("//*[@id=\'confirmBox\']")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<>(windows);
		System.out.println("windowsList no of windows:" + windowsList.size());
		driver.switchTo().window(windowsList.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Krish");
		driver.findElement(By.id("lastName")).sendKeys("Sen");
		driver.findElement(By.id("malerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("revrai7@gmail.com");
		driver.findElement(By.id("password")).sendKeys("rev@123");
		driver.findElement(By.id("registerbtn")).click();

*/
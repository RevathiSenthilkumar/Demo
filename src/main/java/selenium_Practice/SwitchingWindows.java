package selenium_Practice;

import org.openqa.selenium.WebDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.BrowserConfiguration;

public class SwitchingWindows {
public static	WebDriver	driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		
	//WebDriver	driver = BrowserConfiguration.browserSetup("https://www.google.com");
		
	driver.get("https://accounts.google.com/signup");
	Dimension d = new Dimension(1280,1024);
	driver.manage().window().setSize(d);
	
	
	driver.findElement(By.xpath("//a[text()='Help']")).click();
	System.out.println("The parant window: " + driver.getTitle());//
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> it = ids.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId);
	System.out.println("Switched to child window: " + driver.getTitle());
	
	driver.switchTo().window(parentId);
	System.out.println("Switch back to parent window: " + driver.getTitle());
	
	Thread.sleep(5000);
	driver.quit();					
}

}

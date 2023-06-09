package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemoDemoqa {
	
public static 	WebDriver driver = new EdgeDriver();
	public static void main(String[] args) throws InterruptedException {
		

		driver.get("https://demoqa.com/text-box");

		// Single slash “/” to validate image at start of page
		Boolean imgFlag = driver.findElement(By.xpath("/html/body/div/header/a/img")).isDisplayed();
		Thread.sleep(300);
		System.out.println("The image is displayed : " + imgFlag);
		Thread.sleep(300);
		// Double slash “//” to validate image
		Boolean img_Flag = driver.findElement(By.xpath("//img")).isDisplayed();
		Thread.sleep(300);
		System.out.println("The image is displayed (located by //) : " + img_Flag);

		// Address sign “@” full name textbox
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("Full Name");
		Thread.sleep(300);

		// Dot “.” - Full name texbox
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]/.")).sendKeys("Full Name");
		Thread.sleep(300);

		// Double dot “..” - Full name label
		String label = driver.findElement(By.xpath("//input[contains(@id, 'userN')]/../../div/label")).getText();
		System.out.println("The label of full text is : " + label);

		// Asterisk “*” - Full Name textbox
		driver.findElement(By.xpath("//div[contains(@id, 'userName-wrapper')]/div[2]/*")).sendKeys("Full Name");
		Thread.sleep(300);

		// Address and Asterisk “@*” - full name text box
		driver.findElement(By.xpath("//input[@*= 'userName']")).sendKeys("Full Name");
		Thread.sleep(300);
		// Pipe “|” - to locate both full name and Email label
		List<WebElement> lst = driver.findElements(By.xpath("//label[@*= 'userName-label']|//label[@*= 'userEmail-label']"));
		Thread.sleep(1000);
		// Iterating and printing both labels
		for (WebElement e : lst) {
			System.out.println(" The label is : " + e.getText());
		}

	}



	}



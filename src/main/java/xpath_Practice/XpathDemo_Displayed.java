package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo_Displayed {
	public static WebDriver driver = new EdgeDriver();

	public static void main(String[] args) {
		/*
		 * https://demoqa.com/webtables Opening web table page
		 */

		driver.get("https://www.lambdatest.com/blog/complete-guide-for-using-xpath-in-selenium-with-examples/");

		// Get the last node - Last val in table
		boolean signUp = driver.findElement(By.xpath("//a[text()='Sign Up']")).isDisplayed();
		System.out.println("The last table element is displayed : " + signUp);
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		// Get the 2 node - validate 2 position in table
		boolean fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name*']")).isDisplayed();
		System.out.println("The 2nd table element is displayed : " + fullName);
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Full Name*']"));
		Name.click();
		Name.sendKeys("Meaows");
		boolean mail = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		System.out.println("The 3rd table element is displayed : " + mail);
		WebElement email = driver.findElement(By.xpath("//input[@name='email' and contains(@placeholder,Email)]"));
		email.click();
		email.sendKeys("hotatat@gmail.com");
		boolean pw = driver.findElement(By.xpath("//input[@placeholder='Desired Password*']")).isDisplayed();
		System.out.println("The 4th table element is displayed : " + pw);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Desired Password*']"));
		password.click();
		password.sendKeys("hotatat@gmail.com");
		boolean phone = driver.findElement(By.xpath("//input[@placeholder='Phone*']")).isDisplayed();
		System.out.println("The 5th table element is displayed : " + phone);
		WebElement phoneNum = driver.findElement(By.xpath("//input[@placeholder='Phone*']"));
		phoneNum.click();
		phoneNum.sendKeys("hotatat@gmail.com");
		
		boolean phone2 = driver.findElement(By.xpath("//input[@name='phone' and starts-with(@placeholder,'Phone*')]")).isDisplayed();
		System.out.println("The 2nd table element is displayed : " + phone2);
		WebElement Phone21 = driver.findElement(By.xpath("//input[@placeholder='Full Name*']"));
		Phone21.click();
		Phone21.clear();
		Phone21.sendKeys("1234567");
		
		
		
		
		boolean gmailsignup = driver.findElement(By.xpath("//input[@placeholder='Phone*']")).isDisplayed();
		System.out.println("The 6th table element is displayed : " + gmailsignup);
		WebElement gmailSignup = driver.findElement(By.xpath("//a[contains(@data-amplitude,'R_google')]"));
		gmailSignup.click();
		driver.navigate().to("");
		
		
		
		
		//gmailSignup.sendKeys("hotatat@gmail.com");

		// driver.quit(); //input[@placeholder='Phone*']  ////a[contains(@data-amplitude,'R_google')]
	}

}

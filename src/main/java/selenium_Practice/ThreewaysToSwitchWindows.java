package selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreewaysToSwitchWindows {

	/*
	 * driver.switchTo().window("windowName"); driver.switchTo.window("frameName");
	 * driver.switchTo().window(""); driver.switchTo().alert();
	 */

	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		driver.get("https://formy-project.herokuapp.com/switch-window");

		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();

		String originalHandle = driver.getWindowHandle();// parent window

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}

		driver.switchTo().window(originalHandle);

		driver.quit();
		// ****************************************************************
		
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.quit();
//**************************************************************
		driver.get("https://formy-project.herokuapp.com/modal");
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();

		WebElement closeButton = driver.findElement(By.id("close-button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", closeButton);

		driver.quit();

	}

}

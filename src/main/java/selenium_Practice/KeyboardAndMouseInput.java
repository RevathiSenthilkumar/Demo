package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.BrowserConfiguration;


  public class KeyboardAndMouseInput extends methodConfiguration {
	  
	  static By name = By.id("name");
	  static By button = By.id("button");
	static   By first_name= By.id("first-name");
	 static By logo = By.id("logo");
	static By compleateform = By.cssSelector("a.btn btn-lg");
	public static void main(String[] args) {

		driver = BrowserConfiguration.browserSetup("https://www.google.com");
		
		driver.navigate().to("https://formy-project.herokuapp.com/keypress");

		sendValue(name,"Revathi");
		textboxt_typing(button);
		
		textboxt_typing(logo);
		
		textboxt_typing(compleateform);
		
		sendValue(name,"Revathi Senthilkumar");
		close();
		
}

  }
package library;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver driver;

	public void ChooseDefaultBrowser(String url) {
		ChooseBrowser("chrome", url);
	}

	public void launchBrowser(String url) {
		System.out.println("which websites do you what to open: \n"
				+ "choose anyone of these browser ,chrome (or) firefox (or) edge (or) safari:");
		Scanner k = new Scanner(System.in);
		String browserType = k.nextLine().toLowerCase();
		ChooseBrowser(browserType, url);
		driver.manage().window().maximize();
		driver.get(url);
		driver.close();
		System.out.println(browserType + " launched sucessfully");
	}

	public void ChooseBrowser(String browserType, String url) {// method overloading
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\revat\\JavaWorkspace\\SeleniumDemos\\Driver\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remove-allow-origins=*");
			 WebDriver driver = new ChromeDriver(options);

		} else if (browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); // instead of writing this ,we can use create()--->need add dependency

		} else if (browserType.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browserType.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public void navigateTo(String url) {
		driver.get(url);
		// if this need, add it ---->//browser.navigateTo("https://www.google.com");
		// specific browser method
	}

	public void close() {
		driver.close();
	}

}

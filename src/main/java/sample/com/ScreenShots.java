package sample.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws IOException {
		int[] data = new int[10];
		  
		  for(int i=0;i < data.length ;i++)
		  {
		    data[i] = i;
		    System.out.println(data[i]);
		  }  
		//driver.navigate().to("https://www.Google.com"); 
		TakesScreenshot takescr = ((TakesScreenshot)driver);
		File src = takescr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\revat\\JavaWorkspace\\SeleniumDemos\\screenshots\\reva.jpg"));
	}

}

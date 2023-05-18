package sample.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbusCom {
	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws Exception  {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://www.redbus.com/");
Dimension d = new Dimension(1280, 1024);
driver.manage().window().setSize(d);
Thread.sleep(500);
//Thread.sleep(2000);
String ExpMonth="June";
String ExpYear="2024";
String ExpDate="3";
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));

WebElement depat= driver.findElement(By.cssSelector("input#src"));
depat.click();

depat.sendKeys("Paris Beauvais Airport");
Thread.sleep(300);
WebElement autocomplete1=driver.findElement(By.cssSelector("//div[@class='autoFill autosuggest-ul rdc-src']"));
Thread.sleep(300);
autocomplete1.sendKeys(Keys.ENTER);
////div[@class='autoFill autosuggest-ul rdc-src']

WebElement desti=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#dest")));
desti.click();
desti.sendKeys("Paris Charles de");
WebElement autocomplete2=driver.findElement(By.cssSelector("//div[@class='autoFill autosuggest-ul rdc-src']"));
Thread.sleep(300);
autocomplete1.sendKeys(Keys.ENTER);
//WebElement

//WebElement dateWidgetFrom = wait.until( ExpectedConditions.elementToBeClickable(By.cssSelector("div[class$='r-16dba41 r-q4m81j']")));

//List<WebElement> cellsOfArrivalDate = wait.until(
//ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("section:nth-of-type(2) > .lightpick__days > div")));
}
}

package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_demoqaWebtables {
	
public static	WebDriver driver = new EdgeDriver();
	public static void main(String[] args) {
		/* https://demoqa.com/webtables
		 * Opening web table page
		 */

		driver.get("https://demoqa.com/webtables");

		// Get the last node - Last val in table
		boolean lstCol = driver.findElement(By.xpath("//div[@class='rt-tr -odd']/div[last()]")).isDisplayed();
		System.out.println("The last table element is displayed : " + lstCol);

		// Get the 2 node - validate 2 position in table
		boolean positionCol = driver.findElement(By.xpath("//div[@class='rt-tr -odd']/div[position()='2']")).isDisplayed();
		System.out.println("The 2nd table element is displayed : " + positionCol);

		//driver.quit(); demoqaWebtables
	}
		
	

}

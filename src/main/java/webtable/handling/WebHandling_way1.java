package webtable.handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.BaseUI;

import samples.BrowserConfiguration;

public class WebHandling_way1 extends BaseUI {
	
	public static WebDriver driver;
	static By row=By.xpath("//table[2]//thead//tr[1]//th");
	static By row1=By.xpath("//table[2]/tbody/tr[1]/td");
	static By row2=By.xpath("//table[2]/tbody/tr[2]/td");
	static By row3=By.xpath("//table[2]/tbody/tr[3]/td");
	static By row4=By.xpath("//table[2]/tbody/tr[4]/td");
	static By row5=By.xpath("//table[2]/tbody/tr[5]/td");
	static By row6=By.xpath("//table[2]/tbody/tr[6]/td");
	static By row7=By.xpath("//table[2]/tbody/tr[7]/td");
	static By row8=By.xpath("//table[2]/tbody/tr[8]/td");
	static By row9=By.xpath("//table[2]/tbody/tr[9]/td");
	static By row10=By.xpath("//table[2]/tbody/tr[10]/td");
	static By row11=By.xpath("//table[2]/tbody/tr[11]/td");
	static By row12=By.xpath("//table[2]/tbody/tr[12]/td");
	static By row13=By.xpath("//table[2]/tbody/tr[13]/td");
	static By row14=By.xpath("//table[2]/tbody/tr[14]/td");
	
	
	public  WebHandling_way1(WebDriver driver ){
		this.driver=driver;
		}
	

	public static void datahandling(List<String> data, int rowindex) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\revat\\JavaWorkspace\\POMdemo1\\testData_xlsx\\test_data.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet5");

		int i = 0;
		Row row = sheet.createRow(rowindex);
		for (String value : data) {
			Cell cell = row.createCell(i++);
			cell.setCellValue(value);
		}

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\revat\\JavaWorkspace\\POMdemo1\\testData_xlsx\\test_data.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("data written successfully:"+rowindex);
	}
	
	
	public static void Line(By locator,int index) throws IOException {
		List<String> table = new ArrayList<>();
		List<WebElement> table1= driver.findElements(locator);
		//int row = 0;
		{
			for (int i = 0; i < table1.size(); i++) {
				table.add(table1.get(i).getText());
			}
			
			datahandling(table, index);
		}
		//row++;
}
	
	
		
		

	public static void main(String[] args) throws IOException {

		driver = BrowserConfiguration
				.browserSetup("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		// Dimension d = new Dimension(1280, 1024);
		// driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,950);", "");
		Line(row,0);
		Line(row1,1);

		Line(row2,2);
		Line(row3,3);
		Line(row4,4);
		Line(row5,5);
		Line(row6,6);
		Line(row7,7);
		Line(row8,8);
		Line(row9,9);
		Line(row10,10);
		Line(row11,11);
		Line(row12,12);
		Line(row13,13);
		Line(row14,15);
}

	
	
	
	
	
	
	
	
}
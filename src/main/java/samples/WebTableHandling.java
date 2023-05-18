package samples;

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
import org.openqa.selenium.WebElement;

import com.example.BaseUI;

public class WebTableHandling extends BaseUI {
	public static void datahandling(List<String> data) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\revat\\JavaWorkspace\\POMdemo1\\testData_xlsx\\test_data.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet2");
		Row row = sheet.createRow(0);
		int i = 0;
		for (String value : data) {
			Cell cell = row.createCell(i++);
			cell.setCellValue(value);

		}
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\revat\\JavaWorkspace\\POMdemo1\\testData_xlsx\\test_data.xlsx");
		workbook.write(fos); 
		fos.close();
		System.out.println("data written successfully");
	}

	
	
	
	public static void main(String[] args) throws IOException {

		driver = BrowserConfiguration
				.browserSetup("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		//Dimension d = new Dimension(1280, 1024);
		//driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement table = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody"));
	int rows=	table.findElements(By.xpath("tr")).size();
	for(int r=1;r<rows;r++) {
		String rr=table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
		System.out.println(rr);
	}
	
	
	
	
	
	
	
	
	
	}
}////*[@id="mw-content-text"]/div[1]/table[2]/tbody/tr[1]
package sample.com;

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
import org.openqa.selenium.WebElement;

import com.example.BaseUI;
import com.example.BrowserConfiguration;

public class Rev_WebTableHandling extends BaseUI {
	public static void datahandling(List<String> data, int rowindex) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\revat\\JavaWorkspace\\POMdemo1\\testData_xlsx\\test_data.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet3");

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

	public static void main(String[] args) throws IOException {

		driver = BrowserConfiguration
				.browserSetup("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		// Dimension d = new Dimension(1280, 1024);
		// driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,950);", "");

		

		List<String> colheaders = new ArrayList<>();
		List<WebElement> tableheader = driver.findElements(By.xpath("//table[2]//thead//tr[1]//th"));
		int row = 0;
		{{{	{
			for (int i = 0; i < tableheader.size(); i++) {
				colheaders.add(tableheader.get(i).getText());
			}
			datahandling(colheaders, row);

		}
		row++;
		List<String> colheaders1 = new ArrayList<>();
		List<WebElement> tableheader1 = driver.findElements(By.xpath("//table[2]/tbody/tr[1]/td"));
		for (int i = 0; i < tableheader.size(); i++) {
			colheaders1.add(tableheader1.get(i).getText());
		}
		datahandling(colheaders1, row);

	}
	row++;


	List<String> colheaders2 = new ArrayList<>();

	List<WebElement> tableheader2 =
			 driver.findElements(By.xpath("//table[2]/tbody/tr[2]/td"));for(
	int i = 0;i<tableheader.size();i++)
	{
		colheaders2.add(tableheader2.get(i).getText());
	}

	List<String> colheaders3 = new ArrayList<>();

	List<WebElement> tableheader3 =
			 driver.findElements(By.xpath("//table[2]/tbody/tr[3]/td"));for(
	int i = 0;i<tableheader.size();i++)
	{
		colheaders3.add(tableheader3.get(i).getText());
	}

	datahandling(colheaders3,row);
		}
		row++;

		List<String> colheaders4 = new ArrayList<>();

		List<WebElement> tableheader4 =
				 driver.findElements(By.xpath("//table[2]/tbody/tr[4]/td"));for(
		int i = 0;i<tableheader.size();i++)
		{
			colheaders4.add(tableheader4.get(i).getText());
		}

		datahandling(colheaders4,row);
			}

}
}






































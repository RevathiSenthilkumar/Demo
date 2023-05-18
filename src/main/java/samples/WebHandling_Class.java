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
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.example.BaseUI;

public class WebHandling_Class  extends BaseUI {


	public static void datahandling(List<String> data) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\revat\\JavaWorkspace\\POMdemo1\\testData_xlsx\\test_data.xlsx");
		Workbook workbook =new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Sheet2");
		Row row=sheet.createRow(0);
		int i=0;
		for(String value:data) {
			Cell cell=row.createCell(i++);
			cell.setCellValue(value);
		}
		FileOutputStream outputstream= new FileOutputStream("C:\\\\Users\\\\revat\\\\JavaWorkspace\\\\POMdemo1\\\\testData_xlsx\\\\test_data.xlsx");
		workbook.write(outputstream);
		outputstream.close();
		System.out.println("data written successfully");
		
	}
	public static void main(String[] args) throws IOException {
		driver=BrowserConfiguration.browserSetup("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,1150);", "");
		List<WebElement> tableheader=driver.findElements(By.xpath("//table[2]//thead//tr[1]//th"));
		List<String> colheaders = new ArrayList<>();
		for (int i = 0; i < tableheader.size(); i++) {
			colheaders.add(tableheader.get(i).getText());
		}
		datahandling(colheaders);
		
	}
}
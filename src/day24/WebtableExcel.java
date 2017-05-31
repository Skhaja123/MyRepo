package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtableExcel {
	
	FirefoxDriver f;
	
	@BeforeTest
	public void setUp()
	{
		f=new FirefoxDriver();
		f.get("https://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void WebTableTest() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shaik\\Documents\\Dropdown.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet2");
		
		
		WebElement table=f.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			Row r = ws.createRow(i);
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++)
			{
				r.createCell(j).setCellValue(cols.get(j).getText());
			}
			
		}
		FileOutputStream fs = new FileOutputStream("C:\\Users\\Shaik\\Documents\\Dropdown.xlsx");
		wb.write(fs);
	}

	
	
}

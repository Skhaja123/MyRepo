package day26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTesting2 {
	
	FirefoxDriver f;
	@BeforeTest
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("http://www.newtours.demoaut.com");
	}
	@Test
	public void Registration() throws IOException
	{
		FileInputStream file = new FileInputStream(".\\src\\\\com\\shaik\\excelfiles\\links.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount =ws.getLastRowNum();
		
		for(int i=1;i<rowCount;i++)
		{
			Row r = ws.getRow(i);
			String linkname=r.getCell(0).getStringCellValue();
			try
			{
				f.findElement(By.linkText(linkname)).click();
				String act_Url = f.getCurrentUrl();
				r.createCell(2).setCellValue(act_Url);
				String exp_Url = r.getCell(1).getStringCellValue();
				if(exp_Url.equals(act_Url))
					r.createCell(3).setCellValue("Passed");
				else
					r.createCell(3).setCellValue("Failed");
				f.navigate().back();
			}
			catch(Exception e)
			{
				r.createCell(3).setCellValue("Link Not Found");
			}
		}
		FileOutputStream fs = new FileOutputStream(".\\src\\\\com\\shaik\\resultexcelfiles\\links.xlsx");
		wb.write(fs);
		f.close();
	}

}

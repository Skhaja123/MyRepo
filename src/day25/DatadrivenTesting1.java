package day25;

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

public class DatadrivenTesting1 {
	
	FirefoxDriver f;
	
	@BeforeTest 
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("http://www.newtours.demoaut.com/");
		f.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
			
	}
	@Test
	public void registration() throws IOException
	{
		FileInputStream file = new FileInputStream(".\\src\\com\\shaik\\excelfiles\\Registration2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		for(int i=1;i<rowCount;i++)
		{
			Row r = ws.getRow(i);
			
			f.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			f.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			f.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
			f.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
			f.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			f.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue()); 
			f.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			f.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
			f.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			f.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
			f.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			f.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			f.findElement(By.name("register")).click();
			
			String x = f.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			if(x.contains(r.getCell(9).getStringCellValue()))
				r.createCell(12).setCellValue("Passed");
			else
				r.createCell(12).setCellValue("Failed");
			f.navigate().back();
			
			
		}
		FileOutputStream fs = new FileOutputStream(".\\src\\com\\shaik\\resultexcelfiles\\Registration2.xlsx");
		wb.write(fs);
		f.close();
	}
	

}

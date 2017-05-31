package day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class LoginUsingkeywords {
	
	@Test
	
	public void loginTest() throws IOException
	{
		LoginKeywords keys = new LoginKeywords();
		FileInputStream file = new FileInputStream(".\\src\\com\\shaik\\keywords\\DatadrivenTesting.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		for(int i=1;i<rowCount;i++)
		{
			Row r = ws.getRow(i);
			String runmode = r.getCell(4).getStringCellValue();
			if(runmode.equals("Y"))
			{
				String keyword = r.getCell(3).getStringCellValue();
				
				if(keyword.equals("launchBrowser"))
					keys.launchBrowser();
				
				else if(keyword.equals("navigate"))
					keys.navigate();
				
				else if(keyword.equals("enterUsername"))
					keys.enterUsername();
				
				else if(keyword.equals("enterPassword"))
					keys.enterPassword();
			
				else if(keyword.equals("clickLogin"))
					keys.clickLogin();
			}
		}
		
	}

}

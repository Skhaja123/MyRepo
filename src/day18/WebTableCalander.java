package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableCalander {
	
	ChromeDriver c;
	
	@BeforeTest
	public void setUp()

	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		c = new ChromeDriver();
		c.get("http://cleartrip.com");
	}
	@Test
	public void CalanderTest()
	{
		 c.findElement(By.id("OneWay")).click();
		 c.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		 c.findElement(By.id("ToTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		 
		 // X Path of calendar Icon
		 c.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		 
		 //Date of journey
		 String doj = "18/05/2017";
		 String [] a = doj.split("/");
		 String [] months = {"January","february","March","April","May","June","July","August","September","October","November","December"};
		 int x = Integer.parseInt(a[1]);
		 String month=months[x-1];
		 String day = a[0];
		 String year = a[2];
		 //class of year on left calendar
		 String calyear=c.findElement(By.className("ui-datepicker-year")).getText();
		 
		 //Loop to search for the required year
		 while(!calyear.equals(year))
		 {
			 //XPath of arrow icon on right calendar
			 c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			 calyear=c.findElement(By.className("ui-datepicker-year")).getText();
		}
		 
		 // Class of month of the left calendar
		 String calmonth=c.findElement(By.className("ui-datepicker-month")).getText();
		 
		 
		 //loop to search for required month
		 while(!calmonth.equals(month))
		 {
			 //XPath of arrow icon on right calendar
			 c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).click();
			 // Class of month of the left calendar
			 calmonth = c.findElement(By.className("ui-datepicker-month")).getText();
			 
		 }
		 
		 
		//XPath of the complete left calendar
		 WebElement calander=c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
		 List <WebElement> rows=calander.findElements(By.tagName("tr"));
		 for(int i=0;i<rows.size();i++)
		 {
			 List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			 for(int j=0;j<cols.size();j++)
			 {
				 if(cols.get(j).getText().equals(day))
				 {
				 cols.get(j).click();
				 break;
				 }
			 }
			 
		 }
		 
		 c.findElement(By.id("SearchBtn")).click();
		 
		 
		 
	}

}

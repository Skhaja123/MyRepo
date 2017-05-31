package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons {
	
	FirefoxDriver f;
	
	@BeforeTest
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("http://www.echoecho.com/htmlforms10.htm");
		
	}
	@Test
	public void radioButtonsTest()
	{
		WebElement block=f.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radio=block.findElements(By.name("group1"));
		for(int i=0;i<radio.size();i++)
		{
			radio.get(i).click();
			for(int j=0;j<radio.size();j++)
			{
				System.out.println(radio.get(j).getAttribute("value")+"--"+radio.get(j).getAttribute("checked"));
				
			}
			System.out.println("*********");
		}
		System.out.println("____________________________________");	
		radioButtonsTest2();
	}
	
	public void radioButtonsTest2()
	{
		WebElement block2=f.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radio2=block2.findElements(By.name("group2"));
		for(int a =0;a<radio2.size();a++)
		{
			radio2.get(a).click();
			for(int b=0;b<radio2.size();b++)
			{
				System.out.println(radio2.get(b).getAttribute("value")+"---"+radio2.get(b).getAttribute("checked"));
				
			}
			System.out.println("*****************************");
		}
	}
	

}

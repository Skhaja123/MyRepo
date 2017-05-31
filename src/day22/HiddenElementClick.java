package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HiddenElementClick {
	
	FirefoxDriver f;
	@BeforeTest
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("http://yssofindia.org");
	}
	@Test
	public void hiddenElementTest()
	{
		WebElement emailus=f.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		JavascriptExecutor j = (JavascriptExecutor)f;
		j.executeScript("arguments[0].click();", emailus);
	}
}

package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	
FirefoxDriver f;
	
	@BeforeTest
	public void setUp()

	{
		f = new FirefoxDriver();
		f.get("http://google.com");
	}
	
	@Test
	public void rightClickTest()
	{
		Actions act= new Actions(f);
		f.findElement(By.linkText("Gmail"));
		act.contextClick().sendKeys("L").build().perform();
	}
	

}

package day19;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPopupHandling {
	
	FirefoxDriver f;

	@BeforeTest
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("http://bing.com");
	}
	
	@Test
	public void tabAndPopupTest()
	{
		f.findElement(By.linkText("Help")).click();
		Set<String> winids=f.getWindowHandles();
		Iterator<String> i = winids.iterator();
		while(i.hasNext())
		{
			f.switchTo().window(i.next());
			try
			{
				f.findElement(By.xpath("//*[@id='privacyLabel']"));
				break;
			}
			catch(Exception e)
			{
				
			}
		}
	}

}

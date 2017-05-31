package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
 
public class LinkTesting5 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		List<WebElement> links=f.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(f.getCurrentUrl());
			f.navigate().back();
			Sleeper.sleepTightInSeconds(2);
			links=f.findElements(By.tagName("a"));
			}
			
		}
		f.close();
	}

}

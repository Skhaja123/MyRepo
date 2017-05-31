package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting6 {


	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		List<WebElement> links=f.findElements(By.tagName("a"));
		
		System.out.println("Total no of links:"+links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				count++;
			}
		}
		System.out.println("visible links count is:"+count);
		System.out.println("Hidden links count is:"+(links.size()-count));
		f.close();
		
	}

}

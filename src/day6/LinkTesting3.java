package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting3 {



	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://bing.com");
		List<WebElement> links=	f.findElements(By.id("sc_hdu"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		f.close();
		
	}

}

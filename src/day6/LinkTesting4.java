package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting4 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://pvrcinemas.com");
		WebElement general=f.findElement(By.xpath("html/body/div[7]/div[1]/div[2]"));
		List<WebElement> links=general.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(f.getCurrentUrl());
			f.navigate().back();
			
			//Recreate the arraylist
			 general=f.findElement(By.xpath("html/body/div[7]/div[1]/div[2]"));
			 links=general.findElements(By.tagName("a"));				
			
		}
		
		f.close();
		
	}

}

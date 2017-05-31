package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "f:\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://www.newtours.demoaut.com/");
		c.findElement(By.linkText("REGISTER")).click();
		WebElement drop= c.findElement(By.name("country"));
		List<WebElement> dropdown= drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				System.out.println(dropdown.get(i).getText()+"is active");
				
			}
			else
			{
				System.out.println(dropdown.get(i).getText()+"is inactive");
			}
			
		}
		c.close();

	}

}

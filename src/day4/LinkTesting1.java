package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting1 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		f.findElement(By.linkText("Gmail")).click();
		String exp_title="gmail";
		String act_title =f.getTitle();
		if(exp_title.equals(act_title))
		{
			System.out.println("gmail link is working correctly");
		}
		else
			System.out.println("gmail link is not working correctly");
		f.close();
		
	}

}

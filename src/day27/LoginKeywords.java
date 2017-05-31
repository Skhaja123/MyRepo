package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LoginKeywords {
	
	FirefoxDriver f;
	
	public void launchBrowser()
	{
		f = new FirefoxDriver();
	}
	
	public void navigate()
	{
		f.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	public void enterUsername()
	{
		f.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	}
	
	public void enterPassword()
	{
		f.findElement(By.name("txtPassword")).sendKeys("admin");
	}

	public void clickLogin()
	{
		
		f.findElement(By.name("Submit")).click();
	}


}

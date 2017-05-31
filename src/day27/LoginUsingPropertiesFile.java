package day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

public class LoginUsingPropertiesFile {
	
	FirefoxDriver f;
	
	@BeforeTest
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream file = new FileInputStream(".\\Login.properties");
		Properties pr =new Properties();
		pr.load(file);
		f.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		f.findElement(By.xpath(pr.getProperty("password"))).sendKeys("admin");
		f.findElement(By.name(pr.getProperty("login"))).click();
		f.close();
	}
	

}

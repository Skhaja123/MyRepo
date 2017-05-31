package day28.testNGsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login extends BaseClass{

	@Test
	public void loginTest()
	{
		f = new FirefoxDriver();
		f.get("http://newtours.demoaut.com");
		f.findElement(By.name("userName")).sendKeys("tutorials");
		f.findElement(By.name("password")).sendKeys("tutorials");
		f.findElement(By.name("login")).click();
	}
}

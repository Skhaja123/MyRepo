package day36;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day36.pageclasses.WelcomeMercuryTours;

public class Pom_login_Testcase {
	
	@Test
	public void loginTest()
	{
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://newtours.demoaut.com");
		
		//creating page class object
		
		WelcomeMercuryTours wmpage = PageFactory.initElements(f,WelcomeMercuryTours.class);
		wmpage.findAFlight("Admin","admin");
	}

}

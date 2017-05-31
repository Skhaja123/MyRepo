package day36.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	
	@FindBy(name="userName")
	WebElement uname;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(name="login")
	WebElement signin;
	
	public void findAFlight(String u,String p)
	{
		uname.sendKeys(u);
		pwd.sendKeys(p);
		signin.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement yourDestinations;
	public void destinations()
	{
		yourDestinations.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement f_v_destinations;
	public void vacations()
	{
		f_v_destinations.click();
	}
	@FindBy(linkText="Register here")
	WebElement regHere;
	public void register()
	{
		regHere.click();
	}

}

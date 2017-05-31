package day36.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement flights;
	public void flights()
	{
		flights.click();
	}
	

}

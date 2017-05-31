package day28.testNGsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightConfirmation extends BaseClass{
	
	@Test
	
	public void confirmFlight()
	{
		String expText="Your itinerary has been booked!";
		String actText=f.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(expText.equals(actText))
		{
			System.out.println("Ticket Booked Successfully");
		}
		else
		{
			System.out.println("Ticket not Boooked");
			
		}
		f.close();
	}

}

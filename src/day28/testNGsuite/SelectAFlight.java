package day28.testNGsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectAFlight extends BaseClass{
	
	@Test
	public void selectFlight()
	{
		f.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
		f.findElement(By.name("inFlight")).click();
		f.findElement(By.name("reserveFlights")).click();
	}

}

package day28.testNGsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookAFlight extends BaseClass{
	
	@Test
	public void bookFlight()
	{
		f.findElement(By.name("passFirst0")).sendKeys("Shaik");
		f.findElement(By.name("passLast0")).sendKeys("Azam");
		f.findElement(By.name("creditnumber")).sendKeys("11222344");
		f.findElement(By.name("buyFlights")).click();
	}

}

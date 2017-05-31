package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	FirefoxDriver f;
	
	@BeforeTest
	
	public void setUp()
	{
		f = new FirefoxDriver();
		f.get("https://jqueryui.com/droppable/");
	}
	@Test
	public void dragAndDrop()
	{
		Actions a = new Actions(f);
		f.switchTo().frame(0);
		WebElement src = f.findElement(By.id("draggable"));
		WebElement tgt = f.findElement(By.id("droppable"));
		a.dragAndDrop(src, tgt).build().perform();
		
		
		
	}
	

}

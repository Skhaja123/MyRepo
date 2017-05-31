package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTesting1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://amazon.in");
		f.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		f.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		f.findElement(By.className("nav-input")).click();

	}

}

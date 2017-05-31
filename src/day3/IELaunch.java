package day3;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "f:\\chromedriver.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		
		ie.get("http://google.com");

	}

}

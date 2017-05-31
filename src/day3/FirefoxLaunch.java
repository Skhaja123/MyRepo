package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

		public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
	}

}

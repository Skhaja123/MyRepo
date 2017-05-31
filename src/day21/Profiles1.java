package day21;

import org.omg.IOP.ProfileIdHelper;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profiles1 {

	
	public static void main(String[] args) {
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("Profile1");
		FirefoxDriver f = new FirefoxDriver(fp);
		f.get("http://msn.com");
		
	}

}

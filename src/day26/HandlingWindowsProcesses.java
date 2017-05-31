package day26;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.sun.java.swing.plaf.windows.resources.windows;

public class HandlingWindowsProcesses {

	
	public static void main(String[] args) {
		
		WindowsUtils.killByName("notepad.exe");
		WindowsUtils.killByName("firefox.exe");
		WindowsUtils.killByName("chrome.exe");
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://gmail.com");
		f.close();
		Sleeper.sleepTightInSeconds(5);
		WindowsUtils.killByName("eclipse.exe");

	}

}

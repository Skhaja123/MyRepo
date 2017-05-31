package day33;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadAutoIT {


	public static void main(String[] args) throws IOException {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://seleniumhq.org");
		f.findElement(By.xpath("//*[@id='menu_download']/a")).click();
		f.findElement(By.linkText("3.4.0")).click();
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Shaik\\Downloads\\download.exe");
	}

}

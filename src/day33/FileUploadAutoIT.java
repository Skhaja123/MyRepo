package day33;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadAutoIT {
	
	@Test
	public void upload() throws IOException
	{
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://imgur.com");
		f.findElement(By.className("upload-btn-text")).click();
		f.findElement(By.xpath("//*[@id='upload-modal']/div[2]/div[2]/label")).click();
		java.lang.Runtime.getRuntime().exec("ramzan123.exe");
	}

}

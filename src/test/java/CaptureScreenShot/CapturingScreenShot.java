package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingScreenShot {
	@Test
	public void ScreenShot() throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;  //takescreenshot - interface
		File src = ts.getScreenshotAs(OutputType.FILE); // to capture the Screenshoot //getScreenshotAs- method name // OutputType.FILE - Arugemnt.
		File destination = new File("C:\\Users\\Dell\\Desktop\\Captureing Scrrenshot\\pic.png");
		FileUtils.copyFile(src, destination);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}

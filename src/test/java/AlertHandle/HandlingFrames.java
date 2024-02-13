package AlertHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFrames extends BaseClass1 {
	@Test
	public void Frames() throws InterruptedException {     
		driver.switchTo().frame(0);  // by index-- frame expecting int Index value.     courses-iframe
	//	driver.switchTo().frame("courses-iframe"); // by id
	//	driver.switchTo().frame("iframe-name"); //by name
	//	driver.switchTo().frame(frameH);  // by webelement  -- error
	
		Thread.sleep(2000);
	WebElement frameH =driver.findElement(By.xpath("(//a[@href='lifetime-access'])[2]"));  // All Access Plan.
		frameH.click();
	 
		
	}

}

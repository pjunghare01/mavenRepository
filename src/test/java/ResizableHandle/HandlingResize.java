package ResizableHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingResize {
	@Test
	public void Resize() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/resizable/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//to enter into frame
	//driver.switchTo().frame(0); by index
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));  //find webelement (frame ka)
	driver.switchTo().frame(frame);    //by webelement.
	
	
	WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	Actions ac = new Actions(driver);
	ac.clickAndHold(resize).moveByOffset(160, 100).release().build().perform(); //forward
	Thread.sleep(3000);
	//ac.clickAndHold(resize).moveByOffset(-50, -90).release().build().perform();  //backward

	}
}

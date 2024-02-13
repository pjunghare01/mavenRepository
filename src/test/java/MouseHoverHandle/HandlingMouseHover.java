package MouseHoverHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingMouseHover extends BaseClass {
	
	@Test
	public void MouseHover() throws InterruptedException {
		
		WebElement mouse = driver.findElement(By.id("mousehover"));
		Thread.sleep(2000);
		
		
		// scroll down the page till we find the element...........
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",mouse);
		
		
		Actions acts = new Actions(driver);    // (WebDriver driver)-- (driver)
		acts.moveToElement(mouse).build().perform();  // moveToElement( Name of webelement)--(mouse)
				
		
	}

}














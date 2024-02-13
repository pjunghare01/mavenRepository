package Drag_DropHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingDragNDrop {
    @Test
	public void handle() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
   WebElement sourceCode= 	driver.findElement(By.id("box3"));  // sourceCode
   WebElement targetCode = driver.findElement(By.id("box103")); // targetCode
   
        Actions act = new Actions(driver); 
	   act.dragAndDrop(sourceCode, targetCode).perform();
   
	
		
	}

}

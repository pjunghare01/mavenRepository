package Drag_DropHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleDragNDrop {
	
	@Test
	public void DragDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// to enter into frame
		driver.switchTo().frame(0);
	
		
		WebElement sourcecode= driver.findElement(By.id("draggable"));
		WebElement targetcode= driver.findElement(By.id("droppable"));
		
	
		
		Actions act = new Actions(driver);
		
//	1St Way
	      // act.clickAndHold(sourcecode).build().perform();
	     //act.moveToElement(targetcode).build().perform();
	    //act.release().build().perform();
	
//	2St Way
	   //act.clickAndHold(sourcecode).moveToElement(targetcode).release().build().perform();
		
//3rd Way
		act.dragAndDrop(sourcecode, targetcode).build().perform();
	}

}

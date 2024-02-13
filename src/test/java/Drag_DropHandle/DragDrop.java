package Drag_DropHandle;   //Working

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		                 //(Source & target Element).
		// Element which needs to drag.   
        WebElement source= driver.findElement(By.id("box3"));   // source code(Washington)..   (Rome)..
        //Element on which need to drop.
        WebElement target= driver.findElement(By.id("box103")); // target code.(United States).. (Italy)..
        
        
        //Using Action class for drag and drop.
        Actions act = new Actions(driver);
      //Dragged and dropped.
        act.dragAndDrop(source, target).perform();
        
		
	}

}

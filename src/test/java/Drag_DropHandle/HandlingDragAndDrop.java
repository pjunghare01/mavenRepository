package Drag_DropHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingDragAndDrop {
	@Test
	public void DragAndDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
    	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	
    	WebElement sourcecode1 = driver.findElement(By.id("box1"));  //Oslo
    	WebElement sourcecode2 = driver.findElement(By.id("box2"));  //Stockholm
    	WebElement sourcecode3 = driver.findElement(By.id("box3"));  //Washington
    	WebElement sourcecode4 = driver.findElement(By.id("box4"));  //Copenhagen
    	WebElement sourcecode5 = driver.findElement(By.id("box5"));  //Seoul
    	WebElement sourcecode6 = driver.findElement(By.id("box6"));  //Rome
    	WebElement sourcecode7 = driver.findElement(By.id("box7"));  //Madrid
    	
    	WebElement targetcode1 =driver.findElement(By.id("box101")); //Norway
    	WebElement targetcode2 =driver.findElement(By.id("box102")); //Sweden
    	WebElement targetcode3 =driver.findElement(By.id("box103")); //United States
    	WebElement targetcode4 =driver.findElement(By.id("box104")); //Denmark
    	WebElement targetcode5 =driver.findElement(By.id("box105")); //South Korea
    	WebElement targetcode6 =driver.findElement(By.id("box106")); //Italy
    	WebElement targetcode7 =driver.findElement(By.id("box107")); //Spain
    	
    	Actions act = new Actions(driver);
    	
    	//1st WAY.
    	act.clickAndHold(sourcecode1).build().perform();
    	act.moveToElement(targetcode1).build().perform();
    	act.release().build().perform();
    	
    	act.clickAndHold(sourcecode2).build().perform();
    	act.moveToElement(targetcode2).build().perform();
    	act.release().build().perform();
    	
    	act.clickAndHold(sourcecode3).build().perform();
    	act.moveToElement(targetcode3).build().perform();
    	act.release().build().perform();
    	
    	act.clickAndHold(sourcecode4).build().perform();
    	act.moveToElement(targetcode4).build().perform();
    	act.release().build().perform();
    	
    	act.clickAndHold(sourcecode5).build().perform();
    	act.moveToElement(targetcode5).build().perform();
    	act.release().build().perform();
    	
    	act.clickAndHold(sourcecode6).build().perform();
    	act.moveToElement(targetcode6).build().perform();
    	act.release().build().perform();
    	
    	act.clickAndHold(sourcecode7).build().perform();
    	act.moveToElement(targetcode7).build().perform();
    	act.release().build().perform();
    	
    	//2nd WAY.
    /*	act.clickAndHold(sourcecode1).moveToElement(targetcode1).release().build().perform();
    	act.clickAndHold(sourcecode2).moveToElement(targetcode2).release().build().perform();
    	act.clickAndHold(sourcecode3).moveToElement(targetcode3).release().build().perform();
    	act.clickAndHold(sourcecode4).moveToElement(targetcode4).release().build().perform();
    	act.clickAndHold(sourcecode5).moveToElement(targetcode5).release().build().perform();
    	act.clickAndHold(sourcecode6).moveToElement(targetcode6).release().build().perform();
    	act.clickAndHold(sourcecode7).moveToElement(targetcode7).release().build().perform();
    */
    	
    	
    	//3rd WAY.
    /*	act.dragAndDrop(sourcecode1, targetcode1).build().perform();
    	act.dragAndDrop(sourcecode2, targetcode2).build().perform();
    	act.dragAndDrop(sourcecode3, targetcode3).build().perform();
    	act.dragAndDrop(sourcecode4, targetcode4).build().perform();
    	act.dragAndDrop(sourcecode5, targetcode5).build().perform();
    	act.dragAndDrop(sourcecode6, targetcode6).build().perform();
    	act.dragAndDrop(sourcecode7, targetcode7).build().perform();
    	
    */	
    	

		
	}

}

package RightNDoubleClickHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingRightClick {
	@Test
	public void rightclick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement rightc = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightc).build().perform();
	}
	
	

}

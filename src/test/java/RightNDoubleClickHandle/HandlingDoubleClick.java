package RightNDoubleClickHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingDoubleClick {
	@Test
	public void doubleclick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement doublec = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doublec).build().perform();

}
}










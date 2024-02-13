package AlertHandle;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertHand extends BaseClass1{
	@Test
	public void Alert() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); 
	}

}


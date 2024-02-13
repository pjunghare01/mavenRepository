package SliderHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingSlider {
	@Test
	public void SliderHandle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To Enter into frame
		driver.switchTo().frame(0);
		
		WebElement SliderH = driver.findElement(By.xpath("//span[@tabindex='0']"));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(SliderH).moveByOffset(200, 0).release().build().perform();
		System.out.println("Forward Opration Succesfull....");
		
		ac.clickAndHold(SliderH).moveByOffset(-100, 0).release().build().perform();
		System.out.println("Reverse Opration Succesfull....");
	}

}

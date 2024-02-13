package RadioButtonHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingRadioButton {
	
	@Test
	public void Radio() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
List<WebElement> radio =driver.findElements(By.xpath("//input[@class='radioButton']"));   // LIST is a class
		
		for( int i=0; i<radio.size();i++) {
		
			radio.get(i).click();
			Thread.sleep(3000);
		}
		
	}

}

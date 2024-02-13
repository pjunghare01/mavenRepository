package CheckBoxHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingCheckBox {
    @Test
	public void CheckBox() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> CB = driver.findElements(By.xpath("//input[@type='checkbox']"));  
		
		for(int i =0; i<CB.size(); i++) {
			CB.get(i).click();
			Thread.sleep(3000);
			
		}
		
	}
}

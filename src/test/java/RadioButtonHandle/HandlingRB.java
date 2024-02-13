package RadioButtonHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// common xpth- its denote radio1 ,radio2,radio3.	
// Error==	WebElement e =	driver.findElements(By.xpath("//input[@class='radioButton']"));  
		List<WebElement> radio =driver.findElements(By.xpath("//input[@class='radioButton']"));   // LIST is a class
		
		for( int i=0; i<radio.size();i++) {
		
			radio.get(i).click();
			Thread.sleep(3000);
			
}
		
		// for each loop
//		for(WebElement el:radio) {
//			el.click();
//			Thread.sleep(3000);
//			
//		}
	
	}

}

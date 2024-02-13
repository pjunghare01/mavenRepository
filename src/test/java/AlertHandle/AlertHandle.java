package AlertHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement enter =	driver.findElement(By.id("name"));
	enter.click();
	enter.sendKeys("Prachiiiiiiii");
	Thread.sleep(2000);
	
	 driver.findElement(By.id("alertbtn")).click();
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();  // Accept alert.. for ok button.
	// driver.switchTo().alert().dismiss();
	 
	 // use Assertion
	 String expectedresult = "https://rahulshettyacademy.com/AutomationPractice/";
	 String actualresult = driver.getCurrentUrl();
	 Assert.assertEquals(expectedresult, actualresult);
	 System.out.println("The expectedresult & actualresult are same");
	 System.out.println("Test case pass....");
	
	
	
	 
	driver.quit();
	 

	}

}

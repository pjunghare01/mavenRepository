package AlertHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingAlert {
	WebDriver driver;
	
	@BeforeMethod
	public void driverInitialze() throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void alert() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Prachi");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());    // getText
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); // to click on OK Button.
	//	driver.switchTo().alert().dismiss();
		
		// Use Assertion.
		String expectedresult = "https://rahulshettyacademy.com/AutomationPractice/";
		 String actualresult = driver.getCurrentUrl();
		 Assert.assertEquals(expectedresult, actualresult);
		 System.out.println("The expectedresult & actualresult are same");
		 System.out.println("Test case pass....");
	
	}
	
	@AfterMethod
	public void driverclose() {
		
		driver.quit();
	}

}
   


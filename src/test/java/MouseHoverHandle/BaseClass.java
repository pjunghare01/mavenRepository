package MouseHoverHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	
	
	@BeforeMethod
	public void DriverOpen() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void DriverClose() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		
	}

}

package AlertHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	WebDriver driver;
	
	   @BeforeMethod
	    public void driverOpen() throws InterruptedException {
		   driver = new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   System.out.println("Chrome browser launched");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   
		   
	   }
	   @AfterMethod
	   public void driverclose() throws InterruptedException {
		   System.out.println("Close the Browser");
		   Thread.sleep(3000);
		   driver.close();
		  

}
}

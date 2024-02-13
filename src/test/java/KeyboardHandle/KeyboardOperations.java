package KeyboardHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardOperations {
	
	WebDriver driver;
	
	@BeforeMethod
	public void m1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void m2() throws InterruptedException {
	WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
	username.click();
	username.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
	username.sendKeys(Keys.CONTROL+"a");  // to  select all content
	username.sendKeys(Keys.CONTROL+"c");  //  to copy all content
	password.sendKeys(Keys.CONTROL+"v");  //  to paste all content.   -- Admin
	password.sendKeys(Keys.ARROW_LEFT);
	password.sendKeys(Keys.ARROW_LEFT);
	password.sendKeys(Keys.ARROW_LEFT);
	password.sendKeys(Keys.ARROW_LEFT);
	password.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	
	password.sendKeys("a");
	Thread.sleep(2000);
	password.sendKeys(Keys.CONTROL+"a");
	password.sendKeys("admin123");         //  try tab  try enter
	
		
	}
	
	@AfterMethod
	public void m3() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





























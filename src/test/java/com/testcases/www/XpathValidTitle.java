package com.testcases.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class XpathValidTitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		// To launch the browser..
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// To open the URL..
		driver.manage().window().maximize();
		
		// Take a pause..
		Thread.sleep(2000);
		
		
	WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));    //Xpath-->(//tagname[@attribute='value'])
	// To Enter data in UNTF..
	username.sendKeys("Admin");
	Thread.sleep(2000);
	
	
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	// TO Enter data in PWDTF..
	password.sendKeys("admin123");
	Thread.sleep(2000);
	
	
	WebElement logIn = driver.findElement(By.cssSelector("button[type='submit']"));            // cssSelector-->(tagname[attribute='value'])
	// To click on login button..
	logIn.click();
	
	
	System.out.println(driver.getTitle());
	
	
	String expected_title = "OrangeHRM";
	String actual_title = driver.getTitle();
	
	Assert.assertEquals(expected_title , actual_title);
	
	System.out.println("The title is verified and able to login");
	System.out.println("Dashboard displayed.....");
    System.out.println("Test Case passs.....");
	

}
		
        
	
}

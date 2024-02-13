package com.testcases.www;                    //error-User should not able to login

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InvalidLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	        username.click();
			username.sendKeys("prachi");
			Thread.sleep(3000);
			
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.click();
	password.sendKeys("admin456");
	Thread.sleep(3000);
	
	WebElement login=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	login.click();
	Thread.sleep(3000);
	
	WebElement Error = driver.findElement(By.cssSelector("div[role='alert']"));  //Invalid credentials ka cssselector liya yaha pe.
	
	String expectedtitle = "Invalid credentials";
	String actualtitle = Error.getText();
	
	Assert.assertEquals(expectedtitle, actualtitle);		
			
	System.out.println("User should not able to login..");
	System.out.println("Dashboard should not displyed....");
	System.out.println("Test Case passs.....");
	
	}

}









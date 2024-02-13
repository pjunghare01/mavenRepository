package com.testcases.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class XpathInvalidTitle {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement username =driver.findElement(By.xpath("//input[@name ='username']"));
	    username.click();
		username.sendKeys("Prachi");
		
		
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));	
	password.click();
	password.sendKeys("admin345");
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	String expectedtitle = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String actualtitle = driver.getCurrentUrl();
	
	Assert.assertEquals(expectedtitle, actualtitle);
	
	System.out.println("User should not able to login..");
	System.out.println("Dashboard should not displyed....");
	System.out.println("Test Case passs.....");
		

	}

}











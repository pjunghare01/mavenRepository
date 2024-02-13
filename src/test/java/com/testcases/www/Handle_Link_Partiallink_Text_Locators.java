package com.testcases.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Link_Partiallink_Text_Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// using Link-Text locators
	/*	WebElement linktext = driver.findElement(By.linkText("Forgot Your Password?"));
		linktext.click();
		*/
		
		
		// using Partial-Link-Text locators  -- lenght is quit lenghty ie, we use 
		 WebElement partiallink= driver.findElement(By.partialLinkText("Use Custom"));
		 partiallink.click();
		 
		 
		 System.out.println(partiallink.isDisplayed());   // displayed or not
		 System.out.println(partiallink.isEnabled());      // ready to click.
	}

}

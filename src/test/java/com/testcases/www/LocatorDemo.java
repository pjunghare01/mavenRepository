package com.testcases.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("junghare@ssquareit.com");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("Sangita12345");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		driver.close();
		

	}

}

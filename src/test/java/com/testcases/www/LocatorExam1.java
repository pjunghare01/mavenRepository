package com.testcases.www;           // by using xpath.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExam1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	WebElement email =	driver.findElement(By.xpath("//*[@id=\"email\"]"));
	email.click();
	email.sendKeys("Prachijun@facebook.com");
	Thread.sleep(5000);
	
	WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	pass.click();
	pass.sendKeys("12345p");
	Thread.sleep(2000);
	
	WebElement login= driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
	login.click();
	
		
		
	}

}

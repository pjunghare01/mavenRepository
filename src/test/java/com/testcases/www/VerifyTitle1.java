package com.testcases.www;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//	driver.findElement(By.name("username")).sendKeys("Admin");
		 WebElement username =driver.findElement(By.name("username"));
		 username.sendKeys("Admin");
		 Thread.sleep(2000);
		 
		 WebElement password = driver.findElement(By.name("password"));
		 password.sendKeys("admin123");
		 Thread.sleep(2000);
		 
		 WebElement login = driver.findElement(By.tagName("button"));
		 login.click();
		 
		 System.out.println(driver.getTitle());
		 
		 String expected_result = "OrangeHRM";
		 String actual_result = driver.getTitle();
		 
		 Assert.assertEquals(expected_result, actual_result);
		 
		 System.out.println("The Title is verified and able to login");
		 
		System.out.println("Dashboard displayed...");
		
		driver.close();

	}

}

package com.testcases.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAutomationProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");    // this method is responsible to launch the webpage.
		Thread.sleep(5000);
		driver.manage().window().maximize(); // this method is responsible to launch the 	Maximize the browers.
		
		
		System.out.println(driver.getTitle());     // It retrive title of current page
		System.out.println(driver.getCurrentUrl()); // it retrive URL of webpage/ current page.
		Thread.sleep(4000);                         // take a rest for 4 sec.
		
		driver.navigate().to("https://www.orangehrm.com/");  //Switching from 1 webpage to another webpage.
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();               // back the webpage
		
		driver.navigate().forward();            // forward the page
		
		driver.navigate().refresh();            // refresh the page or reload the page.
		driver.close();                         // closed the webpage. expands.
        
		driver.quit();
	
	}

}













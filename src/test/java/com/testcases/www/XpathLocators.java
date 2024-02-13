package com.testcases.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=qoq8B8ThgEM");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 
		 WebElement Play =driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[37]/div[2]/div[1]/button"));
		 Play.click();
		 Thread.sleep(3000);
		 
		 WebElement Maximize =driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[37]/div[2]/div[2]/button[9]"));
		 Maximize.click();
		 Thread.sleep(30000);
		 
		 WebElement Highquality = driver .findElement(By.xpath("//*[@id=\"movie_player\"]/div[37]/div[2]/div[2]/button[4]"));
		Highquality.click();
	}

}

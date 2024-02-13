package com.testcases.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=Rv8J3aGDrfk&list=RDRv8J3aGDrfk&start_radio=1");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement abc = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[1]/button"));
		abc.click();
		Thread.sleep(3000);
		
		
		
	}

	

}

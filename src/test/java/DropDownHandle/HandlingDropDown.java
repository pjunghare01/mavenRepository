package DropDownHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {

	@Test
	public void Verify() throws InterruptedException {    //methodname = Verify
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement download = driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(3000);
		
		Select s = new Select(download); 
		   s.selectByVisibleText("Option3");   // This display text matching the argument.
		   Thread.sleep(3000);
		   
		  s.selectByIndex(2);                 //Select the option at the given index. 
		   Thread.sleep(3000);
		   
		   
		//s.selectByValue("");              // value matching the argument
		   
		   
		   List<WebElement> dropdownoption = s.getOptions();  // Get all the options of the dropdown

		   
		   for(WebElement e:dropdownoption) {
			   System.out.println(e.getText());
		   }
		   System.out.println("All DropDown Option: "+dropdownoption.size());
		   
		   driver.close();    
		
		
	}
}

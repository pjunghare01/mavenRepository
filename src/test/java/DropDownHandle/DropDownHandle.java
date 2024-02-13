package DropDownHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		element.click();
		Thread.sleep(1000);
		
		Select dropdown = new Select(element);   // for select
		dropdown.selectByVisibleText("Option3");
		
		System.out.println(dropdown.isMultiple());   // for multiple or not
		
	   
		List<WebElement> alldropdownlist = dropdown.getOptions();   // to print all option.
		System.out.println("Total DropDown Opertion: "+alldropdownlist.size());
		for(WebElement el:alldropdownlist) {
		System.out.println(el.getText());
		}
		
		
		driver.close();
	    	
	    	
			
		}
		
		

	}













































































































































































































//gthtyhryjsrthrj-----PRACHI-----.


















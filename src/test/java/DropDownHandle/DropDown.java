package DropDownHandle;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	// inspect dropdown	
	WebElement element =driver.findElement(By.id("dropdown-class-example"));
	element.click();
	Thread.sleep(3000);
	
	// use select class
	
	Select dropdown = new Select(element);	
	dropdown.selectByVisibleText("Option2"); // jo dikhta he vo
	          //dropdown.selectByValue("2");
	          //dropdown.selectByIndex(0);
	
	    
	    
	//  check multiple dropdown select-- dropdown not cabale to select multiple option.
	System.out.println(dropdown.isMultiple());  
	                 //or
	    if(dropdown.isMultiple()) {
	    	System.out.println("DropDown is multiple");
	    	
	    }
	    else {
	    	System.out.println("DropDown is not multiple");
	    }
	    
	 //To print All Dropdown option.-- use getOption method(Writen of list of web element)
	    List<WebElement> alldropdownoption = dropdown.getOptions();   // list - class(inside java util package)// webElement-datatype. 
	    System.out.println("total option: "+ alldropdownoption.size());   // to print size of element
	    for(WebElement el:alldropdownoption) {     // using for each loop
	    	System.out.println(el.getText());
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    driver.close();
	    
	    
	

	 

	}

}

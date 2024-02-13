package SliderHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderColourPicker {
	@Test
	public void HandleSlider() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To enter into Frame
		driver.switchTo().frame(0);
		
		WebElement RedSlide = driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
		Actions act1= new Actions(driver);
		act1.clickAndHold(RedSlide).moveByOffset(300, 0).release().build().perform();    //Forward
		act1.clickAndHold(RedSlide).moveByOffset(-250, 0).release().build().perform();   //Reverse 
		System.out.println("Red Colour Slider opration succesfull...");
		
		Thread.sleep(2000);
		
		WebElement GreenSlide = driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
		Actions act2= new Actions(driver);
		act2.clickAndHold(GreenSlide).moveByOffset(200, 0).release().build().perform();  //Forward
		act2.clickAndHold(GreenSlide).moveByOffset(-100, 0).release().build().perform(); //Reverse 
		System.out.println("Green Colour Slider opration succesfull...");
		
		Thread.sleep(2000);
		
		WebElement BlueSlide = driver.findElement(By.xpath("(//span[@tabindex='0'])[3]"));
		Actions act3= new Actions(driver);
		act3.clickAndHold(BlueSlide).moveByOffset(400, 0).release().build().perform();   //Forward
		act3.clickAndHold(BlueSlide).moveByOffset(-300, 0).release().build().perform();  //Reverse 
		System.out.println("Blue Colour Slider opration succesfull...");
		
		Thread.sleep(5000);
		
	   
		driver.quit();
		
		
		
		
		
		
		
	}

}

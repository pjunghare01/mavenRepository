package RadioButtonHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	WebElement  Radio1 = driver.findElement(By.xpath("//input[@name='radioButton']"));

	
	WebElement  Radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
	
	

	WebElement  Radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));
	
	
	Radio1.click();
	Thread.sleep(2000);
	System.out.println(Radio1.isSelected());
	System.out.println(Radio1.isDisplayed());
	System.out.println(Radio1.isEnabled());
	
	
	Radio2.click();
	Thread.sleep(2000);
	System.out.println(Radio2.isSelected());
	System.out.println(Radio2.isDisplayed());
	System.out.println(Radio2.isEnabled());
	
	
	
	Radio3.click();
	Thread.sleep(2000);
	System.out.println(Radio3.isSelected());
	System.out.println(Radio3.isDisplayed());
	System.out.println(Radio3.isEnabled());
	
	
	driver.close();
	}

}

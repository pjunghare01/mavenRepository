package CheckBoxHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement checkB1=driver.findElement(By.cssSelector("[id='checkBoxOption1']"));
		checkB1.click();
		Thread.sleep(3000);
		
		WebElement checkB2=driver.findElement(By.cssSelector("[id='checkBoxOption2']"));
		checkB2.click();
		Thread.sleep(3000);
		
		WebElement checkB3=driver.findElement(By.cssSelector("[id='checkBoxOption3']"));
		// checkB3.click();
		Thread.sleep(3000);
		
		System.out.println(checkB1.isSelected());
		System.out.println(checkB2.isSelected());
		System.out.println(checkB3.isSelected());
		
		driver.quit();
		
		
	}

}

package MouseHoverHandle;         

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[13]/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();	
			

	}

}
//Jewellery & Accessories
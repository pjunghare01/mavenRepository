package MouseHoverHandle;   // working

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement mouse=	driver.findElement(By.linkText("Shipping"));
     
	
	Actions act = new Actions(driver);
	act.moveToElement(mouse).perform(); // move to element()	 for mouse over action.
	
	
	
	/* WebElement ele= driver.findElement(By.partialLinkText("eBay For"));
	
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	*/

	}
	
}

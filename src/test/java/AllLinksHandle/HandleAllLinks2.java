package AllLinksHandle;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAllLinks2 {

	public static void main(String[] args) throws InterruptedException {
		//forgot_password_link
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://login.salesforce.com/");
		List<WebElement> alllink= driver.findElements(By.id("forgot_password_link"));
		System.out.println(alllink.size());
		
		for(WebElement ele: alllink) {
			System.out.println(ele.getText());
			
		}
		
		driver.close();
		

	}

}

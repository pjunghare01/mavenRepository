package AllLinksHandle;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAllLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.calculator.net/");
		List<WebElement> linkElement = driver.findElements(By.tagName("a"));
		System.out.println("Total All Links on Webpage: "+linkElement.size());  // count all print = 55
		
		for(WebElement el:linkElement) {     // for print all links
			System.out.println(el.getText());
		}

		
		
		
		
		
	
	}

}

package MouseHoverHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavBarMouseHover {
@Test
public void mouseHover() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.unipune.ac.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement univercity = driver.findElement(By.id("stUI5_txt"));
	Actions un = new Actions(driver);
	un.moveToElement(univercity).build().perform();
	System.out.println(univercity.getText());
	Thread.sleep(3000);
	
	WebElement Academic = driver.findElement(By.id("stUI42_txt"));
	Actions ac = new Actions(driver);
	ac.moveToElement(Academic).build().perform();
	System.out.println(Academic.getText());
	Thread.sleep(3000);
	
	WebElement Research = driver.findElement(By.id("stUI184_txt")); 
	Actions re = new Actions(driver);
	re.moveToElement(Research).build().perform();
	System.out.println(Research.getText());
	Thread.sleep(3000);
	
	WebElement Administration = driver.findElement(By.id("stUI194_txt"));
	Actions ad = new Actions(driver);
	ad.moveToElement(Administration).build().perform();
	System.out.println(Administration.getText());
	Thread.sleep(3000);
	
	WebElement BOD = driver.findElement(By.id("stUI215_txt"));
	Actions bod = new Actions(driver);
	bod.moveToElement(BOD).build().perform();
	System.out.println(BOD.getText());
	Thread.sleep(3000);
	
	WebElement Students_Corner = driver.findElement(By.id("stUI229_txt"));
	Actions sc = new Actions(driver);
	sc.moveToElement(Students_Corner).build().perform();
	System.out.println(Students_Corner.getText());
	Thread.sleep(3000);
	
	WebElement Useful_Links = driver.findElement(By.id("stUI253_txt"));
	Actions ul = new Actions(driver);
	ul.moveToElement(Useful_Links).build().perform();
	System.out.println(Useful_Links.getText());
	Thread.sleep(3000);
	
	WebElement E_Learning = driver.findElement(By.id("stUI277_txt"));
	Actions el = new Actions(driver);
	el.moveToElement(E_Learning).build().perform();
	System.out.println(E_Learning.getText());
	Thread.sleep(5000);
	
	
	driver.close();

	
		
	}

}

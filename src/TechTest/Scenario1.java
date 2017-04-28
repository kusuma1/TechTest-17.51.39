/**
 * 
 */
/**
 *Scenario 1: Search for a book on http://amazon.com
 *
 */
package TechTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1 {
	
	static WebDriver driver;
	static Wait<WebDriver> wait; 
	public static void main(String[] args)
{
		 driver = new FirefoxDriver();
		 wait = new WebDriverWait(driver, 30);
		 driver.get("https://www.amazon.com");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement (By.id("twotabsearchtextbox")).sendKeys("The Testing");
       	driver.findElement (By.id(" nav-search-submit-text")).click();
		String Url = driver.getCurrentUrl();
        
		if (Url.equals(" https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=the+testing")) 
          {
           System.out.println("Test passed");
	     } else {

	    System.out.println("Test Failed");
       }

 driver.quit();
}

}

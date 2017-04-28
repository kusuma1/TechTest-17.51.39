/**
 * 
 */
/**
 *Scenario 2: Add the book to cart
 *
 */


package TechTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class scenario2 {

	static WebDriver driver;
	static Wait<WebDriver> wait; 
	public static void main(String[] args)
{
	 driver = new FirefoxDriver();
	 wait = new WebDriverWait(driver, 30);
	 driver.get("https://www.amazon.com");
	 	
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The Testing");
		driver.findElement(By.id("nav-search-submit-text")).click();
		String Url = driver.getCurrentUrl();
		
		if (Url.equals(" https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=the+testing")) 
		{        

		driver.findElement(By.id("a-link-normal a-text-normal")).click();
		String Url1 = driver.getCurrentUrl();
		if (Url1.equals("https://www.amazon.com/Testing-Joelle-Charbonneau/dp/0544336232/ref=sr_1_1?ie=UTF8&qid=1493326783&sr=8-1&keywords=the+testing"))
		{

		driver.findElement(By.id("add-to-cart-button")).click();
		String Url2 = driver.getCurrentUrl();

		if (Url2.equals("https://www.amazon.com/gp/huc/view.html?ie=UTF8&newItems=C1XH9C7EWLBGDD%2C1"))
		{
		 System.out.println("Test passed” ");
        } 
		else 
		{
			System.out.println("Test Failed");
		}


     }

		}
	 driver.quit();
      }
     }
		 

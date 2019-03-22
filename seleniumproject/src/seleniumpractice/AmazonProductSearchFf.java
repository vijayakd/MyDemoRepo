package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonProductSearchFf {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   
		   //ADDING AN ITEM TO CART     START
		   driver.get("https://www.amazon.com");
		   
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The Wonky Donkey");//FINDING SEARCH BAR AND ENTER ITEM
			
			driver.findElement(By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]//input[@class=\"nav-input\"]")).click();//CLICKING MAGNIFIER GLASS

			driver.findElement(By.xpath("//li[@id=\"result_1\"]//h2[@class=\"a-size-medium s-inline  s-access-title  a-text-normal\"]")).click();
		   driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		   
		   boolean result = driver.findElement(By.xpath("//a[@id=\"hlb-ptc-btn-native\"]")).isDisplayed();
		   
		   if(result)
		       {
			   System.out.println("ITEM ADDED TO CART SUCCESSFULLY");
			   
		       }
		   else {
			   System.out.println("ITEM NOT ADDED TO CART");
		        }
		   
			driver.quit();
					
	}

}

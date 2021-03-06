package explicitWaitPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pompages.AmazonProductSearchObjects;
import testdata.AmazonProductSearchTestData;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
			driver.get(AmazonProductSearchTestData.url);//OPENS AMAZON
			driver.manage().window().maximize();
			
			driver.findElement(AmazonProductSearchObjects.search_box).sendKeys(AmazonProductSearchTestData.search_text);//FINDING SEARCH BAR AND ENTER ITEM
			
				
			//CLICKING MAGNIFIER GLASS
			driver.findElement(AmazonProductSearchObjects.search_submit).click();
			
			//==========================  PASS THE EXPLICIT WAIT METHOD BEFORE CLICKING THE WEBELEMENT ========
			explicit_Wait(driver,"The Wonky Donkey");
			
			//SELECTING THE LINK OF THE OBJECT
			driver.findElement(AmazonProductSearchObjects.select_item_link).click();
		   driver.findElement(AmazonProductSearchObjects.add_to_cart).click();
		   
		   boolean result = driver.findElement(AmazonProductSearchObjects.proceed_to_chkout).isDisplayed();
		   
	////////  VERIFICATION   ////////
		   if(result)
		       {
			   System.out.println("ITEM ADDED TO CART SUCCESSFULLY");
			   
		       }
		   else {
			   System.out.println("ITEM NOT ADDED TO CART");
		        }
					

		
		//Thread.sleep(3000);
		driver.quit();
		 System.out.println("BROWSER IS CLOSED");

   
		
	}

	public static void  explicit_Wait(WebDriver driver,String text) {
		
		WebElement ww= new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.linkText(text)));
	}
}

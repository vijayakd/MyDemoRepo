package testNGTestScripts;

import org.testng.annotations.Test;

import pompages.AmazonProductSearchObjects;
import testdata.AmazonProductSearchTestData;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TNGAmazonProductSearch {
	static WebDriver driver=null;
	
  @Test (invocationCount=3)
  public void product_Search_cart() {
		 System.out.println("------  SELECT PRODUCT AND ADD TO CART  -----");   

	
			driver.findElement(AmazonProductSearchObjects.search_box).sendKeys(AmazonProductSearchTestData.search_text);//FINDING SEARCH BAR AND ENTER ITEM

		 
		 driver.findElement(AmazonProductSearchObjects.search_submit).click();
		
		
		
		//SELECTING THE LINK OF THE OBJECT
		driver.findElement(AmazonProductSearchObjects.select_item_link).click();
	   driver.findElement(AmazonProductSearchObjects.add_to_cart).click();
	   
	   boolean result = driver.findElement(AmazonProductSearchObjects.proceed_to_chkout).isDisplayed();
	   
////////  VERIFICATION   ////////
	   if(result)
	       {
		   System.out.println("ITEM ADDED TO CART SUCCESSFULLY IS ------------------"+AmazonProductSearchTestData.search_text);
		   
	       }
	   else {
		   System.out.println("ITEM NOT ADDED TO CART");
	        }
				
  }
  
  @BeforeTest
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 System.out.println("OPENING BROWSER------IN BEFORE METHOD ANNOT------");   

			driver.get(AmazonProductSearchTestData.url);//OPENS AMAZON
			driver.manage().window().maximize();
  }

  @AfterTest
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(3000);
		 System.out.println("CLOSING BROWSER-------IN AFTER METHOD ANNOT-------");   

		driver.quit();
		 System.out.println("BROWSER IS CLOSED");
  }

}

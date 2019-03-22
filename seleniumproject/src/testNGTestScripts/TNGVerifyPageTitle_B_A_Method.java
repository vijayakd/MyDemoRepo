package testNGTestScripts;

import org.testng.annotations.Test;




import org.testng.annotations.BeforeMethod;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TNGVerifyPageTitle_B_A_Method {

	 static WebDriver driver=null; 

@Test(priority=1)
  public void verifyPageTitle() {
	  
	  //driver.get("https://www.google.com/");
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google");	  
  }
@Test(priority=2)
public void enter_search()
{
	   driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("TestNG");
	}
@Test(priority=3)
public void click_search()
{
       driver.findElement(By.xpath("//div[@class=\"FPdoLc VlcLAe\"]//input[@value=\"Google Search\"]")).click();
	}
@Test(priority=4,dependsOnMethods="click_search")     //////// HARD DEPENDENCIES///////////
public void skipped()
{
	System.out.println("executes if click_search passes else it will be failed");
	  }
  
@BeforeMethod
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
  }

  @AfterMethod
  public void closeBrowser() throws InterruptedException {
	
	  Thread.sleep(3000);
	    driver.quit();
		System.out.println("Browser Closed");
		
		
}

}

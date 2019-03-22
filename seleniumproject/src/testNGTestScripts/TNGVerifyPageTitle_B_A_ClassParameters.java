package testNGTestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TNGVerifyPageTitle_B_A_ClassParameters {
	
	 static WebDriver driver=null; 

	
	@Test(priority=1)
	  public void verifyPageTitle() {
		  
		  //driver.get("https://www.google.com/");
		  String title=driver.getTitle();
		  System.out.println(title);
		  Assert.assertEquals(title, "Google");	  
		  System.out.println("--------1.IN verifyPageTitle TEST CASE---------- ");

	  }
	@Test(priority=2)
	public void enter_search()
	{
		   driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("TestNG");
			  System.out.println("------------2.IN enter_search TEST CASE------------- ");

		}
	@Test(priority=3)
	public void click_search()
	{
	       driver.findElement(By.xpath("//div[@class=\"FPdoLc VlcLAe\"]//input[@value=\"Google Search\"]")).click();
			  System.out.println("-------------3.IN click_search TEST CASE---------------- ");

		}
	@Test(priority=4,dependsOnMethods="click_search",alwaysRun=true)   //////////// SOFT DEPENDENCIES///////////
	public void skipped()
	{
		  System.out.println("------4.IN skipped TEST CASE--------- ");

		System.out.println("executes if click_search passes else it will be failed");
		  }
	  
  @BeforeClass
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
  }

  @AfterClass
  public void closeBrowser() throws InterruptedException {
		
	  Thread.sleep(3000);
	    driver.quit();
		System.out.println("Browser Closed");
		
		
}


}

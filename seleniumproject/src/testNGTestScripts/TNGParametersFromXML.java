package testNGTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pompages.SignInPageObjects;
import testdata.SignInPageTestData;

public class TNGParametersFromXML {
	
	
	 @Test
  @Parameters({"browser","url","email_id"})	
  public void passingparameters(String browser,String url,String email_id) {
	  WebDriver driver=null;

	  //launch browser 
	 if(browser.equals("chrome")) {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
	 }else if(browser.equals("firefox")) {
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\vijay\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	       
	       
           driver.manage().window().maximize();
       
	 }
	 
      driver.get(url);
      //driver.findElement(SignInPageObjects.YahooLogin).clear();
      driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys(email_id);
     // driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
      // driver.findElement(SignInPageObjects.YahooSign).sendKeys(SignInPageTestData.SignInPageuname);
       //driver.findElement(SignInPageObjects.YahooLogin).click();
       driver.quit();
 }
	  
	  
  }


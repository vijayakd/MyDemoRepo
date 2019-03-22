package testNGTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TNGBrowserParameter {
	
	 WebDriver driver;
	 
	 
  @Test
  @Parameters({"browser"})
  public void launchBrowser(String browser) {
	  System.out.println("Browser is -----------"+browser);
	  
	  
	  if(browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
		  
	  } else if(browser.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\vijay\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	  
	  driver.get("https://login.yahoo.com/");	  
  }
  
  @Test(dependsOnMethods= {"launchBrowser"})
  @Parameters({"username"})
  public void enterCredentials(String username) {
	  
	  System.out.println("Username ===="+username);

	  
	  driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys(username);
	  
	  
	  driver.quit();
	  }

  
    

  
  
}

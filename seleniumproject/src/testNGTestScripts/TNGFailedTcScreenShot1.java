package testNGTestScripts;

import org.testng.annotations.Test;

import customListenersPack.CustomListener1;
import screenShotsPack.TakeScreenSShot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Listeners(CustomListener1.class)
public class TNGFailedTcScreenShot1 extends TakeScreenSShot {
	
  @Test
  public void tc1() {
	  System.out.println("=== IN TC1======");
	  Assert.assertEquals(false, true);
  }
  
  @Test
  public void tc2() {
	  System.out.println("=== IN TC2======");
  }
  
  @Test
  public void tc3() {
	  System.out.println("=== IN TC3======");
	  Assert.assertEquals(false, true);

  }
  
  @Test
  public void tc4() {
	  System.out.println("=== IN TC4======");
  }
  
  @Test
  public void tc5() {
	  System.out.println("=== IN TC5======");
	  Assert.assertEquals(false, true);

  }
  @BeforeMethod
  public void openBrowser() {
	  initialization();
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}

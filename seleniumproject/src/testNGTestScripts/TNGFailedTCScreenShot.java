package testNGTestScripts;

import org.testng.annotations.Test;

import customListenersPack.CustomListener;
import screenShotsPack.FailedTcScreenShot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


@Listeners(CustomListener.class)
public class TNGFailedTCScreenShot extends FailedTcScreenShot {
	
	
	//////****************THIS TEST FAILS BECOZ I COMMENTED THE GOOGLE URL IN TakeScreenSShot.java
  @Test
  public void test1() {
	  Assert.assertEquals(false, true);
  }
  
  @Test
  public void test2() {
	  Assert.assertEquals(false, true);
  }
  
  @Test
  public void test3() {
	  Assert.assertEquals(false, true);
  }
  
  @Test
  public void test4() {
	  Assert.assertEquals(false, true);
  }
  
  @BeforeMethod
  public void launch() {
	  initialization();
	  driver.get("https://www.google.com");
	  
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}

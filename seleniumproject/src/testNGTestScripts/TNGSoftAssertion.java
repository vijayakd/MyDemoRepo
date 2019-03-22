package testNGTestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompages.SignInPageObjects;
import testdata.SignInPageTestData;

public class TNGSoftAssertion {
	 static WebDriver driver=null; 
	 static  SoftAssert softassert= new SoftAssert();

	 
	 @Test 
  public void verifyUserWithValidUIdBlankPwd() throws InterruptedException, IOException  {
		 
	  PageFactory.initElements(driver,SignInPageObjects.class );
		 String expected_result="Invalid user or password";
		 System.out.println("------------------BEFORE SOFT ASSERT-----------------");
		 softassert.assertEquals(true, false);     /////////// SOFT ASSERTION //////////

		 //Verify User With Valid Id And Blank Pwd   START
		 System.out.println("############## Valid Id    Blank Pwd statrs   ############");
		 
		 driver.findElement(SignInPageObjects.signIn).click();
         Thread.sleep(2000);
         driver.findElement(SignInPageObjects.uname).sendKeys(SignInPageTestData.readExcel(3, 0));
         driver.findElement(SignInPageObjects.pwd).sendKeys(SignInPageTestData.SignInPageBlankValidPwd);
         Thread.sleep(2000);
         driver.findElement(SignInPageObjects.login).click();
         String actual_result=driver.findElement(SignInPageObjects.error).getText();
         
         //NOW VALIDATE actual_result AND expected_result
         if(actual_result.equalsIgnoreCase(expected_result)) {
                   System.out.println("User With Valid Id And Blank Pwd TestCase    SUCCESS");
         }
         else {
        	 System.out.println("FAILURE");
         }
		 System.out.println("############## Valid Id    Blank Pwd ends   ############");
		 softassert.assertAll();

  }
  
@Test
void verifyUserWithvalidUIdPwd() throws InterruptedException, IOException {
  PageFactory.initElements(driver,SignInPageObjects.class );

  //1.Verify user signin and password   START
	 System.out.println("############## Valid Id    Valid Pwd statrs   ############");

  
	driver.findElement(SignInPageObjects.signIn).click();
	Thread.sleep(2000);
	driver.findElement(SignInPageObjects.uname).sendKeys(SignInPageTestData.readExcel(3, 0));
	driver.findElement(SignInPageObjects.pwd).sendKeys(SignInPageTestData.SignInPageValidPwd);
    Thread.sleep(2000);

    driver.findElement(SignInPageObjects.login).click();
  
    boolean result=driver.findElement(SignInPageObjects.signingout).isEnabled();
    if(result) {
    System.out.println("Verify user signin and password :SUCCESS");
    }
    else
    {
    System.out.println("Verify user signin and password :FAILURE");
    }
    driver.findElement(SignInPageObjects.signingout).click();
    Thread.sleep(4000);
    //1.Verify user signin and password   ENDED
	 System.out.println("############## Valid Id    Valid Pwd Ends   ############");

    }

@Test

public void verifyUserWithvalidUIdInvalidPwd() throws InterruptedException, IOException {
  PageFactory.initElements(driver,SignInPageObjects.class );

 
 String expected_result="Invalid user or password";

 //Verify User With Valid Id And Invalid Pwd   START
 System.out.println("############## Valid Id   In Valid Pwd statrs   ############");

 driver.findElement(SignInPageObjects.signIn).click();
Thread.sleep(2000);
driver.findElement(SignInPageObjects.uname).sendKeys(SignInPageTestData.readExcel(3, 0));
driver.findElement(SignInPageObjects.pwd).sendKeys(SignInPageTestData.SignInPageInValidPwd);
Thread.sleep(2000);

driver.findElement(SignInPageObjects.login).click();
String actual_result=driver.findElement(SignInPageObjects.error).getText();

//NOW VALIDATE actual_result AND expected_result
if(actual_result.equalsIgnoreCase(expected_result)) {
          System.out.println("User With Valid Id And Invalid Pwd TestCase    SUCCESS");
}
else {
	 System.out.println("FAILURE");
}
Thread.sleep(2000);
 System.out.println("############## Valid Id   In Valid Pwd Ends   ############");

}


@BeforeMethod
public void beforeMethod() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();

  driver.get("http://demo.redmine.org/");
  System.out.println("------ IN Before Method Annot ----------");

}

@AfterMethod
public void afterMethod() throws InterruptedException {
  Thread.sleep(3000);
  System.out.println("------ IN After Method Annot ----------");

    driver.quit();
	System.out.println("Browser Closed");
}


}

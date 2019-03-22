package junitTestScripts;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pompages.SignInPageObjects;
import seleniumpractice.MethodSignInVerifyC;
import seleniumpractice.SignInVerifyC;
import testdata.SignInPageTestData;

class JunitSignInTestScriptsBcAcChrome {
	 static WebDriver driver=null;


	@BeforeAll
	 static void openBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.redmine.org");
        driver.manage().window().maximize();
	}

	@AfterAll
	 static void closeBrowser() throws Exception {
		 Thread.sleep(3000);
		    driver.quit();
			System.out.println("Browser Closed");
	}

	@Test
	void verifyUserWithValidUIdBlankPwd() throws InterruptedException, IOException  {
		 
		  PageFactory.initElements(driver,SignInPageObjects.class );
			 String expected_result="Invalid user or password";
				
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



}
		
	



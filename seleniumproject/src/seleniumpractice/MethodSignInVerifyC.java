package seleniumpractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pompages.SignInPageObjects;
import testdata.SignInPageTestData;

public class MethodSignInVerifyC {
	
	  public void verifyUserWithValidUIdBlankPwd() throws InterruptedException, IOException 
	  {
		  
		  PageFactory.initElements(SignInVerifyC.driver,SignInPageObjects.class );
			 String expected_result="Invalid user or password";
				
			 //Verify User With Valid Id And Blank Pwd   START
			 System.out.println("############## Valid Id    Blank Pwd statrs   ############");
			 
			 SignInVerifyC.driver.findElement(SignInPageObjects.signIn).click();
	         Thread.sleep(2000);
	         SignInVerifyC.driver.findElement(SignInPageObjects.uname).sendKeys(SignInPageTestData.readExcel(4, 0));
	         SignInVerifyC.driver.findElement(SignInPageObjects.pwd).sendKeys(SignInPageTestData.SignInPageBlankValidPwd);
	         Thread.sleep(2000);
	         SignInVerifyC.driver.findElement(SignInPageObjects.login).click();
	         String actual_result=SignInVerifyC.driver.findElement(SignInPageObjects.error).getText();
	         
	         //NOW VALIDATE actual_result AND expected_result
	         if(actual_result.equalsIgnoreCase(expected_result)) {
	                   System.out.println("User With Valid Id And Blank Pwd TestCase    SUCCESS");
	         }
	         else {
	        	 System.out.println("FAILURE");
	         }
			 System.out.println("############## Valid Id    Blank Pwd ends   ############");

	  }
	  
	      

public void verifyUserWithvalidUIdPwd() throws InterruptedException, IOException {
	  PageFactory.initElements(SignInVerifyC.driver,SignInPageObjects.class );

	
    //1.Verify user signin and password   START
	 System.out.println("############## Valid Id    Valid Pwd statrs   ############");

  
	SignInVerifyC.driver.findElement(SignInPageObjects.signIn).click();
	Thread.sleep(2000);
	SignInVerifyC.driver.findElement(SignInPageObjects.uname).sendKeys(SignInPageTestData.readExcel(3, 0));
	SignInVerifyC.driver.findElement(SignInPageObjects.pwd).sendKeys(SignInPageTestData.SignInPageValidPwd);
    Thread.sleep(2000);

    SignInVerifyC.driver.findElement(SignInPageObjects.login).click();
  
    boolean result=SignInVerifyC.driver.findElement(SignInPageObjects.signingout).isEnabled();
    if(result) {
    System.out.println("Verify user signin and password :SUCCESS");
    }
    else
    {
    System.out.println("Verify user signin and password :FAILURE");
    }
    SignInVerifyC.driver.findElement(SignInPageObjects.signingout).click();
    Thread.sleep(4000);
    //1.Verify user signin and password   ENDED
	 System.out.println("############## Valid Id    Valid Pwd Ends   ############");

    }





public void verifyUserWithvalidUIdInvalidPwd() throws InterruptedException, IOException {
	  PageFactory.initElements(SignInVerifyC.driver,SignInPageObjects.class );

	 
	 String expected_result="Invalid user or password";
	
	 //Verify User With Valid Id And Invalid Pwd   START
	 System.out.println("############## Valid Id   In Valid Pwd statrs   ############");

	 SignInVerifyC.driver.findElement(SignInPageObjects.signIn).click();
    Thread.sleep(2000);
    SignInVerifyC.driver.findElement(SignInPageObjects.uname).sendKeys(SignInPageTestData.readExcel(3, 0));
    SignInVerifyC.driver.findElement(SignInPageObjects.pwd).sendKeys(SignInPageTestData.SignInPageInValidPwd);
    Thread.sleep(2000);
    
    SignInVerifyC.driver.findElement(SignInPageObjects.login).click();
    String actual_result=SignInVerifyC.driver.findElement(SignInPageObjects.error).getText();
    
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





















 
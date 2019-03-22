package testNGTestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompages.SignInPageObjects;
import testdata.SignInPageTestData;

public class TNGGroupsSignIn {

	 static WebDriver driver=null; 
	 
	 @Test (groups = {"redmine","vijaya"})
 public void verifyUserWithValidUIdBlankPwd() throws InterruptedException, IOException  {
		 
	  PageFactory.initElements(driver,SignInPageObjects.class );
		 String expected_result="Invalid user or password";
			
		 //Verify User With Valid Id And Blank Pwd   START
		 System.out.println("############## Valid Id    Blank Pwd statrs   #######TNGGroupsSignIn#####");
		 
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
		 System.out.println("############## Valid Id    Blank Pwd ends   #######TNGGroupsSignIn#####");

 }
 
@Test (groups = {"redmine","k"})
void verifyUserWithvalidUIdPwd() throws InterruptedException, IOException {
 PageFactory.initElements(driver,SignInPageObjects.class );

 //1.Verify user signin and password   START
	 System.out.println("############## Valid Id    Valid Pwd statrs   ##########TNGGroupsSignIn##");

 
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
	 System.out.println("############## Valid Id    Valid Pwd Ends   #######TNGGroupsSignIn#####");

   }

@Test (groups = {"redmine","p"})

public void verifyUserWithvalidUIdInvalidPwd() throws InterruptedException, IOException {
 PageFactory.initElements(driver,SignInPageObjects.class );


String expected_result="Invalid user or password";

//Verify User With Valid Id And Invalid Pwd   START
System.out.println("############## Valid Id   InValid Pwd statrs   ########TNGGroupsSignIn####");

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
System.out.println("############## Valid Id   In Valid Pwd Ends   ########TNGGroupsSignIn####");

}


	

	 @BeforeGroups  (groups = {"redmine"})
	 public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();

     driver.get("http://demo.redmine.org/");
     System.out.println("------ IN Before Groups Annot ------TNGGroupsSignIn----");

     
 }
 @AfterGroups (groups = {"redmine",})
 public void closeBrowser() throws InterruptedException {
	  Thread.sleep(3000);
     System.out.println("------ IN After Groups Annot ------TNGGroupsSignIn----");

	    driver.quit();
		System.out.println("Browser Closed");
}
}

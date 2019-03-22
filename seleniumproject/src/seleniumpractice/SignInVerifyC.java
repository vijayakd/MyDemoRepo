package seleniumpractice;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testdata.SignInPageTestData;

public class SignInVerifyC {
	
	 static WebDriver driver=null;
	
	 void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.redmine.org");
        driver.manage().window().maximize();
		
	       }
	
	/* void verifyUserWithvalidUIdPwd() throws InterruptedException {

          //1.Verify user signin and password   START
        
          driver.findElement(By.linkText("Sign in")).click();
          Thread.sleep(2000);
          driver.findElement(By.id("username")).sendKeys("testsample1234");
          driver.findElement(By.id("password")).sendKeys("password");
          Thread.sleep(2000);

          driver.findElement(By.name("login")).click();
        
          boolean result=driver.findElement(By.linkText("Sign out")).isEnabled();
          if(result) {
	      System.out.println("Verify user signin and password :SUCCESS");
          }
          else
          {
	      System.out.println("Verify user signin and password :FAILURE");
          }
          driver.findElement(By.linkText("Sign out")).click();
          Thread.sleep(4000);
          //1.Verify user signin and password   ENDED
	      }*/
     
	 
   /*  void verifyUserWithvalidUIdInvalidPwd() throws InterruptedException {
	 
    	 String expected_result="Invalid user or password";
		
		 //Verify User With Valid Id And Invalid Pwd   START
		 driver.findElement(By.linkText("Sign in")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("username")).sendKeys("testsample1234");
         driver.findElement(By.id("password")).sendKeys("a");
         Thread.sleep(2000);
         driver.findElement(By.name("login")).click();
         String actual_result=driver.findElement(By.id("flash_error")).getText();
         
         //NOW VALIDATE actual_result AND expected_result
         if(actual_result.equalsIgnoreCase(expected_result)) {
                   System.out.println("User With Valid Id And Invalid Pwd TestCase    SUCCESS");
         }
         else {
        	 System.out.println("FAILURE");
         }
         Thread.sleep(2000);

	 }
	 
    /* void verifyUserWithValidUIdBlankPwd() throws InterruptedException {
		 String expected_result="Invalid user or password";
			
		 //Verify User With Valid Id And Blank Pwd   START
		 driver.findElement(By.linkText("Sign in")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("username")).sendKeys("testsample1234");
         driver.findElement(By.id("password")).sendKeys("");
         Thread.sleep(2000);
         driver.findElement(By.name("login")).click();
         String actual_result=driver.findElement(By.id("flash_error")).getText();
         
         //NOW VALIDATE actual_result AND expected_result
         if(actual_result.equalsIgnoreCase(expected_result)) {
                   System.out.println("User With Valid Id And Blank Pwd TestCase    SUCCESS");
         }
         else {
        	 System.out.println("FAILURE");
         }
	 }*/
      
     void closeBrowser() throws InterruptedException {
		    Thread.sleep(3000);
		    driver.quit();
			System.out.println("Browser Closed");
	 }
	 public static void main(String[] args) throws InterruptedException, IOException {
		 // SignInPageTestData.write_to_excel_PASS(3, 2);

		   SignInVerifyC siv =new SignInVerifyC();
		   siv.openBrowser();
		 //  siv.verifyUserWithvalidUIdPwd();
		  // siv.verifyUserWithvalidUIdInvalidPwd();
		   MethodSignInVerifyC msiv =new MethodSignInVerifyC();
		   msiv.verifyUserWithValidUIdBlankPwd();
		   msiv.verifyUserWithvalidUIdPwd();
		   msiv.verifyUserWithvalidUIdInvalidPwd();
		   siv.closeBrowser();
		 // SignInPageTestData.write_to_excel_PASS(3, 2);
	}
}

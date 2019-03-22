package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompages.RegRedMinePageObjects;
import testdata.RegRedMineTestData;
//import pompages.RegRedMinePageObjects;

public class RegRedMineC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //LAUNCH BROWSER
		
		//REGISTERING ACCOUNT       STARTED
		driver.manage().window().maximize();
		
		driver.get("http://demo.redmine.org");
		driver.findElement(RegRedMinePageObjects.register_link).click();                           //CLICKING REGISTER LINK
		driver.findElement(RegRedMinePageObjects.user_login).sendKeys(RegRedMineTestData.user_login_data);         //LOGIN
		driver.findElement(RegRedMinePageObjects.user_pwd).sendKeys(RegRedMineTestData.user_password);              //ENTER PASSWORD
		driver.findElement(RegRedMinePageObjects.user_pwd_conf).sendKeys(RegRedMineTestData.user_password_conf); //ENTER CONFIRMATION
		driver.findElement(RegRedMinePageObjects.first_name).sendKeys(RegRedMineTestData.user_first_name);                    //ENTER F.NAME
		driver.findElement(RegRedMinePageObjects.last_name).sendKeys(RegRedMineTestData.user_last_name);                     //ENTER L.NAME
		driver.findElement(RegRedMinePageObjects.user_email).sendKeys(RegRedMineTestData.user_email);       //ENTER EMAIL
		driver.findElement(RegRedMinePageObjects.user_language).click();
		driver.findElement(RegRedMinePageObjects.user_commit).click();
       
		/////////////////// VALIDATION////////////////////////
	    		 driver.findElement(By.xpath("//a[@class=\"logout\"]"));
	   /*  if(result) {
		      System.out.println("USER REGISTRATION :SUCCESS");
	          }
	          else
	          {
		      System.out.println("USER REGISTRATION :FAILURE");
	          }*/
	     
	     Thread.sleep(3000);
		driver.quit();
		
			}
	}

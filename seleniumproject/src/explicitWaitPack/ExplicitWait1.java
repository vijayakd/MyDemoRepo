package explicitWaitPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pompages.AmazonProductSearchObjects;
import testdata.AmazonProductSearchTestData;

public class ExplicitWait1 {
	static WebDriver driver;	


	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,20);

	driver.get("http://demo.redmine.org/login");		
	     driver.findElement(By.id("username")).sendKeys("test");
	   
	     WebElement password= driver.findElement(By.id("password"));
		     wait.until(ExpectedConditions.visibilityOf(password));
		     password.sendKeys("pass");
	   
	    
	      WebElement loginbtn=driver.findElement(By.name("login")) ;
	       
	
			wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
			loginbtn.click();
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\ScreenShots\\explicitwait1.png"));
			
			driver.quit();
	}
	

}

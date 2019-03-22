package javaScriptExecutorPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSCreateAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
        
		WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org/login");
		//WebElement loginbtn=	driver.findElement(By.xpath("//input[@name=\"login\"]"));
		createAlert(driver,"There is a error in login page");

		
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		driver.quit();
	}
	public static void createAlert(WebDriver driver, String message) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("alert('"+message+"');");
	}
}

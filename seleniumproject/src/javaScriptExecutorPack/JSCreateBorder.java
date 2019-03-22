package javaScriptExecutorPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSCreateBorder {

	public static void main(String[] args) throws IOException {
       
		WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org/login");
		WebElement loginbtn=	driver.findElement(By.xpath("//input[@name=\"login\"]"));
		createBorder(driver,loginbtn);

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\ScreenShots\\borderJS.png"));
		
		driver.quit();
		
	}
public static void createBorder(WebDriver driver, WebElement element) {
	JavascriptExecutor js= ((JavascriptExecutor)driver);
js.executeScript("arguments[0].style.border='3px solid red';", element);
}
}

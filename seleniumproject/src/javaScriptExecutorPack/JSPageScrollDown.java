package javaScriptExecutorPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPageScrollDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org/login");
			pageScrollDown(driver);
			Thread.sleep(2000);
		driver.quit();
	}
	public static void pageScrollDown(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}

}

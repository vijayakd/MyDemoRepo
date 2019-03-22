package javaScriptExecutorPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSGetPageInnerText {

	public static void main(String[] args) {
		WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org/login");

			System.out.println(getPageInnerText(driver));
		driver.quit();
	}
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
	String innerTxt=js.executeScript("return document.documentElement.innerText;").toString();
	return innerTxt;
	}

	}


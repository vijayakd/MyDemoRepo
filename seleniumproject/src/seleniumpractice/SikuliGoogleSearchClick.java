package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliGoogleSearchClick {

	static WebDriver driver;	

	
	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			//WebDriverWait wait = new WebDriverWait(driver,20);

	driver.get("https://www.google.com/");	
	
	Screen sikuli = new Screen();
	sikuli.click("C:\\Users\\vijay\\eclipse-workspace\\TestData\\Capture.PNG");
	
	driver.quit();
	
	}

}

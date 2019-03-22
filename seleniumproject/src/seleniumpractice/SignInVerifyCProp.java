package seleniumpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SignInVerifyCProp {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException  {

		Properties prop = new Properties();    // CREATE AN OBJECT OF PROPERTIES CLASS
		FileInputStream fis = new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\seleniumproject\\src\\seleniumproject\\SignInPropFile");
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		//System.out.println();
		
		String log=prop.getProperty("login");
		System.out.println(log);
		
		String url=prop.getProperty("URL");
				
		System.out.println(prop.getProperty("URL"));
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	   }else if(browsername.equals("ff")){

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
	   }else if(browsername.equals("ie")){
		   System.setProperty("webdriver.ie.driver","C:\\Users\\vijay\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		   
	   }
                driver.get(url);
                driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.xpath(prop.getProperty("login_xpath"))).sendKeys(prop.getProperty("login"));
	driver.findElement(By.xpath(prop.getProperty("pwdd_xpath"))).sendKeys(prop.getProperty("Password"));	
	driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	driver.findElement(By.linkText("Sign out")).isEnabled();
	Thread.sleep(3000);
	driver.quit();
	System.out.println("Browser is closed");
  }

}

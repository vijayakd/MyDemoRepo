package headlessPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowsingUsingChrome {
	 static WebDriver driver=null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");

driver=new ChromeDriver(options);

driver.manage().window().maximize();
driver.get("https://www.google.com/");
System.out.println( driver.getCurrentUrl());
driver.quit();
	}

}

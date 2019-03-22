package handlingCalendarPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCalendarUsingJS {

	public static void main(String[] args) throws InterruptedException {

		
			 WebDriver driver;	
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.spicejet.com/");
WebElement calendar=driver.findElement(By.id("ctl00_mainContent_view_date1"));
			String date = "05-11";
				selectdatejs(driver,calendar,date);
				//driver.quit();
				
					}
public static void selectdatejs(WebDriver driver,WebElement element,String dateval) throws InterruptedException {
	JavascriptExecutor js =((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	Thread.sleep(4000);


}
}

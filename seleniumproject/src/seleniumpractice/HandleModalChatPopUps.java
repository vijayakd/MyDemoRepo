package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleModalChatPopUps {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//WebDriverWait wait = new WebDriverWait(driver,20);

	driver.get("https://www.freecrm.com/index.html");
	driver.switchTo().frame("intercom-borderless-frame");
	WebElement cogmento=driver.findElement(By.xpath("//div[@class=\"intercom-author-summary-name-from\"]"));
	Actions action = new Actions(driver);
	action.moveToElement(cogmento).click().build().perform();
	Thread.sleep(2000);
	//WebElement closebtn = driver.findElement(By.xpath("//div[@class=\"intercom-borderless-dismiss-button"));
//wait.until(ExpectedConditions.elementToBeClickable(closebtn))	;    
//closebtn.click();
	
	
	
	
	driver.quit();
	}

}

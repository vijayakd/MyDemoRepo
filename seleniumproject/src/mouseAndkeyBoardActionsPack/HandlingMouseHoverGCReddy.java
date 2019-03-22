package mouseAndkeyBoardActionsPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHoverGCReddy {

	public static void main(String[] args) {
		WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
				driver.get("https://www.carmax.com/");
				WebElement carmenu = driver.findElement(By.className("nav-item__link"));
				Actions builder= new Actions(driver);
				builder.moveToElement(carmenu).build().perform();
				driver.findElement(By.className("nav--item--subnav--item")).click();
driver.quit();
		
	}

}

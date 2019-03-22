package popusPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWinPopupNaveen {

	public static void main(String[] args) {
		 WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentwindow=it.next();
		System.out.println("parentwindow id====="+parentwindow);
		
		String childwindow=it.next();
		System.out.println("childwindow id====="+childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println("TITLE IS--------"+driver.getTitle());
		System.out.println("URL IS--------"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentwindow);
		System.out.println("TITLE IS--------"+driver.getTitle());
		System.out.println("URL IS--------"+driver.getCurrentUrl());
		driver.quit();

		
	}

}

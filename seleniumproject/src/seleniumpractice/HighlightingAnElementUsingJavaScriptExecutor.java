/*package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//port org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightingAnElementUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         driver.get("https://www.google.com/");
        WebElement gsbtn =driver.findElement(By.name("btnK"));
        
    	JavascriptExecutor js = ((JavascriptExecutor)driver);
js.executeScript("arguments[0].set                      "
}


	
}
	
	
	
	
	

*/
package framesPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesGCReddy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
           driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//  SWITCH TO FRAME WITH NAME  "classFrame"
		driver.switchTo().frame("classFrame");
	    driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	    Thread.sleep(2000);
	    
	    //     SWITCH BACK TO PARENTPAGE
	   driver.switchTo().defaultContent();
	   String title= driver.getTitle();
	   System.out.println(title);
	    Thread.sleep(2000);
if(	 title.equalsIgnoreCase("com.thoughtworks.selenium")  ) {
	System.out.println("IN default WINDOW");
}else
	System.out.println("!IN default WINDOW");

driver.navigate().back();
Thread.sleep(3000);

String title1=driver.getTitle();
System.out.println(title1);


	    driver.quit();
	    
	
	
	}

}

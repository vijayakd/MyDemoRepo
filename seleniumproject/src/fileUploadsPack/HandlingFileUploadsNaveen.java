package fileUploadsPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadsNaveen {

	public static void main(String[] args) {
		 WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            driver.get("http://demo.redmine.org/projects/qqqqqqq1/issues/new");
            driver.findElement(By.xpath("//input[@class=\"file_selector\"]")).sendKeys("C:\\Users\\vijay\\Desktop\\Assignments.txt");
            
      //================================    VALIDATE   =======================================
           // driver.quit();
           boolean result= driver.findElement(By.xpath("//body[@class=\"project-qqqqqqq1 controller-issues action-new\"]")).isDisplayed();
            System.out.println(result);
            
            if(result) {
            	System.out.println("FILE UPLOADED SUCCESSFULLY");
            	
            }else
            	System.out.println("FILE NOT UPLOADED ");
driver.quit();
            
	}
            

	}



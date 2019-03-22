package fileUploadsPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		  System.setProperty(LibraryLoader.JACOB_DLL_PATH, "C:\\Users\\vijay\\Downloads\\jacob-1.19\\jacob-1.19\\jacob-1.19-x64.dll");

		
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			driver.get("http://demo.redmine.org/projects/demo-2222/issues/new");
			
			driver.findElement(By.xpath("//span[@class=\"add_attachment\"]//input[@name=\"attachments[dummy][file]\"]")).click();
			Thread.sleep(9000);
			
			AutoItX windowHandle=new AutoItX();
			//C:\Users\vijay\Desktop\Assignments.txt
			windowHandle.send("C:\\Users\\vijay\\Desktop\\Assignments.txt");
			windowHandle.controlClick("","","");
	
	}

}

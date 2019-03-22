package testNGTestScripts;

import org.testng.annotations.Test;

//import com.sun.media.sound.Toolkit;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TNGFileUploadUsingRobotClass {
	
	static WebDriver driver;
	
	
  @Test
  public void fileupload_robo() throws AWTException, InterruptedException, IOException {
	  driver.get("http://demo.redmine.org/projects/asdfffffff/issues/new");
	  driver.findElement(By.className("file_selector")).click();
	  
	  String path="C:\\Users\\vijay\\Desktop\\SELENIUM WORK\\Assignments.txt";
	  Clipboard clip = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
	  
	  StringSelection ss = new StringSelection(path);
	  clip.setContents(ss, null);/////////////////////// contents set to clipboard
	  Thread.sleep(9000);
	  
	  Robot robo = new Robot();
	  
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_V);
	  robo.delay(2000);
	  robo.keyRelease(KeyEvent.VK_V);
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  
	  robo.delay(9000);
	  
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\ScreenShots\\robotfileupload.png"));
		System.out.println("====  IN takeSScreenShot method/TC======"
				+ "");
	  
	  
  }
  @BeforeMethod
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      

 System.out.println("------ IN Before GROUPS Annot -----TNGSignInVerifyMethodAnnotation-----");

  }

  @AfterMethod
  public void closebrowser() {
	  System.out.println("------ IN After GROUPS Annot -----TNGSignInVerifyMethodAnnotation-----");

	    driver.quit();
		System.out.println("Browser Closed");
  }

}

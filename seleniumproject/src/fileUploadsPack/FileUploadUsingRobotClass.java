package fileUploadsPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
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
//import org.openqa.selenium.remote.server.handler.GetTagName;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		 WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            driver.get("http://demo.redmine.org/projects/affaire-1/issues/new");
driver.findElement(By.xpath("//span[@class=\"add_attachment\"]//input[@class=\"file_selector\"]")).click();

String path="C:\\Users\\vijay\\Desktop\\Assignments.txt";
Clipboard clip =Toolkit.getDefaultToolkit().getSystemClipboard();
StringSelection ss=new StringSelection(path);
clip.setContents(ss, null);
Thread.sleep(9000);
Robot robo = new Robot();
robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_V);
robo.delay(2000);
robo.keyRelease(KeyEvent.VK_V);
robo.keyRelease(KeyEvent.VK_CONTROL);

robo.delay(2000);

robo.keyPress(KeyEvent.VK_ENTER);
robo.keyRelease(KeyEvent.VK_ENTER);
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\seleniumproject\\screenShots\\robo2.png"));


driver.quit();
	}

}

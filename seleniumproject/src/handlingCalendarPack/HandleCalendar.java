package handlingCalendarPack;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org");
			driver.findElement(By.linkText("Projects")).click();
			driver.findElement(By.linkText("1")).click();
			driver.findElement(By.linkText("New issue")).click();
			driver.findElement(By.xpath("//p[@id=\"due_date_area\"]//img")).click();
			Thread.sleep(2000);
			
			String date="5-Dec-2020";
			String dateArr[]=date.split("-");
			String day=dateArr[0];
			String month=dateArr[1];
			String year=dateArr[2];
System.out.println("month ====="+month);
System.out.println("year ====="+year);

			Select select_mon = new Select(driver.findElement(By.className("ui-datepicker-month")));
			select_mon.selectByVisibleText(month);
		
			Select select_year = new Select(driver.findElement(By.className("ui-datepicker-year")));
			select_year.selectByVisibleText(year);
			
			//final int weekdays=7;
			boolean flag=false;
			// //*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[2]/a
			// //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[2]/a
			// //*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[8]/a
            // //*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[2]/a
			
			String before_xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[";
			String after_xpath = "]/td[";
			
			for(int rows=1;rows<=5;rows++) {
				for(int cols=2;cols<=8;cols++) {
					String day_val=driver.findElement(By.xpath(before_xpath+rows+after_xpath+cols+"]")).getText();
					System.out.println("day val ====="+day_val);
					if(day_val.equals(day)) {
						driver.findElement(By.xpath(before_xpath+rows+after_xpath+cols+"]")).click();
						
						File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\seleniumproject\\screenShots\\handlecalendar.png"));
						
						flag=true;
						break;
					}
					if(flag) 
						break;
				}
			}
driver.quit();
	}

}

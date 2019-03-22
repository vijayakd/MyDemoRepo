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

public class HandleCalendarUsingList {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org");
			driver.findElement(By.linkText("Projects")).click();
			driver.findElement(By.linkText("affaire 1")).click();
			driver.findElement(By.linkText("New issue")).click();
			driver.findElement(By.xpath("//p[@id=\"due_date_area\"]//img")).click();
			Thread.sleep(2000);
			
			String date="22-Feb-2021";
			String dateArr[]=date.split("-");
			String day=  dateArr[0];
			String month=  dateArr[1];
			String year=  dateArr[2];

			System.out.println("month ====="+month);
			System.out.println("year ====="+year);

						Select select_mon = new Select(driver.findElement(By.className("ui-datepicker-month")));
						select_mon.selectByVisibleText(month);
						
						Select select_year = new Select(driver.findElement(By.className("ui-datepicker-year")));
						select_year.selectByVisibleText(year);
						
						
		List<WebElement> row_list = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr"))		;	
		List<WebElement> col_list = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//th"))		;	
			
		System.out.println("row_list size ====="+row_list.size());
		System.out.println("col_list size ====="+col_list.size());


		String before_xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[";
		String after_xpath = "]/td[";			

		for(int rows=1;rows<=row_list.size();rows++) {
			for(int cols=2;cols<=col_list.size();cols++) {
				String day_val=driver.findElement(By.xpath(before_xpath+rows+after_xpath+cols+"]")).getText();
				System.out.println("day val ====="+day_val);
				if(day_val.equals(day)) {
					driver.findElement(By.xpath(before_xpath+rows+after_xpath+cols+"]")).click();
					
					File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\seleniumproject\\screenShots\\handlecalendar.png"));}
			}
			}
		driver.quit();	
	}

}

package dropDownPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown_select_getoptions_Naveen {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver;
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    driver.get("https://www.facebook.com/");
		    
		    //      xpath for month,day,year
		   WebElement month_xpath= driver.findElement(By.xpath("//select[@id=\"month\"]"));
		   WebElement day_xpath= driver.findElement(By.xpath("//select[@id=\"day\"]"));
		   WebElement year_xpath= driver.findElement(By.xpath("//select[@id=\"year\"]"));

		//      create an obj of select class 
		   
		   Select select_month = new Select(month_xpath);
		   Select select_day = new Select(day_xpath);                             //  create webelements first
		   Select select_year = new Select(year_xpath);                           //   create Select class object
                                                                                  //    apply getoptions
		   ////       apply getoptions()                                          //     get the size
		   select_day.selectByValue("10");
		   Thread.sleep(2000);
		  
		   
		   
		   
		   driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}

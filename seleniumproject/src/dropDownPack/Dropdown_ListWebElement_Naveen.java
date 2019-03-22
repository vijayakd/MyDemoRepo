package dropDownPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_ListWebElement_Naveen {
	static WebDriver driver;

	public static void main(String[] args) {

			 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    driver.get("https://www.facebook.com/");
		    List<WebElement> month_list=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		    List<WebElement> day_list=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		    List<WebElement> year_list=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
            
		   System.out.println( month_list.size());
		   System.out.println( day_list.size());
		   System.out.println( year_list.size());
		    
		  
		   
		   for(int i=0;i<month_list.size();i++) {
         String monval = month_list.get(i).getText();
			  System.out.println("month===="+monval);
		   
			  if(monval.equalsIgnoreCase("Dec")) {
				  month_list.get(i).click();
				  System.out.println(month_list.get(i).getText());
				  break;
			  }
         }
		
		   for(int i=0;i<day_list.size();i++) {
		         String dayval = day_list.get(i).getText();
					  System.out.println("day===="+dayval);
				   
					  if(dayval.equalsIgnoreCase("29")) {
						  day_list.get(i).click();
						  System.out.println(day_list.get(i).getText());
						  break;
					  }
		         }
		   
		   for(int i=0;i<year_list.size();i++) {
		         String yearval = year_list.get(i).getText();
					  System.out.println("year===="+yearval);
				   
					  if(yearval.equalsIgnoreCase("1978")) {
						  year_list.get(i).click();
						  System.out.println(year_list.get(i).getText());
						  break;
					  }
		         }
		   
		   driver.quit();
	}
		    
	
		    		}


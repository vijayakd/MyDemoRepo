package handlingWebTablesPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testdata.AmazonProductSearchTestData;

public class HandlingDynamicWebTablesW3Schools {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			////*[@id="customers"]/tbody/tr[2]/td[1]
			////*[@id="customers"]/tbody/tr[3]/td[1]
			////*[@id="customers"]/tbody/tr[4]/td[1]
			////*[@id="customers"]/tbody/tr[5]/td[1]
			////*[@id="customers"]/tbody/tr[6]/td[1]
			  //*[@id="customers"]/tbody/tr[7]/td[1]
			
			//To find the total no of columns in the web table

         List<WebElement>        rows         =driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"))		;	
			int rowcount=rows.size();
			System.out.println("No of rows==="+rowcount);
			System.out.println("******************************************");

			
			String before_Xpath_company="//*[@id=\"customers\"]/tbody/tr[";
			String after_Xpath_company="]/td[1]";
			
			for(int i=2;i<=rowcount;i++) {
				WebElement xpath=driver.findElement(By.xpath(before_Xpath_company+i+after_Xpath_company));
				String text=xpath.getText();
				System.out.println("Text Present @ Position " +i  +"   is     "    +   text       );
			}
			System.out.println("******************************************");

			
			// //*[@id="customers"]/tbody/tr[2]/td[2]
			// //*[@id="customers"]/tbody/tr[3]/td[2]

			String before_Xpath_contact="//*[@id=\"customers\"]/tbody/tr[";
			String after_Xpath_contact="]/td[2]";
			
			for(int j=2;j<=rowcount;j++) {
				WebElement xpath_contact=driver.findElement(By.xpath(before_Xpath_contact+j+after_Xpath_contact));
				String text_contact=xpath_contact.getText();
				System.out.println("Text Present @ Position " +j  +"   is     "    +   text_contact       );
			}
			System.out.println("******************************************");

			
			// //*[@id="customers"]/tbody/tr[2]/td[3]
			

			String before_Xpath_country="//*[@id=\"customers\"]/tbody/tr[";
			String after_Xpath_country="]/td[3]";
			
			for(int j=2;j<=rowcount;j++) {
				WebElement xpath_country=driver.findElement(By.xpath(before_Xpath_country+j+after_Xpath_country));
				String text_country=xpath_country.getText();
				System.out.println("Text Present @ Position " +j  +"   is     "    +   text_country       );
			}
			System.out.println("******************************************");

			
			//To find the total no of columns in the web table
			
			//  //*[@id="customers"]/tbody/tr[1]/th[1]
			//  //*[@id="customers"]/tbody/tr[1]/th[2]
			//  //*[@id="customers"]/tbody/tr[1]/th[3]
			
			List<WebElement> total_cols=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
			int col_count=total_cols.size();
			System.out.println("Total number of Columns present in the table ==="+col_count);
			
			String before_xpath_col=" //*[@id=\"customers\"]/tbody/tr[1]/th[";
			String after_xpath_col="]";
			
			for(int i=1;i<=col_count;i++) {
                WebElement 	ele = driver.findElement(By.xpath(before_xpath_col+i+after_xpath_col))		;	
                String ele_text=ele.getText();
                System.out.println(i+"column name======"+ele_text);
				
			}
			
			

			driver.quit();

	}

}

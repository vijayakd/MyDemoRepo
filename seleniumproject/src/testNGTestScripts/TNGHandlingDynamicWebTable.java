package testNGTestScripts;

import org.testng.annotations.Test;

import customListenersPack.CustomListenerForDynamicWebTable;
import screenShotsPack.FailedTcScreenShot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;


@Listeners(CustomListenerForDynamicWebTable.class)
public class TNGHandlingDynamicWebTable extends FailedTcScreenShot {
 
	@Test
	  public void handlingDynamicWebTableMethod2() {

		driver.get("http://www.teachmeselenium.com/automation-practice-webtable/");
		driver.findElement(By.xpath("//strong[contains(text(),\"Palau\")]//parent::td//preceding-sibling::td//input[@type=\"checkbox\"]")).click();
		
	}

	@Test
  public void handlingDynamicWebTableWithContacts() {
		driver.get("http://www.teachmeselenium.com/automation-practice-webtable/");
		
		//  ************** METHOD 1 ******************************************	
					
					//  //*[@id="countries"]/tbody/tr[2]/td[2]/strong
					//  //*[@id="countries"]/tbody/tr[3]/td[2]/strong
					//  //*[@id="countries"]/tbody/tr[4]/td[2]/strong
					//
					//
					//
					//  //*[@id="countries"]/tbody/tr[197]/td[2]/strong
					
					List<WebElement> country_list=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr"));
					int total_country=country_list.size();
					System.out.println("Total no of countries in the table======="+total_country);
					
					String before_xpath=" //*[@id=\"countries\"]/tbody/tr[";
					String after_xpath="]/td[2]/strong";
					
					for(int i=2;i<=139;i++) {
						WebElement country=driver.findElement(By.xpath(before_xpath+i+after_xpath));
						String country_text=country.getText();
						System.out.println("Country at position "+i+"========"+country_text);
						
						if(country_text.equalsIgnoreCase("Palau")) {
							driver.findElement(By.xpath(" //*[@id=\"countries\"]/tbody/tr["+i+"]/td[1]/input")).click();
						// //*[@id="countries"]/tbody/tr[135]/td[1]/input
						
							break;
						
						}
					}

	}
	
	@Test
  public void w3Schools() {
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
		
		
  }
  @BeforeMethod
  public void launch() {
	  initialization();
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}

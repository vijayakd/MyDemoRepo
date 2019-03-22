package handlingWebTablesPack;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicWebTableWithContacts {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();	
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebDriverWait wait=new WebDriverWait(driver, 20);
				
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
						
						File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(src, new File("C:\\Users\\vijay\\eclipse-workspace\\ScreenShots\\webtable.png"));
						break;
					
					}
				}

			driver.quit();	
				
	}

}

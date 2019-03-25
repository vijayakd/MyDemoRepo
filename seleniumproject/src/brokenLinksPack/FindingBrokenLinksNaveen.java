
//Finding Broken Links



package brokenLinksPack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinksNaveen {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		WebDriver driver=null;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//  SWITCH TO FRAME WITH NAME  "classFrame"
		driver.switchTo().frame(2);
	   List<WebElement> link_list=driver.findElements(By.tagName("a"));
	   link_list.addAll(driver.findElements(By.tagName("img")));
	   System.out.println("Total no of links present is ================"+link_list.size());
	   
	   //   ACTIVE LINKS
	   
	   List<WebElement> active_links = new ArrayList<WebElement>();
	   
	   for(int i=0;i<link_list.size();i++) {
		   if(((link_list.get(i).getAttribute("href"))!=null)) {
			   active_links.add(link_list.get(i));
		   }		   System.out.println(link_list.get(i).getAttribute("href"));

	   }
	   
	   System.out.println("Total no of ACTIVE links present is ================"+active_links.size());
	   
	   for(int j=0;j<active_links.size();j++) {
		   
		   HttpURLConnection connection = (HttpURLConnection) new URL(active_links.get(j).getAttribute("href")).openConnection();
	  connection.connect();
	  String response=connection.getResponseMessage();
	  connection.disconnect();
	   System.out.println("active_links.get(j).getAttribute(\"href\")============="+response);
	   }
driver.quit();	}

}

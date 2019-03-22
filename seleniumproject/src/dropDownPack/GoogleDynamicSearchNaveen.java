package dropDownPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleDynamicSearchNaveen {
	static List<WebElement> list1;
	public static void main(String[] args) {

		 WebDriver driver;
		// int i;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	     driver.get("https://www.google.com/");
	     
	     driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Java");
	     
	    List<WebElement> list= driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//li"));
	 
	        System.out.println("LIST OF SEARCH RESULTS========"+list.size());
	        
	        for(int i=0;i<list.size();i++) {
		        System.out.println("LIST OF SEARCH RESULTS========"+i  +"----------"   +list.get(i).getText());}
	        
	        for(int i=0;i<list.size();i++) {
	        System.out.println("LIST OF SEARCH RESULTS========"+i  +"----------"  +list.get(i).getText());
	        
	        if(list.get(i).getText().equalsIgnoreCase("java interview questions")) {
	        	list.get(i).click();
	        	break;
	        	
	        }
	        }       
		     driver.quit();

	        
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		     driver.get("https://www.google.com/");
		     driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("selenium");
             
		   list1= driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//li"));
		   explicit_Wait(driver,list1);
	      
		    		int listsize= list1.size();
		    System.out.println(list1.size());
		    for(int j=0;j<listsize;j++) {
			    System.out.println(list1.get(j).getText());
			    if(list1.get(j).getText().contains("selenium webdriver")) {
			    	list1.get(j).click();
                   break;
		    }
		    }

	     driver.quit();
	     
	}
public static void  explicit_Wait(WebDriver driver,List<WebElement> list1) {
		
		 new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElements(list1));
	}

}

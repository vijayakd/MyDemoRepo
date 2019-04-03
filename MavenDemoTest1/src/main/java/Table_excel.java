import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_excel {

	public static WebDriver driver;
	public static FileInputStream fis=null;
	public static XSSFWorkbook excel=null;
public static int colnum;
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
            
		   System.out.println("No of months=======" + month_list.size());
		   System.out.println( "No of days=======" + day_list.size());
		   System.out.println("No of years======="+  year_list.size());
		  
		   String path="C:\\Users\\vijay\\Desktop\\FreeCRMTestData.xlsx";
		    
			try {
				fis = new FileInputStream(path);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		   try {
			 excel = new XSSFWorkbook(fis);
			 XSSFSheet sheet=excel.createSheet("bday_dd");
			 sheet.createTable();
			//XSSFSheet sheet=excel.createSheet("bday_dd");
			/*int totalrows=sheet.getPhysicalNumberOfRows();
			for(int i=0;i<totalrows;i++) {
			XSSFCell month_col=sheet.getRow(0).getCell(colnum);
			month_col.setCellValue("monval");
			}
		*/} catch (IOException e) {
			e.printStackTrace();
		}
		   
		   
		   
		   
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




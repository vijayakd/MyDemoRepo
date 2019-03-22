package seleniumpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Excel {
	
	static WebDriver driver;
   static int col=0;
  static XSSFWorkbook excel=null;
   //static int r=0;
   
   static int rowcnt;
   public static void main(String args[]) throws IOException  {
          
	 int j=0;
		int rownum=0;
        int cellnum=0;
        String data=null;
        FileInputStream fis=null;
	        fis = new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\test\\Book1.xlsx");
	        excel = new XSSFWorkbook(fis);
	       XSSFSheet sheet= excel.getSheet("Yahoo_Reg");
		   XSSFCell cell=sheet.getRow(rownum).getCell(cellnum);
	       data= cell.getStringCellValue();
	       System.out.println("Data Is=========="+data);

	         rowcnt = sheet.getLastRowNum();
	       int colcnt=sheet.getRow(1).getLastCellNum();
	       System.out.println("rows====="+rowcnt);
	       System.out.println("cols====="+colcnt);
	       
for(int i=0;i<rowcnt;i++) {
	for(j=0;j<colcnt;j++) {
	      XSSFCell  celldata=sheet.getRow(i).getCell(j);
	       System.out.println("celldata==in i===j====="+i+","+j+"======="+celldata);

	                     }
	   
                         }
  
System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       
	       driver.get("https://login.yahoo.com/account/create?");
	       
	       String fname=fname_getCellData(sheet,2,0);
	       System.out.println("fname======="+fname);
	
	       //driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys(arg0);
   }

	    
	public static String fname_getCellData(XSSFSheet sheet, int row,int col1) {
		String cellval=null;
		for(int i=0;i<rowcnt;i++) {
			      XSSFCell  celldata=sheet.getRow(i).getCell(col1);
			      // System.out.println("celldata==in i===col1====="+i+","+col1+"======="+celldata);		
		 cellval=celldata.getStringCellValue();
	       System.out.println("celldata==in i===col1====="+i+","+col1+"======="+celldata);		

		//return cellval;
		}
		return cellval;






	}

}

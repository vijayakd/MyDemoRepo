package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SignInPageTestData {
	
	              ////////////////NO MAIN()    //////////////
	
	/////////////////////   SIGN IN PAGE TEST DATA  ///////////////////////////////
	
	//public static String url="http://demo.redmine.org/";
	public static String SignInPageuname = "testsample22345674189";    //  USERNAME
	public static String SignInPageValidPwd = "password";    //   VALID PWD
	public static String SignInPageInValidPwd = "pass";      //   INVALID PWD
	public static String SignInPageBlankValidPwd = "";       //   BLANK PWD
	
	/////////////////////  READ FROM EXCEL FILE /////////////////////
	
	public static String readExcel(int rowNum, int cellNum) throws IOException {
		String data=null;
		FileInputStream fis=null;
		
		File file=new File("C:\\Users\\vijay\\eclipse-workspace\\test\\Book1.xlsx");
		 fis = new FileInputStream(file);
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		XSSFSheet sheet=excel.getSheet("SignInPage");
		XSSFCell cell=sheet.getRow(rowNum).getCell(cellNum);
	    data=cell.getStringCellValue();
		System.out.println("DATA IN CELL IS------"+data);
		excel.close();
		return data;
		
		
	}
	
	
	//////////////////////   WRITE TO EXCEL FILE   /////////////////////////
	//////////////////  NOT ABLE TO WRITE TO AN EXISTING SHEET /////////////
	////////////////// GETTING THE BELOW EXCEPTION     ////////////////////
	/*     Exception in thread "main" java.lang.NullPointerException
	at testdata.SignInPageTestData.write_to_excel_PASS(SignInPageTestData.java:60)
	at seleniumproject.SignInVerifyC.main(SignInVerifyC.java:100)*/

	
	/////////////////  NOW WORKING FINE AFTER DOING 2 THINGS
	//////////////////1.FORMATTING THE CELL TO TEXT SINCE WE R PASSING STRING
	/////////////////2.WE HAVE TO CREATE CELLNUM NOT GETCELL
	public static void write_to_excel_PASS(int rowNum,int cellNum) throws IOException {
		FileOutputStream fos=null;
		FileInputStream fis=null;

		File file=new File("C:\\Users\\vijay\\eclipse-workspace\\test\\Book1.xlsx");
		 fis =new FileInputStream(file);

		XSSFWorkbook excel= new XSSFWorkbook(fis);
		System.out.println("IN WRITE TO EXCEL METHOD");
		XSSFSheet sheet=excel.getSheet("SignInPage");
		System.out.println(" GOT SHEET");

		XSSFCell cell=sheet.getRow(rowNum).createCell(cellNum);
		System.out.println("   GOT CELL INFO");

		cell.setCellValue("PASS");
		 fos=new FileOutputStream(file);

		excel.write(fos);
	//fos.flush();//clean excel
	fos.close();
	excel.close();

	}




	
///////////////////   ABLE TO SUCCESSFULLY CREATE A NEW SHEET N WRITE TO IT   ///////////

/*public static void write_to_excel_PASS(int rowNum,int cellNum) throws IOException {
	FileOutputStream fos=null;
	FileInputStream fis=null;

	File file=new File("C:\\Users\\vijay\\eclipse-workspace\\test\\Book1.xlsx");
	 fis =new FileInputStream(file);

	XSSFWorkbook excel= new XSSFWorkbook(fis);
	System.out.println("IN WRITE TO EXCEL METHOD");
	XSSFSheet sheet=excel.createSheet("SignInPage3");
	XSSFCell cell=sheet.createRow(rowNum).createCell(cellNum);
	cell.setCellValue("PASS");
	 fos=new FileOutputStream(file);

	excel.write(fos);
	// fos=new FileOutputStream(file);
//excel.close();
fos.flush();//clean excel
fos.close();
excel.close();

}
*/
}



/* public static String readExcel(int rowNum,int cellNum){
File file=new File(""C:\\Users\\vijay\\eclipse-workspace\\test\\Book1.xlsx"");	
FileInputStream fis = new FileInputStream(file);
HSSFWorkbook excel= new HSSWorkbook("fis");
HSSFSheet sheet= excel.get.sheet("SignInPage");
HssfCell cell=sheet.getRow(rowNum).getcell(cellNum);
String data=cell.getString();
return data;
}	
	
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

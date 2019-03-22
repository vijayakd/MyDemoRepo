package javaScriptExecutorPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSChangeBackgroundColor {

	public static void main(String[] args) {
		WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://demo.redmine.org/login");
		WebElement loginbtn=	driver.findElement(By.xpath("//input[@name=\"login\"]"));
		System.out.println(loginbtn.getCssValue("backgroundColor"));
		flash(driver,loginbtn);
		
		
	}
public static void flash(WebDriver driver,WebElement element) {
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=1;i<100;i++) {
	changecolor("rgb(10,200,0)",driver,element);
	changecolor(bgcolor,driver,element);
	
	}
	
}

public static  void changecolor(String color,WebDriver driver,WebElement element) {
	JavascriptExecutor js= ((JavascriptExecutor)driver);
js.executeScript("arguments[0].style.backgroundColor='"+color+"';", element);
	
	
	
	
}






}

package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SignInVerifyIe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\vijay\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
         /*driver.get("https://www.google.com"); OPENING
         driver.close(); NOT CLOSING*/
		driver.get("http://demo.redmine.org/");
		
	}

}
//Can’t reach this page


package headlessPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserHTMLUnitDriver {
	 static WebDriver driver=null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
       // driver = new ChromeDriver();
driver= new HtmlUnitDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
       System.out.println( driver.getCurrentUrl());
       // driver.quit();
       /*
       NOT AVAILABLE FROM SELENIUM 3.X
       TO  USE IT WE HAVE TO DOWNLOAD HTMLUNIT DRIVER JARS
IT IT CALLED A GHOST DRIVER-----HEADLESS BROWSER
HTMLUNITDRIVER  --------FOR JAVA
PHANTOM JS     ---------FOR JAVASCRIPT
IDEAL FOR SMOKE AND SANITY TESTING
       ADVANTAGES
       1.NO BROWSER LAUNCH SO IT IS VERY FAST
       2.TESTING IS DONE BEHIND THE SCENES
       3.EXECUTION OF THE TEST CASES IS VERY FAST AND HENCE IMPROVES THE PERFORMANCE
NOT SUITABLE FOR
   MOUSE MOVEMENTS ACTIONS CLASS
   

       */

	}

}

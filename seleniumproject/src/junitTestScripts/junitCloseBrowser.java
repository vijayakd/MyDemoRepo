package junitTestScripts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class junitCloseBrowser {
	 static WebDriver driver=null;


	@AfterAll
	static void closeBrowser() throws Exception {
		 Thread.sleep(3000);
		    driver.quit();
			System.out.println("Browser Closed");
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}

package testNGTestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class TNGMouseAndKeyActions {
	 WebDriver driver=null;
  /*@Test
  public void dragAndDrop() throws InterruptedException {
      Actions action = new Actions(driver);

      driver.get("https://jqueryui.com/droppable/");
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.switchTo().frame(0);
      WebElement source = driver.findElement(By.id("draggable"));
      WebElement target =driver.findElement(By.id("droppable"));
      
      action.clickAndHold(source).moveToElement(target).release().build().perform();
      Thread.sleep(2000);
      
      driver.switchTo().defaultContent();
      System.out.println("============ DRAG AND DDROP TESTMETHOD ============");
      Thread.sleep(2000);
  }
  
  @Test
  public void mouseHover() {
      Actions action = new Actions(driver);

		driver.get("https://www.carmax.com/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement carmenu = driver.findElement(By.className("nav-item__link"));
		action.moveToElement(carmenu).build().perform();
		driver.findElement(By.className("nav--item--subnav--item")).click();
	      System.out.println("============ MOUSE HOVER TESTMETHOD ============");
         
  }*/
  
  @Test
  public void nrightClick() throws InterruptedException {
	  driver.get("http://jqueryui.com/selectable/");
      Actions action = new Actions(driver);
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
      WebElement rightclick =driver.findElement(By.xpath("//li[text()=\"Item 2\"]"));
      action.contextClick(rightclick).build().perform();
      Thread.sleep(3000);
      driver.switchTo().defaultContent();
      System.out.println("============ RIGHT CLICK TESTMETHOD ============");

  }
  
 /* @Test
  public void colorSlider() throws InterruptedException {
	  driver.get("http://jqueryui.com/slider/#colorpicker");
	  Actions action = new Actions(driver);
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
      WebElement colorslider =driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
      Thread.sleep(3000);
      action.clickAndHold(colorslider).moveByOffset(-10, 0).release().build().perform();
      Thread.sleep(3000);
      driver.switchTo().defaultContent();  
      System.out.println("============ COLOR SLIDER TESTMETHOD ============");

  }
  
  @Test
  public void keyBoardActions() {
	  driver.get("https://www.google.com/");
	  Actions action = new Actions(driver);
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
      action.sendKeys(Keys.RETURN).perform();
      System.out.println("============ KEYBOARD ACTIONS TESTMETHOD ============");

   
  }
  @Test
  public void reSizable() throws InterruptedException {
	  driver.get("http://jqueryui.com/resizable/");
      Actions action = new Actions(driver);
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
      Thread.sleep(2000);
      WebElement resizable= driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
      Thread.sleep(2000);
      action.clickAndHold(resizable).dragAndDropBy(resizable, 50, 30).release().build().perform();
      Thread.sleep(3000);
      driver.switchTo().defaultContent();
       System.out.println("============RESIZABLE TESTMETHOD ============");


  }*/
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();


  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

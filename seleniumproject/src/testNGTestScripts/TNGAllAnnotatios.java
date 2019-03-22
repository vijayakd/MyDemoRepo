package testNGTestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TNGAllAnnotatios {
  @Test
  public void f1() {
	  System.out.println("@Test-----5f1-----");

  }
  
  @Test
  public void f2() {
	  System.out.println("@Test-----5f2-----");

  }
  
  @Test
  public void f3() {
	  System.out.println("@Test-----5f3-----");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@Before Method-----4-----");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@After Method-----6-----");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Before Class-----3-----");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@After Class-----7-----");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@Before Test-----2-----");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@After Test-----8-----");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@Before Suite-----1-----");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@After Suite-----9-----");

  }

}

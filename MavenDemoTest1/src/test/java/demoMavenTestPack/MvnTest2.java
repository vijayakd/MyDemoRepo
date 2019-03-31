package demoMavenTestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MvnTest2 {
	 @Test
	  public void sum() {
		System.out.println("IN SUM ");
		  int a=10;
		  int b=20;
		  System.out.println(a+b);
		  Assert.assertEquals(30, b+a);

	  }
	  
	  @Test
	  public void sub() {
		System.out.println("IN SUB ");
		  int a=10;
		  int b=20;
		  Assert.assertEquals(10, b-a);
	  }
	  
	  @Test
	  public void mul() {
		System.out.println("IN MUL ");
		  int a=10;
		  int b=20;
		  System.out.println(a*b);
		  Assert.assertEquals(200, b*a);

	  }
	  
	  @Test
	  public void div() {
		System.out.println("IN DIV ");
		  int a=10;
		  int b=20;
		  System.out.println(b/a);
		  Assert.assertEquals(2, b/a);

	  }

}

package pompages;

import org.openqa.selenium.By;

public class SignInPageObjects {
	
	         //////////////// NO MAIN()   /////////////////
	
	////////////////////////////// OBJECTS IN SIGN IN PAGE///////////
	
	public static By signIn =By.linkText("Sign in");                        //sign In web element locator/object locator
	public static By uname =By.id("username");                            //username web element locator/object locator
	public static By pwd =By.id("password");                              //password web element locator/object locator
	public static By login = By.name("login");                           //login button web element locator/object locator
    public static By error = By.id("flash_error");                       //flash error web element locator/object locator
    public static By signingout = By.xpath("//a[@class=\"logout\"]");    //signOut   web element locator/object locator
   
//////////////////////////////OBJECTS IN YAHOO SIGN IN PAGE///////////////////////////////////////////////////////
    public static By YahooSign=By.xpath("//input[@id=\"login-username\"]");

    public static By YahooLogin=By.xpath("//input[@id=\"login-signin\"]");
	   
}

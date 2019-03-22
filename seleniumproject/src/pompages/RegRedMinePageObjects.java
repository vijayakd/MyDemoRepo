package pompages;

import org.openqa.selenium.By;

public class RegRedMinePageObjects {

                       ////////////////   NO MAIN()           ////////////////////////////////
	
		///////////////////    REGISTER PAGE OBJECTS IN DEMO.REDMINE.ORG /////////////////////////////////////////
		
       public static By register_link = By.linkText("Register");               //REGISTERLINK
       public static By user_login = By.id("user_login");                      ////LOGIN
       public static By user_pwd = By.id("user_password");                     //PASSWORD
       public static By user_pwd_conf = By.id("user_password_confirmation");   //PASSWORD CONFIRMATION 
       public static By first_name = By.id("user_firstname");                  //FIRSTNAME
       public static By last_name = By.id("user_lastname");                    //LASTNAME
       public static By user_email = By.id("user_mail");                       //EMAIL
       public static By user_language = By.xpath("//select[@id=\"user_language\"]//option[@selected]");  
       public static By user_commit = By.name("commit"); 
		
				
		
		
		
		
	

}

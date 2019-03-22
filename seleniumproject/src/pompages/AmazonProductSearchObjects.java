package pompages;

import org.openqa.selenium.By;

public class AmazonProductSearchObjects {
	
	public static By search_box = By.id("twotabsearchtextbox");
	public static By search_submit = By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]//input[@class=\"nav-input\"]");
    public static By select_item_link =By.linkText("The Wonky Donkey");
    public static By add_to_cart =By.id("add-to-cart-button");
    public static By proceed_to_chkout = By.xpath("//a[@id=\"hlb-ptc-btn-native\"]");

}

package locators;

import org.openqa.selenium.By;

public class LogoutLocators {
	
	public static  By ProfileDropdown=By.xpath("//li[@class='oxd-userdropdown']");
	public static  By logout=By.xpath("//ul[@class='oxd-dropdown-menu']/li/following-sibling::li/a[text()='Logout']");
	
}

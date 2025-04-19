package locators;

import org.openqa.selenium.By;

public class EmployeeListPageLocators {
	
//	public static int l;
	public static  By EmployeeList=By.xpath("//li[contains(@class,'oxd-topbar-body-nav-tab')]/following-sibling::li");
	public static  By nameField=By.xpath("(//div[@class='oxd-form-row']/div/div/div/div/following-sibling::div/div/div/input)[1]");
	public static  By search=By.xpath("//button[@type='submit']");
	public static  By Firstname=By.xpath("//div[contains(text(),'temp')]");
//	public static  By Lastname=By.xpath("//div[contains(text(),'user"+l+"')]");
	
	public static By getLastnameLocator(int l) {
	    return By.xpath("//div[contains(text(),'user" + l + "')]");
	}

	
}

package locators;

import org.openqa.selenium.By;


public class Pim {
	public static By PIM = By.xpath("//ul[@class='oxd-main-menu']/li/following-sibling::li");
	public static By AddEmployee= By.xpath("//li[contains(@class,'oxd-topbar-body-nav-tab')]/following-sibling::li[2]");
	public static By FirstName=By.xpath("//input[@name='firstName']");
	public static By LastName=By.xpath("//input[@name='lastName']");
	public static By EmpId=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[contains(text(),'Employee Id')]/../following-sibling::div/input");
	public static By Save=By.xpath("//button[@type='submit']");

}

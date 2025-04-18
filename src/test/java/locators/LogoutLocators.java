package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutLocators {
	public WebElement ProfileDropdown;
	public WebElement logout;

	public void initElements(WebDriver driver) {
		ProfileDropdown=driver.findElement(By.xpath("//li[@class='oxd-userdropdown']"));
		logout=driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li/following-sibling::li/a[text()='Logout']"));
	}
}

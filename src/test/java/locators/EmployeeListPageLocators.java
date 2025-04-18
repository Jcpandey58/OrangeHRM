package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeListPageLocators {
	public WebElement EmployeeList;
	public WebElement Firstname;
	public WebElement Lastname;
	
	public void initElements(WebDriver driver) {
		EmployeeList=driver.findElement(By.xpath("//li[contains(@class,'oxd-topbar-body-nav-tab')]/following-sibling::li"));
		Firstname=driver.findElement(By.xpath("//div[@class='header' and text()='First (& Middle) Name']/following-sibling::div[text()='abc ']"));
		Lastname=driver.findElement(By.xpath("//div[@class='header' and text()='Last Name']/following-sibling::div[text()='def']"));
		
	}
	
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUserLocators {
	public WebElement PIM;
	public WebElement AddEmployee;
	public WebElement FirstName;
	public WebElement LastName;
	public WebElement EmpId;
	public WebElement Save;
	
	public void initElements(WebDriver driver) {
		PIM=driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li/following-sibling::li"));
		AddEmployee=driver.findElement(By.xpath("//li[contains(@class,'oxd-topbar-body-nav-tab')]/following-sibling::li[2]"));
		FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		LastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		EmpId=driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[contains(text(),'Employee Id')]"));
		Save=driver.findElement(By.xpath("//button[@type='submit']"));
		
	}
}

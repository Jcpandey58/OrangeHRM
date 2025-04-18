package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboard {
	public WebElement dashboard;
	public void initElements(WebDriver driver) {
		dashboard=driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[8]"));
		
	}
}

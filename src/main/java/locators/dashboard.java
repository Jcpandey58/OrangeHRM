package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboard {
	public static WebElement dashboard;
	public static void initElements(WebDriver driver) {
		dashboard=driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[8]"));
	}
}

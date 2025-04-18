package Workflow1;

import java.time.Duration;
import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Login {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		LoginPageLocators locator=new LoginPageLocators();
		LoginPageLocators.initElements(driver);
		LoginPageLocators.username.sendKeys("admin");
		LoginPageLocators.password.sendKeys("admin123");
		LoginPageLocators.login.click();
	}
}

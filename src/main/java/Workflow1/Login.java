package Workflow1;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import locators.LoginPageLocators;


public class Login {
	public static void login(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(LoginPageLocators.username).sendKeys("admin");
		driver.findElement(LoginPageLocators.password).sendKeys("admin123");
		driver.findElement(LoginPageLocators.login).submit();
		System.out.println("login Success");
	}
}

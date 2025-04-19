package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators {
	
	public static  By username =By.name("username");
	public static By password =By.xpath("//input[@name='password']");
	public static By login =By.xpath("//button[contains(@class,'orangehrm-login-button')]");
}


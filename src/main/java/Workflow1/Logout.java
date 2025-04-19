package Workflow1;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import locators.LogoutLocators;

public class Logout {
	public static void logout(WebDriver driver) {
		driver.findElement(LogoutLocators.ProfileDropdown).click();
		driver.findElement(LogoutLocators.logout).click();
		System.out.println("Logged Out Successfully");
	}
}

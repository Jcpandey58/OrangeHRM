package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators {
    public static WebElement username;
    public static WebElement password;
    public static WebElement login;

    public static void initElements(WebDriver driver) {
        username = driver.findElement(By.xpath("//input[@name='username']"));
        password = driver.findElement(By.xpath("//input[@name='password']"));
        login = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]"));
    }
}

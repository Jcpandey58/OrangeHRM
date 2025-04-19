package Workflow1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils {
	public static void closeTabOrBrowser(WebDriver driver) {
		driver.close();
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	public static void Toast(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.oxd-toast-container")));
		System.out.println("Toast Message: " + toast.getText());
	}
}

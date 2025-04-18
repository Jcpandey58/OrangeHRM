package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class toast {

    public static void waitForSuccessToast(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // This assumes it's a div with class "oxd-toast" – update the locator based on your inspect
        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.oxd-toast-container")));

        System.out.println("Toast Message: " + toast.getText());
    }
}

package Workflow1;

import org.openqa.selenium.WebDriver;

public class utils {
	public static void closeTabOrBrowser(WebDriver driver) {
		driver.close();
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}

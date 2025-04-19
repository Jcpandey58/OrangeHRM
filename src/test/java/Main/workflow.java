package Main;

import Workflow1.Login;
import Workflow1.Logout;
import Workflow1.PimModule;
import Workflow1.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class workflow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login.login(driver);
		PimModule.addUser(driver);
		PimModule.verifyEmployees(driver);
		Logout.logout(driver);
		
		utils.quitBrowser(driver);
	}
}

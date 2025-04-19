package Workflow1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.EmployeeListPageLocators;
import locators.Pim;

public class PimModule {

	public static void addUser(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(Pim.PIM).click();

		for (int i=1;i<=4;i++) {
			driver.findElement(Pim.AddEmployee).click();
			driver.findElement(Pim.FirstName).sendKeys("temp");
			driver.findElement(Pim.LastName).sendKeys("user"+i);
			driver.findElement(Pim.EmpId).click();
			driver.findElement(Pim.EmpId).clear();
			driver.findElement(Pim.EmpId).sendKeys("JC1"+i);
			driver.findElement(Pim.Save).submit();
			System.out.println("user added");
			Thread.sleep(Duration.ofSeconds(2));
		}
	}


	public static void verifyEmployees(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(Pim.PIM).click();
		driver.findElement(EmployeeListPageLocators.EmployeeList).click();

		driver.findElement(EmployeeListPageLocators.nameField).sendKeys("temp");
		driver.findElement(EmployeeListPageLocators.search).click();

		for(int i=1,j=2; j<=10; i++,j++) {

			List<WebElement> firstNameList = driver.findElements(EmployeeListPageLocators.Firstname);
			List<WebElement> lastNameList = driver.findElements(EmployeeListPageLocators.getLastnameLocator(i));
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(EmployeeListPageLocators.Firstname));
//			for (WebElement element : firstNameList) {
//				System.out.println(element.getText());
//			}
//			for (WebElement element : lastNameList) {
//				System.out.println(element.getText());
//			}


			if(!firstNameList.isEmpty() && !lastNameList.isEmpty() ) {

				for(int k =1;k<=4;k++) {
					
					js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(EmployeeListPageLocators.Firstname));

					if(driver.findElement(EmployeeListPageLocators.Firstname).getText().equals("temp") 
							&& driver.findElement(EmployeeListPageLocators.getLastnameLocator(k)).getText().equals("user"+k)) {
						System.out.println(driver.findElement(EmployeeListPageLocators.Firstname).getText()+" "+driver.findElement(EmployeeListPageLocators.getLastnameLocator(k)).getText()+" verified Successfully");
					}
					else {
						System.out.println("User not verified");
					}
				}
			}

			else {

				driver.findElement(By.xpath("//button[contains(@class,'oxd-pagination-page-item') and text()='"+j+"']")).click();
			}
			break;
		}
	}
}

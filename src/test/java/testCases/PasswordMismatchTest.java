package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utility.Base;
import pageObjects.LandingPage;
import pageObjects.VerifyPhonenumberPage;

public class PasswordMismatchTest extends Base {
WebDriver driver;

	@Test
	public void passwordMismatch() throws IOException {
		driver = run();
		driver.get(prop.getProperty("url"));
		
		LandingPage lp = new LandingPage(driver);
		lp.getFirstname().sendKeys("first name");
		lp.getLastname().sendKeys("last name");
		lp.getEmail().sendKeys(lp.getRightEmail(9));
		String pwd = lp.getRightPassword(9);
		String pwd1 =lp.getRightPassword(9);
		lp.getPassword().sendKeys(pwd);
		lp.getConfirmPassword().sendKeys(pwd1);
		lp.getCheckbox().click();
		lp.getNextButton().click();
		Assert.assertTrue(lp.getPasswordErrorMsg().isDisplayed());
		
	}
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
}

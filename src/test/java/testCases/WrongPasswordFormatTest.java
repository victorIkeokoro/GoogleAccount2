package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.Base;
import pageObjects.LandingPage;
import pageObjects.VerifyPhonenumberPage;

public class WrongPasswordFormatTest extends Base {
	public WebDriver driver;

	@Test
	public void WrongPasswordFormat  () throws IOException {
		driver = run();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getFirstname().sendKeys("first name");
		lp.getLastname().sendKeys("last name");
		lp.getEmail().sendKeys(lp.getRightEmail(9));
		String pwd = lp.getWrongPassword();
		lp.getPassword().sendKeys(pwd);
		lp.getConfirmPassword().sendKeys(pwd);
		lp.getCheckbox().click();
		lp.getNextButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lp.passwordErrorMsg));
		Assert.assertTrue(lp.getPasswordErrorMsg().isDisplayed());
		
	}
}



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

public class SigninTest extends Base {
	public WebDriver driver;

	@Test
	public void signin() throws IOException {
		driver = run();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getFirstname().sendKeys("first name");
		lp.getLastname().sendKeys("last name");
		lp.getEmail().sendKeys(lp.getRightEmail(9));
		lp.getSiginin().click();
		String title = driver.getTitle();
		Assert.assertEquals("Sign in - Google Accounts", title);

	}
}

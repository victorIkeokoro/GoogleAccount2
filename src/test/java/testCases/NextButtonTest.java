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

public class NextButtonTest extends Base {
	public WebDriver driver;

	@Test
	public void nextButton() throws IOException {
		driver = run();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getFirstname().sendKeys("first name");
		lp.getLastname().sendKeys("last name");
		lp.getEmail().sendKeys(lp.getRightEmail(9));
		String pwd = lp.getRightPassword(9);
		lp.getPassword().sendKeys(pwd);
		lp.getConfirmPassword().sendKeys(pwd);
		lp.getCheckbox().click();
		lp.getNextButton().click();
		VerifyPhonenumberPage vp = new VerifyPhonenumberPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(vp.heading));
		Assert.assertEquals("Verify your phone number", vp.getHeading().getText());

	}
}

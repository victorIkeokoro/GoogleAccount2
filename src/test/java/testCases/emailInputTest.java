package testCases;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import utility.Base;

public class emailInputTest extends Base {
	WebDriver driver;
	@Test
	public void emailWrongInput() throws IOException {

		driver = run();
		
		driver.get(prop.getProperty("url"));
		
		LandingPage lp = new LandingPage(driver);
		String value = lp.getWrongEmail(8);
		lp.getEmail().sendKeys(value);
		String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
		lp.getEmail().sendKeys(clickonLink);
		String errormsg = lp.getEmailErrorMsg().getText();
		Assert.assertEquals(errormsg, "Sorry, only letters (a-z), numbers (0-9), and periods (.) are allowed.");
		
	}
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}

}

package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utility.Base;
import pageObjects.LandingPage;

public class ShowPasswordTest extends Base {
 WebDriver driver;

	@Test
	public void showPassword() throws IOException {
		driver = run();
		driver.get(prop.getProperty("url"));
	
		LandingPage lp = new LandingPage(driver);
		lp.getPassword().sendKeys("password");
		lp.getConfirmPassword().sendKeys("password");
		Assert.assertEquals("password", lp.getPassword().getAttribute("type"));
		lp.getCheckbox().click();
		Assert.assertEquals("text", lp.getPassword().getAttribute("type"));
		System.out.println(driver.getTitle());
	
	}
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}

}

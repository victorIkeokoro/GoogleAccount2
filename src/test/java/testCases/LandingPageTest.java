package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utility.Base;
public class LandingPageTest extends Base {

	WebDriver driver;
	@Test
	public void landingpage() throws IOException {
	
		driver = run();
		driver.get(prop.getProperty("url"));
		
		String title = driver.getTitle();
		Assert.assertEquals("Create your Google Account", title);
		
}
	
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	
}



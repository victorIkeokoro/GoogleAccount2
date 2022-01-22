package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utility.Base;
public class LandingPageTest extends Base {

	WebDriver driver;
	
	public void landingpage() throws IOException {
	
		driver = run();
		driver.get(prop.getProperty("url"));
		String title = driver.getTitle();
		Assert.assertEquals("Create your Google Account", title);
}
	
	
	
	
}



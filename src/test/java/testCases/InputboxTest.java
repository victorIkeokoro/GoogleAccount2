package testCases;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import utility.Base;

public class InputboxTest extends Base {
	WebDriver driver;

	@Test
	public void inputbox() throws IOException {

		driver = run();
		driver.get(prop.getProperty("url"));
	
		LandingPage lp = new LandingPage(driver);
		List<WebElement> inputboxes = lp.getInputbox();
		for (int i = 0; i < inputboxes.size(); i++) {

			inputboxes.get(i).sendKeys("Test input");
			String value = inputboxes.get(i).getAttribute("data-initial-value");
			Assert.assertEquals(value, "Test input");

		}
	
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	}

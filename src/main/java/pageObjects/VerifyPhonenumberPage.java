package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyPhonenumberPage {

	public WebDriver driver;

	public VerifyPhonenumberPage(WebDriver driver) {

		this.driver = driver;

	}

	public By heading = By.xpath("//span[text()=\"Verify your phone number\"]");

	public WebElement getHeading() {

		return driver.findElement(heading);

	}
}

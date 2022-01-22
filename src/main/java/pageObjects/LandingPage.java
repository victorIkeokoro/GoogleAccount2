package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

	By inputbox = By.cssSelector("input:not([type=\"checkbox\"])");
	By email = By.name("Username");
	By emailErrorMsg = By.className("o6cuMc");
	By checkbox = By.xpath("//input[@type=\"checkbox\"]");

	By password = By.name("Passwd");
	By confirmPassword = By.name("ConfirmPasswd");
	By links = By.tagName("a");
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");

	By nextButton = By.xpath("//button/span[text()=\"Next\"]");
	By signin = By.xpath("//span[text()=\"Sign in instead\"]");
	public By passwordErrorMsg= By.xpath("//div[@jsname=\"B34EJ\"]/span");
	By currentEmail = By.xpath("//span[text()=\"Use my current email address instead\"]");
	By newEmail = By.xpath("//span[text()=\"Create a new Gmail address instead\"]");

	public List<WebElement> getInputbox() {

		return driver.findElements(inputbox);

	}

	public WebElement getEmail() {

		return driver.findElement(email);
	}

	public WebElement getEmailErrorMsg() {

		return driver.findElement(emailErrorMsg);
	}

	public WebElement getCheckbox() {

		return driver.findElement(checkbox);
	}

	public WebElement getPassword() {

		return driver.findElement(password);
	}

	public WebElement getConfirmPassword() {

		return driver.findElement(confirmPassword);

	}

	public WebElement getNextButton() {

		return driver.findElement(nextButton);

	}

	public List<WebElement> getLinks() {

		return driver.findElements(links);

	}

	public WebElement getFirstname() {

		return driver.findElement(firstname);
	}

	public WebElement getLastname() {

		return driver.findElement(lastname);
	}

	public WebElement getPasswordErrorMsg () {

		return driver.findElement(passwordErrorMsg);
	}

	
	
	public WebElement getSiginin() {

		return driver.findElement(signin);

	}
	
	public WebElement getCurrentEmail() {
		
		return driver.findElement(currentEmail);
	}
	
public WebElement getNewEmail() {
		
		return driver.findElement(newEmail);
	}
	
	public String getWrongEmail(int n) {
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		String symbolsString = "[];!@#$%^&*()_+-=;";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (alphaNumericString.length() * Math.random());
			int index1 = (int) (symbolsString.length() * Math.random());
			sb.append(alphaNumericString.charAt(index));
			sb.append(symbolsString.charAt(index1));
		}

		return sb.toString();
	}

	public String getRightEmail(int n) {
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (alphaNumericString.length() * Math.random());

			sb.append(alphaNumericString.charAt(index));

		}

		return sb.toString();
	}

	public String getRightPassword(int n) {
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		String symbolsString = "[];!@#$%^&*()_+-=;";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (alphaNumericString.length() * Math.random());
			int index1 = (int) (symbolsString.length() * Math.random());
			sb.append(alphaNumericString.charAt(index));
			sb.append(symbolsString.charAt(index1));
		}

		return sb.toString();
	}
	public String getWrongPassword() {
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		String symbolsString = "[];!@#$%^&*()_+-=;";
		StringBuilder sb = new StringBuilder(2);
		for (int i = 0; i < 2; i++) {
			int index = (int) (alphaNumericString.length() * Math.random());
			int index1 = (int) (symbolsString.length() * Math.random());
			sb.append(alphaNumericString.charAt(index));
			sb.append(symbolsString.charAt(index1));
		}

		return sb.toString();
	}

}

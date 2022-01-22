package testCases;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.LandingPage;
import utility.Base;
public class Linktest extends Base{
	
	WebDriver driver;
	@Test
	public void link () throws IOException, InterruptedException {
		
		driver = run();
		driver.get(prop.getProperty("url"));
	
		LandingPage lp = new LandingPage(driver);
		List<WebElement> links= lp.getLinks();
		String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
		SoftAssert a =new SoftAssert();
	      for(WebElement link : links)
	    	  
	      {   
	    	  link.sendKeys(clickonLink);
	    	  String url= link.getAttribute("href");
	            HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
	          conn.connect();
	          int respCode = conn.getResponseCode();
	         a.assertTrue(respCode<400, "The link with Text "+" "+ link.getText()+" is broken with code" +respCode);
	      }
	      a.assertAll();
	     
	   
		}
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	}



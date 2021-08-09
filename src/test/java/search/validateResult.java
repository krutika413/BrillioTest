package search;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.ResultPage;
import resources.BaseClass;

public class validateResult extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("url"));
		log.info("Navigated to Search page");
	}

	@Test
	public void validateFirstResult() throws IOException {
		String searchInput = "Term";
		ResultPage l = new ResultPage(driver);

		LandingPage lp = new LandingPage(driver);
		lp.getsearchWE().click();
		lp.getsearchWE().sendKeys(searchInput);
		lp.getsearchButton().click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(l.getTitle()));
		log.info("First return result is " + l.getTitle().getText());
		Assert.assertTrue((l.getTitle().getText().contains(searchInput)), "Result is not correct");

		log.info("Successfully validated Text message");
		System.out.println("Test completed");

	}

	@AfterTest
	public void teardown() {

		driver.close();

	}

}

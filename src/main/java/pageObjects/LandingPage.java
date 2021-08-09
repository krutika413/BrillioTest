package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By searchBar = By.id("ybar-sbq");
	By searchButton = By.id("ybar-search");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getsearchWE() {
		return driver.findElement(searchBar);
	}

	public WebElement getsearchButton() {
		return driver.findElement(searchButton);
	}

}

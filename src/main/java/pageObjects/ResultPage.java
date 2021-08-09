package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
	
	public WebDriver driver;
	By firstResultWebElement=By.xpath("(//*[@class='compTitle'])[1]/h3/a");	
	
	public ResultPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(firstResultWebElement);
	}
	
	

}

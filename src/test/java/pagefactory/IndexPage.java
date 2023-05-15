package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Driver_Factory;
import utilities.Configreader;
import utilities.LoggerLoad;

public class IndexPage {
	WebDriver chromedriver ;
	final String homePageUrl = Configreader.getProperty("url"); ;
	
	@FindBy(xpath = "//button[text()='Get Started']") WebElement GetStarted;
	//By getStartedButton = By.xpath("//button[text()='Get Started']");
	
	public IndexPage(WebDriver chromedriver) {
		super();
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	public void clickGetStarted() {
		LoggerLoad.logInfo("Entering Method : IndexPage.clickGetStarted");
		GetStarted.click();
		LoggerLoad.logInfo("Exiting Method : IndexPage.clickGetStarted");
	}
	
	public void openDsAlgoPage() {
		LoggerLoad.logInfo("Entering Method : IndexPage.openDsAlgoPage");
		LoggerLoad.logDebug("The Home page URL is "+ homePageUrl);
		chromedriver.get(homePageUrl);
		LoggerLoad.logInfo("Exiting Method : IndexPage.openDsAlgoPage");
		
	}

	

}

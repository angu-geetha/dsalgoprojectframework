package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Driver_Factory;

public class IndexPage {
	WebDriver chromedriver ;
	final String homePageUrl = "https://dsportalapp.herokuapp.com/" ;
	
	@FindBy(xpath = "//button[text()='Get Started']") WebElement GetStarted;
	//By getStartedButton = By.xpath("//button[text()='Get Started']");
	
	public IndexPage(WebDriver chromedriver) {
		super();
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	public void clickGetStarted() {
		GetStarted.click();
	}
	
	public void openDsAlgoPage() {
		chromedriver.get(homePageUrl);
		
	}

	

}

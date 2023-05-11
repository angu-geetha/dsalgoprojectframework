package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Driver_Factory;


public class Homepage {
	WebDriver chromedriver ;
	final String homePageUrl = "https://dsportalapp.herokuapp.com/home" ;
	By getStartedButton = By.xpath("//button[text()='Get Started']");
	By  registerbtn = By.xpath("//a[text()=' Register ']");

	public Homepage(WebDriver chromedriver) {
		super();
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	public void openHomePage() {
		chromedriver.get(homePageUrl);
	}
	
	public void opensregisterPage() {
		chromedriver.navigate().to("https://dsportalapp.herokuapp.com/register");
		
	}
	
	
	
}

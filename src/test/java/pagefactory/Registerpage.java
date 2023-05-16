package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Driver_Factory;
import utilities.Configreader;
import utilities.LoggerLoad;

public class Registerpage {

	public static WebDriver chromedriver ;
	final String registerPageUrl = Configreader.getProperty("registerPageUrl");

	

	
	@FindBy(xpath = "//input[@value='Register']") WebElement registerbtn;
	@FindBy(name = "username") WebElement username;
	@FindBy(name = "password1") WebElement password1;
	@FindBy(name = "password2") WebElement password2confirmation;
	@FindBy(xpath = "//a[text()='Sign out']") WebElement signoutbtn;
	@FindBy(xpath = "//div[@class='alert alert-primary']") WebElement errorElement;
	

	
	
	public Registerpage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
		
	}

	public void opensregisterPage() {
		LoggerLoad.logInfo("Entering Method : opensregisterPage");
		LoggerLoad.logDebug("The Register page URL is "+ registerPageUrl);
		chromedriver.navigate().to(registerPageUrl);
		LoggerLoad.logInfo("Exiting Method : opensregisterPage");
		
	}
	public void clickRegisterbtn() {

		(registerbtn).click();

	}

	public void inputusername(String name) {

		(username).sendKeys(name);

	}

	public void sendpassword(String password) {

		(password1).sendKeys(password);

	}

	public void sendpasswordConfirmation(String passwordconfirmation) {

		(password2confirmation).sendKeys(passwordconfirmation);

	}

	public void clearusername() {

		(username).clear();

	}

	public String findusername() {

		String userNameValue = (username).getAttribute("value");
		return userNameValue;

	}

	public String findPassword() {

		String passwordNameValue = (password1).getAttribute("value");
		return passwordNameValue;

	}

	public String findPasswordconfirmation() {

		String passwordconfNameValue = (password2confirmation).getAttribute("value");
		return passwordconfNameValue;

	}

	public void getusernameeerormsg() {

		(username).clear();

	}

	public void clearpassword() {

		(password1).clear();

	}

	public void clearpasswordconfirmation() {

		(password2confirmation).clear();

	}

	public void signout() {

		(signoutbtn).click();

	}

	public String getErrorElementg() {

		return (errorElement).getText();

	}

	public String usernameErrorMsg() {
		return (username).getAttribute("validationMessage");

	}

	public String passwordErrorMsg() {
		return (password1).getAttribute("validationMessage");

	}

	public String passwordconfirmationErrorMsg() {
		return (password2confirmation).getAttribute("validationMessage");

	}

}

package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Driver_Factory;

public class Registerpage {

	public static WebDriver chromedriver ;

	final String homePageUrl = "https://dsportalapp.herokuapp.com/home";
	
	@FindBy(xpath = "//input[@value='Register']") WebElement registerbtn;
	@FindBy(name = "username") WebElement username;
	@FindBy(name = "password1") WebElement password1;
	@FindBy(name = "password2") WebElement password2confirmation;
	@FindBy(xpath = "//a[text()='Sign out']") WebElement signoutbtn;
	@FindBy(xpath = "//div[@class='alert alert-primary']") WebElement errorElement;
	//By registerbtn = By.xpath("//input[@value='Register']");
	//By username = By.name("username");
	//By password1 = By.name("password1");
	//By password2confirmation = By.name("password2");
	//By signoutbtn = By.xpath("//a[text()='Sign out']");
	//By errorElement = By.xpath("//div[@class='alert alert-primary']");

	
	
	public Registerpage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
		
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

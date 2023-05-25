package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerLoad;

public class GraphPage {
	public static WebDriver chromedriver;

	final String graphPageUrl = "https://dsportalapp.herokuapp.com/graph/";

	@FindBy(xpath = "//button[@class='btn']")
	public WebElement GetStarted;

	@FindBy(xpath = "//a[@href='/login']")
	public WebElement Signin;

	@FindBy(xpath = "//input[@id='id_username']")
	public WebElement Username;

	@FindBy(xpath = "//input[@id='id_password']")
	public WebElement Password;

	@FindBy(xpath = "//input[@value='Login']")
	public WebElement Login;

	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(text(),'Data Structures')]")
	WebElement DropDown;

	@FindBy(xpath = "//a[@href='/graph']")
	WebElement dropdownGraph;

	@FindBy(xpath = "//a[@href='graph']")
	WebElement Graphlink;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement GraphTryHereLink;

	
	@FindBy(xpath="//textarea[@tabindex='0']")
	WebElement tryEditorBox;

	@FindBy(xpath = "//button[@type='button']")
	WebElement Run;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement output;

	public GraphPage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}

	public void opengraphPage() {
		chromedriver.get(graphPageUrl);
	}

	public void dropdownGraph() {
		LoggerLoad.logInfo("click" + DropDown.getText() + "on drop down");
		DropDown.click();

		LoggerLoad.logInfo("click" + DropDown.getText() + "from the dropdown");
		dropdownGraph.click();

	}

	public void Graphlink() {
		LoggerLoad.logInfo("click" + Graphlink.getText() + "on graph page");
		Graphlink.click();
	}

	public void GraphTryHereLink() {
		LoggerLoad.logInfo("click" + GraphTryHereLink.getText() + "on graph page");
		GraphTryHereLink.click();
	}
	
	public void tryEditor(String typeCode) {
		tryEditorBox.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), typeCode);
	}

	public void runCode() {
		LoggerLoad.logInfo("click Run button");
		Run.click();
	}

	public String getOutput() throws InterruptedException {
		Thread.sleep(1000);
		return output.getText();
	}

}

package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.Configreader;
import utilities.LoggerLoad;

public class LinkedListPage {
	public static WebDriver chromedriver ;
	final String loginpageurl = Configreader.getProperty("loginpageurl");
	final String homePageUrl = Configreader.getProperty("homePageUrl");
	final String dsalgoPageUrl = Configreader.getProperty("url"); 
	@FindBy(xpath = "//input[@id='id_username']") WebElement Usernamebtn;
	@FindBy(xpath = "//a[text()='Introduction']") WebElement introductionbtn;
	@FindBy(xpath = "//a[text()='Try here>>>']") WebElement tryherebtn;
	@FindBy(xpath = "//input[@id='id_password']") WebElement Passwotdbtn;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginbtn;
	@FindBy(xpath = "//div[@id='navbarCollapse']//a[contains(text(),'Data Structures')]") WebElement dropdownbtn;
	//*
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[2]") WebElement linlkedlistbtn;
	@FindBy(xpath = "//div[@class='code-area']/div/pre") WebElement runresult;
	@FindBy(xpath = "//textarea[@tabindex='0']") WebElement tryhere;
	//@FindBy(xpath = "//div[@class='input']//div[1]/div/textarea") WebElement tryhere;
	//@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement tryhere;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement runbutton;
	@FindBy(xpath = "//a[text()='Creating Linked LIst']") WebElement creatinglinkedlistbutton;
	@FindBy(xpath = "//a[text()='Types of Linked List']") WebElement Typesoflinkedlistbutton;
	@FindBy(xpath = "//a[text()='Implement Linked List in Python']") WebElement ImplementLinkedListbtn;
	@FindBy(xpath = "//a[text()='Traversal']") WebElement traversalbtn;
	@FindBy(xpath = "//a[text()='Insertion']") WebElement insertionbtn;
	//a[text()='Deletion']
	@FindBy(xpath = "//a[text()='Deletion']") WebElement deletebtn;
	//a[text()='Practice Questions']
	@FindBy(xpath = "//a[text()='Practice Questions']") WebElement practicebtn;
	@FindBy(xpath = "//button[text()='Get Started']") WebElement GetStarted;
	
	public LinkedListPage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
		
	}


	public void opensSigninPage() {

		chromedriver.navigate().to(loginpageurl);

	}
	
	
	
	
	
	
	public void clickintroductionbtn() {

		(introductionbtn).click();

	}
	
	
	public void clicktryherebtn() {

		(tryherebtn).click();

	}
	

	public void inputusername(String name) {

		(Usernamebtn).sendKeys(name);

	}
	public void sendpassword(String password) {

		(Passwotdbtn).sendKeys(password);

	}
	public void clickLoginButton() {

		(loginbtn).click();

	}
	public void clickDropdownButton() {

		(dropdownbtn).click();

	}
	public void clickLinkedListButton() {

		(linlkedlistbtn).click();

	}
	public String getresult() {

		return (runresult).getText();

	}
	public void sendPythonCode(String code) {
		
		//(tryhere).clear();
		//ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=' CodeMirror-line ']"));
		
		try {
			Thread.sleep(3000);
			(tryhere).sendKeys(code);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickRunnbutton() {

		(runbutton).click();

	}
	
	public String getErrormessage() {
	String errormsg=chromedriver.switchTo().alert().getText();
	chromedriver.switchTo().alert().accept();
return errormsg;
	}

	public void clickCreatingLinkedListButton() {

		(creatinglinkedlistbutton).click();

	}
	

	public void clickTypesOfLinkedListButton() {

		(Typesoflinkedlistbutton).click();

	}
	public void clickImplementLinkedListButton() {

		(ImplementLinkedListbtn).click();

	}
	public void clickTraversalButton() {

		(traversalbtn).click();

	}
	public void clickInsertionButton() {

		(insertionbtn).click();

	}
	
	public void clickDeleteButton() {

		(deletebtn).click();

	}
	
	
	public void clickpracticeButton() {

		(practicebtn).click();

	}
	
	
	
	public void openHomePage() {
		chromedriver.get(homePageUrl);
	}
	
	
	public void clickGetStarted() {
		LoggerLoad.logInfo("Entering Method : IndexPage.clickGetStarted");
		GetStarted.click();
		LoggerLoad.logInfo("Exiting Method : IndexPage.clickGetStarted");
	}
	

	public void openDsAlgoPage() {
		LoggerLoad.logInfo("Entering Method : IndexPage.openDsAlgoPage");
		LoggerLoad.logDebug("The Home page URL is "+ dsalgoPageUrl);
		chromedriver.get(dsalgoPageUrl);
		LoggerLoad.logInfo("Exiting Method : IndexPage.openDsAlgoPage");
		
	}

	
	
	
	
	
}

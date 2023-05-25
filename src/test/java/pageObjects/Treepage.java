package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Configreader;

public class Treepage {

	public static WebDriver chromedriver ;
	final String loginpageurl = Configreader.getProperty("loginpageurl");
	
	
	public Treepage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
		
	}
	//a[text()='Implementation Of BST']
	@FindBy(xpath = "//a[text()='Implementation Of BST']") WebElement implementationofbstbtn;
	@FindBy(xpath = "//a[text()='Binary Search Trees']") WebElement binarysearchtreessbtn;
	@FindBy(xpath = "//a[text()='Applications of Binary trees']") WebElement applicationbinarytreessbtn;
	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']") WebElement implementationbinarytreessbtn;
	@FindBy(xpath = "//a[text()='Binary Tree Traversals']") WebElement binarytreetraversalsbtn;
	@FindBy(xpath = "//a[text()='Implementation in Python']") WebElement implementationsbtn;
	@FindBy(xpath = "//a[text()='Types of Binary Trees']") WebElement typesofbinarytreesbtn;
	@FindBy(xpath = "//a[text()='Binary Trees']") WebElement binarytreesbtn;
	@FindBy(xpath = "//a[text()='Traversals-Illustration']") WebElement traversalsillustrationbtn;
	@FindBy(xpath = "//a[text()='Tree Traversals']") WebElement treetraversalsbtn;
	@FindBy(xpath = "//a[text()='Types of Trees']") WebElement typesoftreesbtn;
	@FindBy(xpath = "//a[text()='Terminologies']") WebElement terminologiesbtn;
	@FindBy(xpath = "//div[@class='code-area']/div/pre") WebElement runresult;
	@FindBy(xpath = "//textarea[@tabindex='0']") WebElement tryhere;
	//@FindBy(xpath = "//div[@class='input']//div[1]/div/textarea") WebElement tryhere;
	//@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement tryhere;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement runbutton;
	@FindBy(xpath = "//a[text()='Try here>>>']") WebElement tryherebtn;
	@FindBy(xpath = "//div[@id='navbarCollapse']//a[contains(text(),'Data Structures')]") WebElement dropdownbtn;
	
	@FindBy(xpath = "//input[@id='id_username']") WebElement Usernamebtn;
	@FindBy(xpath = "//input[@id='id_password']") WebElement Passwotdbtn;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginbtn;
	
	@FindBy(xpath ="//a[text()='Tree']") WebElement treedropdownbtn;
	
	@FindBy(xpath ="//a[text()='Overview of Trees']") WebElement overviewtreebtn;
	@FindBy(xpath = "//a[text()='Practice Questions']") WebElement practicebtn;
	
	
	
	
	public void opensSigninPage() {

		chromedriver.navigate().to(loginpageurl);

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
	
	
	
	public void clickTreeDropdownButton() {

		(treedropdownbtn).click();

	}
	
	
	
	public void clickDropdownButton() {

		(dropdownbtn).click();

	}
	
	
	public void clickTreeOverviewButton() {

		(overviewtreebtn).click();

	}
	

	public void clicktryherebtn() {

		(tryherebtn).click();

	}
	public void clickRunnbutton() {

		(runbutton).click();

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
public String getErrormessage() {
	String errormsg=chromedriver.switchTo().alert().getText();
	chromedriver.switchTo().alert().accept();
return errormsg;
	}
public String getresult() {

	return (runresult).getText();

}
public void clickTermonoligiesButton() {

	(terminologiesbtn).click();

}public void clickTypesOfTreesButton() {

	(typesoftreesbtn).click();

}public void clickTreeTraversalsButton() {

	(treetraversalsbtn).click();

}
public void clickTraversalsIllustrationButton() {

	(traversalsillustrationbtn).click();

}
public void clickBinaryTreesButton() {

	(binarytreesbtn).click();

}
public void clickTypesOfBinaryTreesButton() {

	(typesofbinarytreesbtn).click();

}
public void clickImplementationsButton() {

	(implementationsbtn).click();

}
public void clickBinaryTreeTraversalsButton() {

	(binarytreetraversalsbtn).click();

}

public void clickImplementationBinaryTreesButton() {

	(implementationbinarytreessbtn).click();

}
public void clickApplicationBinaryTreesButton() {

	(applicationbinarytreessbtn).click();

}
public void clickBinarySearchTreesButton() {

	(binarysearchtreessbtn).click();

}
public void clickImplementationOfbstButton() {

	(implementationofbstbtn).click();

}
public void clickpracticeButton() {

	(practicebtn).click();

}






}

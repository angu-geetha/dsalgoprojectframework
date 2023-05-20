package pagefactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class ArrayPage {
	
	public static WebDriver chromedriver ;
	
	
	
	final String arrayPageUrl = "https://dsportalapp.herokuapp.com/array/";
	// Hpmepage
	
	@FindBy (xpath="//button[@class='btn']")
	public	WebElement  GetStarted;
	
	@FindBy (xpath ="//a[@href='/login']")
	public WebElement Signin;

	@FindBy (xpath ="//input[@id='id_username']")
	public WebElement Username;
	
	@FindBy (xpath="//input[@id='id_password']")
	public WebElement Password;
	
	@FindBy (xpath ="//input[@value='Login']")
	public WebElement Login;
	
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(text(),'Data Structures')]")
	WebElement DropDown;
	
	@FindBy(xpath = "//a[@href='/array']")
	WebElement dropdownArray;

	@FindBy(xpath = "//a[@href ='arrays-in-python']")
	WebElement ArraysinPython;
	
	@FindBy(xpath = "//a[@href ='arrays-using-list']")
	WebElement arrayUsingListPython;
	
	@FindBy(xpath = "//a[@href ='basic-operations-in-lists']")
	WebElement basicOperationListinPython;
	
	@FindBy(xpath = "//a[@href ='applications-of-array']")
	WebElement appOfArrayPython;
	
	@FindBy (xpath="//a[@href='/tryEditor']")
	WebElement TryHere;
	
	@FindBy(xpath="//textarea[@tabindex='0']")
	WebElement tryEditorBox;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement Run;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//pre[@id='output']")
	WebElement output;
	
	@FindBy (xpath=("//a[@href='/array/practice']"))
	WebElement practiceArray;
	
	
	@FindBy (xpath=("//a[@href='/question/1']"))
	WebElement SearchtheArray;
	
	@FindBy (xpath=("//a[@href='/question/2']"))
	WebElement maxConsecutive;
	
	@FindBy (xpath=("//a[@href='/question/3']"))
	WebElement evenNumberDigits;
	
	@FindBy (xpath=("//a[@href='/question/4']"))
	WebElement squaresOfSortedArray;
	
	public ArrayPage(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);		
	}

/*
	@Test
	public void setup() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(URL);
		PageFactory.initElements(driver, this);
		GetStarted.click();
		Signin.click();
		Username.sendKeys("dhik");
		Password.sendKeys("dhik!2205");
		Login.click();
		dropdownArray();
		arraysinPython();
		tryHere();
		String tryCode1 =ExcelReader.readCell("Array", "2", "1");
		TryEditorBox(tryCode1);
		Run.click();
		System.out.println(output.getText());
		
	}
*/	
	public void openArrayPage() {
		chromedriver.get(arrayPageUrl);
	}
	
	public void dropdownArray() {
		DropDown.click();
		dropdownArray.click();
	}

	public void arraysinPython() {
		ArraysinPython.click();
	}
	
	public void arrayUsingListPython() {
		arrayUsingListPython.click();
	}
	
	public void basicListsinPython() {
		basicOperationListinPython.click();
	}
	
	public void applOfArrayPython() {
		appOfArrayPython.click();
	}

	public void tryHere() {
		TryHere.click();
	}
	
	public void TryEditorBox(String typeCode) {
		tryEditorBox.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), typeCode);
	}
	
	public void runCode()
	{
		Run.click();
	}
	
	public void submitCode()
	{
		submit.click();
	}
	
	public String getOutput() throws InterruptedException
	{
		Thread.sleep(1000);
		return output.getText();
	}
	
	public String getErrorText() {
		String errorMsg = chromedriver.switchTo().alert().getText();
		chromedriver.switchTo().alert().accept();
		return errorMsg;

	}
	
	public void practiceArray() {
		practiceArray.click();
	}
	
	public void SearchtheArray () {
		SearchtheArray.click();
	}
	
	public void maxConsecutive() {
		maxConsecutive.click();
	}
	
	public void evenNumberDigits() {
		evenNumberDigits.click();
	}
	
	public void squaresSorted() {
		squaresOfSortedArray.click();
	}
	
}


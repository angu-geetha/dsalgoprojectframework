package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import driverFactory.Driver_Factory;
import pageObjects.Homepage;
import pageObjects.LinkedListPage;
import pageObjects.Registerpage;
import pageObjects.StartPage;
import pageObjects.Treepage;
import screenshots.Screenshot;
import utilities.Configreader;
import utilities.ExcelReader;
import utilities.LoggerLoad;




public class Register_TC {
	
	public static WebDriver chromedriver;
	
	
	StartPage indexPage ;
	Homepage homepage;
	Registerpage registerpage;
	LinkedListPage linkedlist;
	Treepage treepage;
	
	
	
	@BeforeSuite
	public void setUp(ITestContext context) {
		// load configuration class
		chromedriver = Driver_Factory.loadDriver();
		context.setAttribute("WebDriver", chromedriver);
		Configreader.loadProperty();
		indexPage = new StartPage(chromedriver);
		homepage =  new Homepage(chromedriver);
		registerpage = new Registerpage(chromedriver);
		linkedlist = new LinkedListPage(chromedriver);
		treepage = new Treepage(chromedriver);
		
		
	} 

	@Test
	public void testCase001() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase001()" );
		indexPage.openDsAlgoPage();
		indexPage.clickGetStarted();
		String url =chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is "+ url);
		AssertJUnit.assertEquals(url, Configreader.getProperty("homePageUrl"));
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase001()" );
	}
	
	@Test
	public void testCase002() {
		LoggerLoad.logInfo("Entering Method : testCase002" );
		registerpage.opensregisterPage();
		String userNameValue =registerpage.findusername();
		LoggerLoad.logDebug("The username entered by user is  "+ userNameValue);

		String passwordValue =registerpage.findPassword();
		LoggerLoad.logDebug("The password entered by user is  "+ passwordValue);
		String passwordconfValue=registerpage.findPasswordconfirmation();
		LoggerLoad.logDebug("The passwordconf entered by user is  "+ passwordconfValue);
		
		if (userNameValue.isEmpty()&& passwordValue.isEmpty()&& passwordconfValue.isEmpty()) {

		registerpage.clickRegisterbtn();

		}
		String formMessage = registerpage.usernameErrorMsg();
		String message1 =ExcelReader.readCell("RegisterPage", "1", "4");
		AssertJUnit.assertEquals(formMessage, message1);
		LoggerLoad.logInfo("Exiting Method : testCase002" );
	}
		
	@Test
	public void testCase003() {
		LoggerLoad.logInfo("Entering Method : testCase003" );
		registerpage.opensregisterPage();
		String userName =ExcelReader.readCell("RegisterPage", "2", "1");
		registerpage.inputusername(userName);
		String passwordNameValue =registerpage.findPassword();

		String passwordconfNameValue=registerpage.findPasswordconfirmation();

		if ( passwordNameValue.isEmpty()&& passwordconfNameValue.isEmpty()) {

		registerpage.clickRegisterbtn();
		
		}
		String formMessage = registerpage.passwordErrorMsg();
		String message1 =ExcelReader.readCell("RegisterPage", "2", "4");
		AssertJUnit.assertEquals(formMessage, message1);
		LoggerLoad.logInfo("Exiting Method : testCase003" );
	}
	
	@Test
	public void testCase004() {
		LoggerLoad.logInfo("Entering Method : testCase004" );
		registerpage.opensregisterPage();
		String userName =ExcelReader.readCell("RegisterPage", "3", "1");
		registerpage.inputusername(userName);
		String psswd =ExcelReader.readCell("RegisterPage", "3", "2");
		registerpage.sendpassword(psswd);
		

		String passwordconfNameValue=registerpage.findPasswordconfirmation();

		if ( passwordconfNameValue.isEmpty()) {

		registerpage.clickRegisterbtn();
		}
		String formMessage = registerpage.passwordconfirmationErrorMsg();
		String message1 =ExcelReader.readCell("RegisterPage", "3", "4");
		AssertJUnit.assertEquals(formMessage, message1);
		LoggerLoad.logInfo("Exiting Method : testCase004" );
		
	}
		
	@Test
	public void testCase005() {
		LoggerLoad.logInfo("Entering Method : testCase005" );
		registerpage.opensregisterPage();
		registerpage.clearusername();

		String userName =ExcelReader.readCell("RegisterPage", "4", "1");
		registerpage.inputusername(userName);
		
		registerpage.clearpassword();
		String psswd =ExcelReader.readCell("RegisterPage", "4", "2");
		registerpage.sendpassword(psswd);

		String confirmpsswd =ExcelReader.readCell("RegisterPage", "4", "3");
		

		registerpage.sendpasswordConfirmation(confirmpsswd);
		registerpage.clickRegisterbtn();
		String error =ExcelReader.readCell("RegisterPage", "4", "4");
		
		String errormsg = registerpage.getErrorElementg();
		
			AssertJUnit.assertEquals(errormsg,error);
			LoggerLoad.logInfo("Exiting Method : testCase005" );
		
	}
	
	@Test
	public void testCase006() {
		LoggerLoad.logInfo("Entering Method : testCase006" );
		registerpage.opensregisterPage();
		registerpage.clearusername();

		String userName =ExcelReader.readCell("RegisterPage", "5", "1");
		registerpage.inputusername(userName);
		
		registerpage.clearpassword();
		String psswd =ExcelReader.readCell("RegisterPage", "5", "2");
		registerpage.sendpassword(psswd);

		String confirmpsswd =ExcelReader.readCell("RegisterPage", "5", "3");
		

		registerpage.sendpasswordConfirmation(confirmpsswd);
		registerpage.clickRegisterbtn();
		String error =ExcelReader.readCell("RegisterPage", "5", "4");
		
		String errormsg = registerpage.getErrorElementg();
		AssertJUnit.assertEquals(errormsg,error);
		LoggerLoad.logInfo("Exiting Method : testCase006" );
	}
	
	@Test
	public void testCase007() {
		LoggerLoad.logInfo("Entering Method : testCase007" );
		registerpage.opensregisterPage();
		registerpage.clearusername();

		String userName =ExcelReader.readCell("RegisterPage", "6", "1");
		registerpage.inputusername(userName);
		
		registerpage.clearpassword();
		String psswd =ExcelReader.readCell("RegisterPage", "6", "2");
		registerpage.sendpassword(psswd);

		String confirmpsswd =ExcelReader.readCell("RegisterPage", "6", "3");
		

		registerpage.sendpasswordConfirmation(confirmpsswd);
		registerpage.clickRegisterbtn();
		String error =ExcelReader.readCell("RegisterPage", "6", "4");
		
		String errormsg = registerpage.getErrorElementg();
		AssertJUnit.assertEquals(errormsg,error);
		LoggerLoad.logInfo("Exiting Method : testCase007" );
	}
		 
	@Test
	public void testCase008() {
		LoggerLoad.logInfo("Entering Method : testCase008" );
		registerpage.opensregisterPage();
		registerpage.clearusername();

		String userName =ExcelReader.readCell("RegisterPage", "7", "1");
		registerpage.inputusername(userName);
		
		registerpage.clearpassword();
		String psswd =ExcelReader.readCell("RegisterPage", "7", "2");
		registerpage.sendpassword(psswd);

		String confirmpsswd =ExcelReader.readCell("RegisterPage", "7", "3");
		

		registerpage.sendpasswordConfirmation(confirmpsswd);
		registerpage.clickRegisterbtn();
		String error =ExcelReader.readCell("RegisterPage", "7", "4");
		String errormsg = registerpage.getErrorElementg();
		AssertJUnit.assertEquals(errormsg,error);
		LoggerLoad.logInfo("Exiting Method : testCase008" );
		
		
	}
	 
	@Test
	public void testCase009() {
		LoggerLoad.logInfo("Entering Method : testCase009" );
		registerpage.opensregisterPage();
		registerpage.clearusername();

		String userName =ExcelReader.readCell("RegisterPage", "8", "1");
		registerpage.inputusername(userName);
		
		registerpage.clearpassword();
		String psswd =ExcelReader.readCell("RegisterPage", "8", "2");
		registerpage.sendpassword(psswd);

		String confirmpsswd =ExcelReader.readCell("RegisterPage", "8", "3");
		

		registerpage.sendpasswordConfirmation(confirmpsswd);
		registerpage.clickRegisterbtn();
		String error =ExcelReader.readCell("RegisterPage", "8", "4");
		String errormsg = registerpage.getErrorElementg();
		AssertJUnit.assertEquals(errormsg,error);
		LoggerLoad.logInfo("Exiting Method : testCase009" );
	
	}
	 
		@Test
		public void testCase010() {
			LoggerLoad.logInfo("Entering Method : testCase010" );
			registerpage.opensregisterPage();
			registerpage.clearusername();

			String userName =ExcelReader.readCell("RegisterPage", "9", "1");
			registerpage.inputusername(userName);
			
			registerpage.clearpassword();
			String psswd =ExcelReader.readCell("RegisterPage", "9", "2");
			registerpage.sendpassword(psswd);

			String confirmpsswd =ExcelReader.readCell("RegisterPage", "9", "3");
			

			registerpage.sendpasswordConfirmation(confirmpsswd);
			registerpage.clickRegisterbtn();
			String error =ExcelReader.readCell("RegisterPage", "9", "4");
			String errormsg = registerpage.getErrorElementg();
			AssertJUnit.assertEquals(errormsg,error);
			LoggerLoad.logInfo("Exiting Method : testCase010" );
		}
		
		@Test
		public void testCase011() {
			LoggerLoad.logInfo("Entering Method : testCase011" );
			registerpage.opensregisterPage();
			registerpage.clearusername();

			String userName =ExcelReader.readCell("RegisterPage", "10", "1");
			registerpage.inputusername(userName);
			
			registerpage.clearpassword();
			String psswd =ExcelReader.readCell("RegisterPage", "10", "2");
			registerpage.sendpassword(psswd);

			String confirmpsswd =ExcelReader.readCell("RegisterPage", "10", "3");
			

			registerpage.sendpasswordConfirmation(confirmpsswd);
			registerpage.clickRegisterbtn();
			String error =ExcelReader.readCell("RegisterPage", "10", "4");
			String errormsg = registerpage.getErrorElementg();
			AssertJUnit.assertEquals(errormsg,error);
			LoggerLoad.logInfo("Exiting Method : testCase011" );
		
		}
		@Test
		public void testCase012() {
			LoggerLoad.logInfo("Entering Method : testCase012" );
			registerpage.opensregisterPage();
			registerpage.clearusername();

			String userName =ExcelReader.readCell("RegisterPage", "11", "1");
			registerpage.inputusername(userName);
			
			registerpage.clearpassword();
			String psswd =ExcelReader.readCell("RegisterPage", "11", "2");
			registerpage.sendpassword(psswd);

			String confirmpsswd =ExcelReader.readCell("RegisterPage", "11", "3");
			

			registerpage.sendpasswordConfirmation(confirmpsswd);
			registerpage.clickRegisterbtn();
			String error =ExcelReader.readCell("RegisterPage", "11", "4");
			String errormsg = registerpage.getErrorElementg();
			AssertJUnit.assertEquals(errormsg,error);
			LoggerLoad.logInfo("Exiting Method : testCase012" );
		
		}
	
}

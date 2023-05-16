package portal;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverFactory.Driver_Factory;
import pagefactory.Homepage;
import pagefactory.IndexPage;
import pagefactory.Registerpage;
import utilities.Configreader;
import utilities.ExcelReader;
import utilities.LoggerLoad;




public class Register_TC {
	
	public static WebDriver chromedriver;
	
	
	IndexPage indexPage ;
	Homepage homepage;
	Registerpage registerpage;
	
	
	
	@BeforeSuite
	public void setUp() {
		// load configuration class
		chromedriver = Driver_Factory.loadDriver();
		Configreader.loadProperty();
		indexPage = new IndexPage(chromedriver);
		homepage =  new Homepage(chromedriver);
		registerpage = new Registerpage(chromedriver);
		
	} 

	@Test
	public void testCase001() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase001()" );
		indexPage.openDsAlgoPage();
		indexPage.clickGetStarted();
		String url =chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is "+ url);
		assertEquals(url, Configreader.getProperty("homePageUrl"));
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
		assertEquals(formMessage, message1);
		LoggerLoad.logInfo("Exiting Method : testCase002" );
	}
		
	@Test
	public void testCase003() {
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
		assertEquals(formMessage, message1);
		
	}
	
	@Test
	public void testCase004() {
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
		assertEquals(formMessage, message1);
		
	}
		
	@Test
	public void testCase005() {
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
		assertEquals(errormsg,error);
	}
	
	@Test
	public void testCase006() {
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
		assertEquals(errormsg,error);
	}
	
	@Test
	public void testCase007() {
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
		assertEquals(errormsg,error);
	}
		 
	@Test
	public void testCase008() {
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
		assertEquals(errormsg,error);
		
		
	}
	 
	@Test
	public void testCase009() {
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
		assertEquals(errormsg,error);
	
	
	}
	 
		@Test
		public void testCase010() {
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
			assertEquals(errormsg,error);
		
		}
		
		@Test
		public void testCase011() {
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
			assertEquals(errormsg,error);
		
		}
		@Test
		public void testCase012() {
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
			assertEquals(errormsg,error);
		
		}
	
}

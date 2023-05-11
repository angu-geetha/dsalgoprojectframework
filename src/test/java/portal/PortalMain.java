package portal;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverFactory.Driver_Factory;
import pagefactory.Homepage;
import pagefactory.IndexPage;
import pagefactory.Registerpage;
import utilities.ExcelReader;




public class PortalMain {
	
	public WebDriver chromedriver;
	final String homePageUrl = "https://dsportalapp.herokuapp.com/" ;
	IndexPage indexPage ;
	Homepage homepage;
	Registerpage registerpage;
	
	
	
	@BeforeTest
	public void setUp() {
		chromedriver = Driver_Factory.loadDriver();
		
		 indexPage = new IndexPage(chromedriver);
		 homepage =  new Homepage(chromedriver);
		 registerpage = new Registerpage(chromedriver);
		
	} 

	@Test
	public void testCase001() {
		indexPage.openDsAlgoPage();
		indexPage.clickGetStarted();
		String url =chromedriver.getCurrentUrl();
		assertEquals(url, "https://dsportalapp.herokuapp.com/home");
	}
	
	@Test
	public void testCase002() {
		homepage.opensregisterPage();
		String userNameValue =registerpage.findusername();

		String passwordNameValue =registerpage.findPassword();

		String passwordconfNameValue=registerpage.findPasswordconfirmation();

		if (userNameValue.isEmpty()&& passwordNameValue.isEmpty()&& passwordconfNameValue.isEmpty()) {

		registerpage.clickRegisterbtn();

		}
		String formMessage = registerpage.usernameErrorMsg();
		String message1 =ExcelReader.readCell("RegisterPage", "1", "4");
		assertEquals(formMessage, message1);
	}
		
	@Test
	public void testCase003() {
		homepage.opensregisterPage();
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
		homepage.opensregisterPage();
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
		homepage.opensregisterPage();
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
		homepage.opensregisterPage();
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
		homepage.opensregisterPage();
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
		 
		
		
		
	
	
}

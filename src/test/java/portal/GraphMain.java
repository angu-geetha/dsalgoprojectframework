package portal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverFactory.Driver_Factory;
import pagefactory.ArrayPage;
import pagefactory.GraphPage;
import utilities.ExcelReader;

public class GraphMain {

		public WebDriver chromedriver;
		final String homePageUrl = "https://dsportalapp.herokuapp.com/" ;
		GraphPage graphpage;
		
		@BeforeTest
		public void setUp() {
			chromedriver = Driver_Factory.loadDriver();
			chromedriver.get(homePageUrl);
			graphpage = new GraphPage(chromedriver);
			graphpage.GetStarted.click();
			graphpage.Signin.click();
			graphpage.Username.sendKeys("dhik");
			graphpage.Password.sendKeys("dhik!2205");
			graphpage.Login.click();
		    graphpage.dropdownGraph();
		    
		}
	@Test
	
	public void TestCase001()  throws InterruptedException
	{
		graphpage .Graphlink();
		graphpage. GraphTryHereLink();
		String readPythonCode =ExcelReader.readCell("Array", "1", "0");
		String expectedOutput =ExcelReader.readCell("Array", "1", "1");
		graphpage.tryEditor(readPythonCode);
		graphpage.runCode();
		assertEquals(graphpage.getOutput(),expectedOutput);
		
		
	}
		

	}
	


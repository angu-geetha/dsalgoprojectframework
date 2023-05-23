package portal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverFactory.Driver_Factory;
import pagefactory.Homepage;
import pagefactory.IndexPage;
import pagefactory.LinkedListPage;
import pagefactory.Registerpage;
import utilities.Configreader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class LinkedList_TC {

	public static WebDriver chromedriver;
	LinkedListPage linkedlist;
	String homePageUrl;
	String linkedlistpageurl;
	String Introductionlinkedlistpage;
	String tryherelinkedlistpage;
	String creatinglinkedlistpageurl;
	String typesoflinkedlisturl;
	String ImplementLinkedListpage;
	String traversalpage;
	String Insertionlinkedlistpage;
	String deletionlinkedlistpage;
	String practicequestionpage;

	@BeforeTest(groups = { "Introduction", "linkedlist", "typesOfLinkedList", "ImplementLinkedList", "Traversal",
			"Insertion", "deletion", "practice" })
	public void setUp() {
		// load configuration class
		chromedriver = Driver_Factory.loadDriver();
		Configreader.loadProperty();
		/*
		 * linkedlist.openDsAlgoPage(); linkedlist.clickGetStarted();
		 * linkedlist.openHomePage(); linkedlist.opensSigninPage();
		 * linkedlist.inputusername("mani"); linkedlist.sendpassword("mani@1305");
		 * linkedlist.clickLoginButton(); linkedlist.clickDropdownButton();
		 * linkedlist.clickLinkedListButton();
		 */

		homePageUrl = Configreader.getProperty("homePageUrl");
		linkedlistpageurl = Configreader.getProperty("linkedlistpageurl");
		Introductionlinkedlistpage = Configreader.getProperty("Introductionlinkedlistpage");
		tryherelinkedlistpage = Configreader.getProperty("tryherelinkedlistpage");
		linkedlist = new LinkedListPage(chromedriver);
		creatinglinkedlistpageurl = Configreader.getProperty("creatinglinkedlistpageurl");
		typesoflinkedlisturl = Configreader.getProperty("typesoflinkedlisturl");
		ImplementLinkedListpage = Configreader.getProperty("ImplementLinkedListpage");
		traversalpage = Configreader.getProperty("traversalpage");
		Insertionlinkedlistpage = Configreader.getProperty("Insertionlinkedlistpage");
		deletionlinkedlistpage = Configreader.getProperty("deletionlinkedlistpage");
		practicequestionpage = Configreader.getProperty("practicequestionpage");

	}

	/*
	 * @BeforeMethod public void testCase001() {
	 * //LoggerLoad.logInfo("Entering Method  Register_TC.testCase001()");
	 * 
	 * linkedlist.opensSigninPage(); linkedlist.inputusername("mani");
	 * linkedlist.sendpassword("mani@1305"); linkedlist.clickLoginButton();
	 * linkedlist.clickDropdownButton(); linkedlist.clickLinkedListButton();
	 * LoggerLoad.logInfo("Exiting Method : Register_TC.testCase001()" );
	 */
	// groups = { "Introduction", "linkedlist" }

	@Test(priority = 1, groups = { "Introduction", "linkedlist", "typesOfLinkedList", "ImplementLinkedList",
			"Traversal", "Insertion", "deletion", "practice" })
	public void testCase002() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase002()");
		linkedlist.opensSigninPage();
		linkedlist.inputusername("mani");
		linkedlist.sendpassword("mani@1305");
		linkedlist.clickLoginButton();
		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		AssertJUnit.assertEquals(url, homePageUrl);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase002()");

	}

	//
	@Test(priority = 2, groups = { "Introduction", "linkedlist", "typesOfLinkedList", "ImplementLinkedList",
			"Traversal", "Insertion", "deletion", "practice" })
	public void testCase003() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase003()");
		// chromedriver.navigate().to(homePageUrl);
		linkedlist.clickDropdownButton();
		linkedlist.clickLinkedListButton();
		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		AssertJUnit.assertEquals(url, linkedlistpageurl);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase003()");
	}

	@Test(priority = 3, groups = { "Introduction" })
	public void testCase004() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()");
		// chromedriver.navigate().to(linkedlistpageurl);
		linkedlist.clickintroductionbtn();

		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		AssertJUnit.assertEquals(url, Introductionlinkedlistpage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()");
	}

	@Test(priority = 4, groups = { "Introduction" })
	public void testCase005() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase005()");
		// chromedriver.navigate().to(Introductionlinkedlistpage);
		linkedlist.clicktryherebtn();

		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		AssertJUnit.assertEquals(url, tryherelinkedlistpage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase005()");
	}

	@Test(priority = 5, groups = { "Introduction" })
	// @Test
	public void testCase006() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase006()");
		// chromedriver.navigate().to(tryherelinkedlistpage);
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		AssertJUnit.assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase006()");
	}

	@Test(priority = 6, groups = { "Introduction" })
	public void testCase007() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase007()");
		// chromedriver.navigate().to(Introductionlinkedlistpage);
		// linkedlist.clicktryherebtn();
		chromedriver.navigate().refresh();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		LoggerLoad.logDebug("errormsg " + errormsg);
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		LoggerLoad.logDebug("message1 " + message1);
		AssertJUnit.assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase007()");
	}

	@Test(priority = 3, groups = { "linkedlist" })

	public void testCase008() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase008()");
		// chromedriver.navigate().to(linkedlistpageurl);

		linkedlist.clickCreatingLinkedListButton();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		AssertJUnit.assertEquals(url, creatinglinkedlistpageurl);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase008()");
	}

	@Test(priority = 4, groups = { "linkedlist" })

	public void testCase009() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase009()");
		// chromedriver.navigate().to(creatinglinkedlistpageurl);
		linkedlist.clicktryherebtn();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		AssertJUnit.assertEquals(url, tryherelinkedlistpage);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase009()");
	}

	@Test(priority = 5, groups = { "linkedlist" })

	public void testCase010() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase010()");
		// chromedriver.navigate().to(creatinglinkedlistpageurl);
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		AssertJUnit.assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase010()");
	}

	@Test(priority = 6, groups = { "linkedlist" })
	public void testCase011() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase011()");
		chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		AssertJUnit.assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase011()");
	}

	@Test(priority = 3, groups = { "typesOfLinkedList" })

	public void testCase012() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase012()");
		// chromedriver.navigate().to(linkedlistpageurl);

		linkedlist.clickTypesOfLinkedListButton();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, typesoflinkedlisturl);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase012()");
	}

	@Test(priority = 4, groups = { "typesOfLinkedList" })

	public void testCase013() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase013()");
		// chromedriver.navigate().to(typesoflinkedlisturl);
		linkedlist.clicktryherebtn();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, tryherelinkedlistpage);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase013()");
	}

	@Test(priority = 5, groups = { "typesOfLinkedList" })

	public void testCase014() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase014()");
		// chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase014()");
	}

	@Test(priority = 6, groups = { "typesOfLinkedList" })

	public void testCase015() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase015()");
		chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase015()");
	}

	@Test(priority = 3, groups = { "ImplementLinkedList" })

	public void testCase016() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase016()");
		// chromedriver.navigate().to(linkedlistpageurl);
		linkedlist.clickImplementLinkedListButton();

		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, ImplementLinkedListpage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase016()");
	}

	@Test(priority = 4, groups = { "ImplementLinkedList" })

	public void testCase017() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase017()");
//chromedriver.navigate().to(ImplementLinkedListpage);
		linkedlist.clicktryherebtn();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, tryherelinkedlistpage);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase017()");
	}

	@Test(priority = 5, groups = { "ImplementLinkedList" })

	public void testCase018() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase018()");
		// chromedriver.navigate().to(ImplementLinkedListpage);
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase018()");
	}

	@Test(priority = 6, groups = { "ImplementLinkedList" })

	public void testCase019() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase019()");
		chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase019()");
	}

	@Test(priority = 3, groups = { "Traversal" })

	public void testCase020() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase020()");
		// chromedriver.navigate().to(linkedlistpageurl);
		linkedlist.clickTraversalButton();

		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, traversalpage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase0020()");

	}

	@Test(priority = 4, groups = { "Traversal" })

	public void testCase021() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase021()");
//chromedriver.navigate().to(traversalpage);
		linkedlist.clicktryherebtn();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, tryherelinkedlistpage);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase021()");
	}

	@Test(priority = 5, groups = { "Traversal" })

	public void testCase022() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase022()");
		// chromedriver.navigate().to(traversalpage);
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase022()");
	}

	@Test(priority = 6, groups = { "Traversal" })

	public void testCase023() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase023()");
		chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase023()");
	}

	@Test(priority = 3, groups = { "Insertion" })

	public void testCase024() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase024()");
		// chromedriver.navigate().to(linkedlistpageurl);
		linkedlist.clickInsertionButton();

		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, Insertionlinkedlistpage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase024()");

	}

	@Test(priority = 4, groups = { "Insertion" })

	public void testCase025() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase025()");
//chromedriver.navigate().to(Insertionlinkedlistpage);
		linkedlist.clicktryherebtn();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, tryherelinkedlistpage);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase025()");
	}

	@Test(priority = 5, groups = { "Insertion" })

	public void testCase026() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase026()");
		// chromedriver.navigate().to(Insertionlinkedlistpage);
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase026()");
	}

	@Test(priority = 6, groups = { "Insertion" })

	public void testCase027() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase027()");
		chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase027()");
	}

	@Test(priority = 3, groups = { "deletion" })

	public void testCase028() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase028()");
		// chromedriver.navigate().to(linkedlistpageurl);
		linkedlist.clickDeleteButton();

		String url = chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, deletionlinkedlistpage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase028()");
	}

	@Test(priority = 4, groups = { "deletion" })

	public void testCase029() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase029()");
//chromedriver.navigate().to(deletionlinkedlistpage);
		linkedlist.clicktryherebtn();
		String url = chromedriver.getCurrentUrl();

		LoggerLoad.logDebug("The current URL of the page is " + url);
		assertEquals(url, tryherelinkedlistpage);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase029()");
	}

	@Test(priority = 5, groups = { "deletion" })

	public void testCase030() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase030()");
		// chromedriver.navigate().to(deletionlinkedlistpage);
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "1", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String runresult = linkedlist.getresult();
		String message1 = ExcelReader.readCell("LinkedlistPage", "1", "2");
		assertEquals(runresult, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase030()");
	}

	@Test(priority = 6, groups = { "deletion" })

	public void testCase031() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase031()");
		chromedriver.navigate().refresh();
		// linkedlist.clicktryherebtn();
		String pythoncode = ExcelReader.readCell("LinkedlistPage", "2", "1");
		linkedlist.sendPythonCode(pythoncode);
		linkedlist.clickRunnbutton();

		String errormsg = linkedlist.getErrormessage();
		String message1 = ExcelReader.readCell("LinkedlistPage", "2", "2");
		assertEquals(errormsg, message1);

		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase031()");
	}

@Test(priority = 3 ,groups = { "practice" })
public void testCase032() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase032()" );
	//chromedriver.navigate().to(linkedlistpageurl);
	linkedlist.clickintroductionbtn();
	
	
	linkedlist.clickpracticeButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	assertEquals(url,practicequestionpage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase032()" );
}

}

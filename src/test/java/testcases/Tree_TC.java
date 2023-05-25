package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverFactory.Driver_Factory;
import pageObjects.LinkedListPage;
import pageObjects.Treepage;
import utilities.Configreader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class Tree_TC {

	public static WebDriver chromedriver;
	Treepage treepage;
	 String homePageUrl;
	 String treepageurl;
	 String overviewtreepage;
	 String tryheretreepage;
	 String termonoligiestreepage;
	 String TypesOftreespage;
	 String treetraversalspage;
	 String traversalsillustrationpage;
	 String binarytreespage;
	 String typesofbinarytreespage;
	 String implementationspage;
	 String binarytreetraversalspage;
	 String implementationofbinarypage;
	 String  applicationbinarytreespage;
	 String binarysearchtreesbutton;
	 String implementationofbstpage;
	 String treepracticepage;
	 
	
	@BeforeTest (groups = { "TreeOverview", "Termonologies", "typesOftrees", "treetraversals", "Traversalsillustration",
			"binarytrees", "typesofbinarytrees", "implementationinpython","binarytreetraversals" ,"implementation","application","binarysearch","implementationofbst","practice"})
	public void setUp() {
		// load configuration class
		  chromedriver = Driver_Factory.loadDriver();
		  Configreader.loadProperty();
		  treepage = new Treepage(chromedriver);
		  homePageUrl = Configreader.getProperty("homePageUrl");
		  treepageurl = Configreader.getProperty("treepageurl");
		  overviewtreepage = Configreader.getProperty("overviewtreepage");
		  tryheretreepage = Configreader.getProperty("tryheretreepage");
		  termonoligiestreepage = Configreader.getProperty("termonoligiestreepage");
		  TypesOftreespage = Configreader.getProperty("TypesOftreespage");
		  treetraversalspage = Configreader.getProperty("treetraversalspage");
		  traversalsillustrationpage = Configreader.getProperty("traversalsillustrationpage");
		  binarytreespage = Configreader.getProperty("binarytreespage");
		  typesofbinarytreespage = Configreader.getProperty("typesofbinarytreespage");
		  implementationspage = Configreader.getProperty("implementationspage");
		  binarytreetraversalspage = Configreader.getProperty("binarytreetraversalspage");
		  implementationofbinarypage = Configreader.getProperty("implementationofbinarypage");
		  applicationbinarytreespage = Configreader.getProperty("applicationbinarytreespage");
		  binarysearchtreesbutton = Configreader.getProperty("binarysearchtreesbutton");
		  implementationofbstpage = Configreader.getProperty("implementationofbstpage");
		  treepracticepage = Configreader.getProperty("treepracticepage");
	}

	
	
	@Test (priority = 1, groups = { "TreeOverview", "Termonologies", "typesOftrees", "treetraversals", "Traversalsillustration",
			"binarytrees", "typesofbinarytrees", "implementationinpython","binarytreetraversals" ,"implementation","application","binarysearch","implementationofbst","practice"})

	public void testCase002() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase002()" );
		treepage.opensSigninPage();
		treepage.inputusername("mani");
		treepage.sendpassword("mani@1305");
		treepage.clickLoginButton();
		String url =chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is "+ url);
		AssertJUnit.assertEquals(url,homePageUrl);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase002()" );
		treepage.clickDropdownButton();
	}

	@Test(priority = 2, groups = { "TreeOverview", "Termonologies", "typesOftrees", "treetraversals", "Traversalsillustration",
			"binarytrees", "typesofbinarytrees", "implementationinpython","binarytreetraversals" ,"implementation","application","binarysearch","implementationofbst","practice"})
	public void testCase003 () {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase003()" );
		//chromedriver.navigate().to(homePageUrl);
		treepage.clickTreeDropdownButton();
		String url =chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is "+ url);
		AssertJUnit.assertEquals(url,treepageurl);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase003()" );
	}
	
	@Test(priority = 3, groups = { "TreeOverview"})
	public void testCase004() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()" );
	//	chromedriver.navigate().to(treepageurl);
		treepage.clickTreeOverviewButton();
		
		
		String url =chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is "+ url);
		AssertJUnit.assertEquals(url,overviewtreepage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()" );
	}
	@Test(priority = 4, groups = { "TreeOverview"})
	public void testCase005() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase005()" );
		//chromedriver.navigate().to(overviewtreepage);
		treepage.clicktryherebtn();
		
		
		String url =chromedriver.getCurrentUrl();
		LoggerLoad.logDebug("The current URL of the page is "+ url);
		AssertJUnit.assertEquals(url,tryheretreepage);
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase005()" );
	}
	
	@Test(priority = 5, groups = { "TreeOverview"})
	public void testCase006() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase006()" );
		//chromedriver.navigate().to(tryheretreepage);
		String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
		treepage.sendPythonCode(pythoncode);
		treepage.clickRunnbutton();
		
		String runresult =treepage.getresult();
		String message1 =ExcelReader.readCell("Treepage", "1", "2");
		AssertJUnit.assertEquals(runresult, message1);
		
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase006()" );
	}
	@Test(priority = 6, groups = { "TreeOverview"})
	public void testCase007() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase007()" );
		chromedriver.navigate().refresh();
		//treepage.clicktryherebtn();
		String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
		treepage.sendPythonCode(pythoncode);
		treepage.clickRunnbutton();
		
		String errormsg =treepage.getErrormessage();
		String message1 =ExcelReader.readCell("Treepage", "2", "2");
		AssertJUnit.assertEquals(errormsg, message1);
		
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase007()" );
	}
@Test(priority = 3, groups = { "Termonologies"})
	
	public void testCase008() {
		LoggerLoad.logInfo("Entering Method : Register_TC.testCase008()" );
		//chromedriver.navigate().to(treepageurl);
		treepage.clickTermonoligiesButton();
	    String url =chromedriver.getCurrentUrl();
		
	    LoggerLoad.logDebug("The current URL of the page is "+ url);
		AssertJUnit.assertEquals(url,termonoligiestreepage);
		
		LoggerLoad.logInfo("Exiting Method : Register_TC.testCase008()" );
	}

@Test(priority = 4 ,groups = { "Termonologies" })

public void testCase009() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase009()" );
	//chromedriver.navigate().to(treepageurl);
	treepage.clicktryherebtn();
    String url =chromedriver.getCurrentUrl();
	
    LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase009()" );
}
@Test(priority = 5 ,groups = { "Termonologies" })

public void testCase010() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase010()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase010()" );
}

@Test(priority = 6 ,groups = { "Termonologies" })
public void testCase011() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase011()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase011()" );
}
@Test(priority = 3 ,groups = { "typesOftrees" })
public void testCase012() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickTypesOfTreesButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,TypesOftreespage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()" );
}
@Test(priority = 4 ,groups = { "typesOftrees" })
public void testCase013() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase005()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase005()" );
}
	
@Test(priority = 5 ,groups = { "typesOftrees" })

public void testCase014() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase010()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase010()" );
}
@Test(priority = 6 ,groups = { "typesOftrees" })
public void testCase015() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase011()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase011()" );
}
@Test(priority = 3 ,groups = { "treetraversals" })
public void testCase016() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickTreeTraversalsButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,treetraversalspage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()" );
}
@Test(priority = 4 ,groups = { "treetraversals" })
public void testCase017() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase005()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase005()" );
	
}@Test(priority = 5 ,groups = { "treetraversals" })

public void testCase018() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase010()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase010()" );
}
@Test(priority = 6 ,groups = { "treetraversals" })
public void testCase019() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase011()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase011()" );
}
@Test(priority = 3 ,groups = { "Traversalsillustration" })
public void testCase020() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickTraversalsIllustrationButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,traversalsillustrationpage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()" );
	
}
@Test(priority = 4 ,groups = { "Traversalsillustration" })
public void testCase021() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase005()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase005()" );
}
@Test(priority = 5,groups = { "Traversalsillustration" })

public void testCase022() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase010()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase010()" );
}

@Test(priority = 6 ,groups = { "Traversalsillustration" })
public void testCase023() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase011()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase011()" );
}
@Test(priority = 3 ,groups = { "binarytrees" })
public void testCase024() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickBinaryTreesButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,binarytreespage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()" );
}
@Test(priority = 4 ,groups = { "binarytrees" })
public void testCase025() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase005()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase005()" );

}
@Test(priority = 5 ,groups = { "binarytrees" })

public void testCase026() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase010()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase010()" );
}
@Test(priority = 6 ,groups = { "binarytrees" })
public void testCase027() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase011()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase011()" );
}
@Test(priority = 3 ,groups = { "typesofbinarytrees" })
public void testCase028() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase004()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickTypesOfBinaryTreesButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,typesofbinarytreespage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase004()" );
}
@Test(priority = 4 ,groups = { "typesofbinarytrees" })
public void testCase029() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase029()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase029()" );

}
@Test(priority = 5 ,groups = { "typesofbinarytrees" })

public void testCase030() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase030()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase030()" );
}
@Test(priority = 6 ,groups = { "typesofbinarytrees" })
public void testCase031() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase031()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase031()" );
}
@Test(priority = 3 ,groups = { "implementationinpython" })
public void testCase032() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase032()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickImplementationsButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,implementationspage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase032()" );
}
@Test(priority = 4 ,groups = { "implementationinpython" })
public void testCase033() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase033()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase033()" );

}
@Test(priority = 5 ,groups = { "implementationinpython" })

public void testCase034() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase034()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase034()" );
}
@Test(priority = 6 ,groups = { "implementationinpython" })
public void testCase035() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase035()");
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase035()" );
}
@Test(priority = 3 ,groups = { "binarytreetraversals" })
public void testCase036() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase036()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickBinaryTreeTraversalsButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,binarytreetraversalspage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase036()" );
}
@Test(priority = 4 ,groups = { "binarytreetraversals" })
public void testCase037() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase037()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase037()" );

}
@Test(priority = 5 ,groups = { "binarytreetraversals" })

public void testCase038() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase038()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase038()" );
}
@Test(priority = 6 ,groups = { "binarytreetraversals" })
public void testCase039() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase039()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase039()" );
}
@Test(priority = 3 ,groups = { "implementation" })

public void testCase040() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase040()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickImplementationBinaryTreesButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,implementationofbinarypage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase040()" );
}

@Test(priority = 4 ,groups = { "implementation" })

public void testCase041() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase041()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase041()" );

}
@Test(priority = 5 ,groups = { "implementation" })


public void testCase042() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase042()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase042()" );
}
@Test(priority = 6,groups = { "implementation" })

public void testCase043() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase043()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase043()" );
}
@Test(priority = 3 ,groups = { "application" })

public void testCase044() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase044()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickApplicationBinaryTreesButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,applicationbinarytreespage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase044()" );
}
@Test(priority = 4 ,groups = { "application" })
public void testCase045() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase045()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase045()" );


}

@Test(priority = 5 ,groups = { "application" })
public void testCase046() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase046()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase046()" );
}
@Test(priority = 6,groups = { "application" })
public void testCase047() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase047()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase047()" );
}
@Test(priority = 3 ,groups = { "binarysearch" })
public void testCase048() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase048()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickBinarySearchTreesButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,binarysearchtreesbutton);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase048()" );
}
@Test(priority = 4 ,groups = { "binarysearch" })

public void testCase049() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase049()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase049()" );


}@Test(priority = 5 ,groups = { "binarysearch" })


public void testCase050() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase050()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase050()" );
}
@Test(priority = 6 ,groups = { "binarysearch" })

public void testCase051() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase051()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase051()" );
}
@Test(priority = 3 ,groups = { "implementationofbst" })

public void testCase052() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase052()" );
//	chromedriver.navigate().to(treepageurl);
	treepage.clickImplementationOfbstButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,implementationofbstpage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase052()" );
}
@Test(priority = 4 ,groups = { "implementationofbst" })
public void testCase053() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase053()" );
	//chromedriver.navigate().to(overviewtreepage);
	treepage.clicktryherebtn();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,tryheretreepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase053()" );


}
@Test(priority = 5 ,groups = { "implementationofbst" })
public void testCase054() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase054()" );
	//chromedriver.navigate().to(treepageurl);
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "1", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String runresult =treepage.getresult();
	String message1 =ExcelReader.readCell("Treepage", "1", "2");
	AssertJUnit.assertEquals(runresult, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase054()" );
}
@Test(priority = 6 ,groups = { "implementationofbst" })
public void testCase055() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase055()" );
	chromedriver.navigate().refresh();
	//treepage.clicktryherebtn();
	String pythoncode =ExcelReader.readCell("Treepage", "2", "1");
	treepage.sendPythonCode(pythoncode);
	treepage.clickRunnbutton();
	
	String errormsg =treepage.getErrormessage();
	String message1 =ExcelReader.readCell("Treepage", "2", "2");
	AssertJUnit.assertEquals(errormsg, message1);
	
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase055()" );
}
@Test(priority = 3 ,groups = { "practice" })
public void testCase056() {
	LoggerLoad.logInfo("Entering Method : Register_TC.testCase056()" );
	//chromedriver.navigate().to(linkedlistpageurl);
	treepage.clickTreeOverviewButton();
	
	
	treepage.clickpracticeButton();
	
	
	String url =chromedriver.getCurrentUrl();
	LoggerLoad.logDebug("The current URL of the page is "+ url);
	AssertJUnit.assertEquals(url,treepracticepage);
	LoggerLoad.logInfo("Exiting Method : Register_TC.testCase056()" );
}

}

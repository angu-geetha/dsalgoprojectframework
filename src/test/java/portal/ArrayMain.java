package portal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverFactory.Driver_Factory;
import pagefactory.ArrayPage;
import utilities.ExcelReader;

public class ArrayMain {
	
	public WebDriver chromedriver;
	final String homePageUrl = "https://dsportalapp.herokuapp.com/" ;
	ArrayPage arrayPage;
	
	@BeforeTest
	public void setUp() {
		chromedriver = Driver_Factory.loadDriver();
		chromedriver.get(homePageUrl);
		arrayPage = new ArrayPage(chromedriver);
		arrayPage.GetStarted.click();
		arrayPage.Signin.click();
		arrayPage.Username.sendKeys("dhik");
		arrayPage.Password.sendKeys("dhik!2205");
		arrayPage.Login.click();
		arrayPage.dropdownArray();
	}
	
	@Test
	public void testCase001() throws InterruptedException
	{
		arrayPage.openArrayPage();
		arrayPage.arraysinPython();
		arrayPage.tryHere();
		String readPythonCode =ExcelReader.readCell("Array", "1", "0");
		String expectedOutput =ExcelReader.readCell("Array", "1", "1");
		arrayPage.TryEditorBox(readPythonCode);
		arrayPage.runCode();
		assertEquals(arrayPage.getOutput(),expectedOutput);
	}
	
	@Test
	public void testCase002()
	{
		arrayPage.openArrayPage();
		arrayPage.arraysinPython();
		arrayPage.tryHere();
		String readPythonCode =ExcelReader.readCell("Array", "2", "0");
		String expectedOutput =ExcelReader.readCell("Array", "2", "1");
		arrayPage.TryEditorBox(readPythonCode);
		arrayPage.runCode();
		assertEquals(arrayPage.getErrorText(),expectedOutput);
	}
	
  @Test
  public void testcase003() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.arrayUsingListPython();
	  arrayPage.tryHere();
	  String readPythonCode =ExcelReader.readCell("Array", "1", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "1", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);

  }
  
  @Test
  public void testcase004()
  {
	  arrayPage.openArrayPage();
	  arrayPage.arrayUsingListPython();
	  arrayPage.tryHere();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);

  }
  
  @Test
  public void testcase005() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.basicListsinPython();
	  arrayPage.tryHere();
	  String readPythonCode =ExcelReader.readCell("Array", "1", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "1", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);

  }
  
  @Test
  public void testcase006()
  {
	  arrayPage.openArrayPage();
	  arrayPage.basicListsinPython();
	  arrayPage.tryHere();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);

  }
  
  @Test
  public void testcase007() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.tryHere();
	  String readPythonCode =ExcelReader.readCell("Array", "1", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "1", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);

  }
  
  @Test
  public void testcase008()
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.tryHere();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);

  }
  
  @Test
  public void testcase009() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.SearchtheArray();
	  String readPythonCode =ExcelReader.readCell("Array", "3", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "3", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  
	  assertEquals(arrayPage.getOutput(),expectedOutput);
  }
  
  @Test
  public void testcase010() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.SearchtheArray();
	  String readPythonCode =ExcelReader.readCell("Array", "4", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "4", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.submitCode();
	  String o=arrayPage.getOutput();
	  System.out.println(o);
	  assertEquals(arrayPage.getOutput(),expectedOutput.trim());

  }
  
  @Test
  public void testcase011()
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.SearchtheArray();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);
  }
  
  @Test
  public void testcase012() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.maxConsecutive();
	  String readPythonCode =ExcelReader.readCell("Array", "5", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "5", "1");
	  arrayPage.TryEditorBox(readPythonCode);
	  arrayPage.runCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);
  }
  
  @Test
  public void testcase013() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.maxConsecutive();
	  String readPythonCode =ExcelReader.readCell("Array", "6", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "6", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.submitCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);
  }
  
  @Test
  public void testcase014()
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.maxConsecutive();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);
  }
  
  @Test
  public void testcase015() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.evenNumberDigits();
	  String readPythonCode =ExcelReader.readCell("Array", "7", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "7", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);
  }
  
  @Test
  public void testcase016() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.evenNumberDigits();
	  String readPythonCode =ExcelReader.readCell("Array", "8", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "8", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.submitCode();
	  String oo=arrayPage.getOutput();
	  System.out.println(oo);
	  assertEquals(arrayPage.getOutput().trim(),expectedOutput);
  }
  
  @Test
  public void testcase017()
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.evenNumberDigits();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);
  }
  
  @Test
  public void testcase018() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.squaresSorted();
	  String readPythonCode =ExcelReader.readCell("Array", "9", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "9", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  assertEquals(arrayPage.getOutput(),expectedOutput);
  }
  
  @Test
  public void testcase019() throws InterruptedException
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.squaresSorted();
	  String readPythonCode =ExcelReader.readCell("Array", "10", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "10", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.submitCode();
	  assertEquals(arrayPage.getOutput().trim(),expectedOutput);
  }
  
  @Test
  public void testcase020()
  {
	  arrayPage.openArrayPage();
	  arrayPage.applicationOfArrayPython();
	  arrayPage.practiceArray();
	  arrayPage.squaresSorted();
	  String readPythonCode =ExcelReader.readCell("Array", "2", "0");
	  String expectedOutput =ExcelReader.readCell("Array", "2", "1");
	  arrayPage.TryEditorBox(readPythonCode.trim());
	  arrayPage.runCode();
	  assertEquals(arrayPage.getErrorText(),expectedOutput);
  }

}

package screenshots;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.Driver_Factory;


public class Screenshot {

	public static WebDriver chromedriver;
	
public static void takeScreenshot(String stepname)  {
	
	chromedriver = Driver_Factory.loadDriver();
	
	
	chromedriver.get("https://dsportalapp.herokuapp.com/");
	TakesScreenshot screenshot = (TakesScreenshot)chromedriver;
	
File srcfile	=screenshot.getScreenshotAs(OutputType.FILE);



String  tcname = "TC_01";
String dir = "/Users/AKandan1/eclipse-workspace/dsalgoprojectframework";
Timestamp timestamp = new Timestamp(System.currentTimeMillis());


	String path = dir +"src/test/resources/screenshot/"+ tcname + "/screenshots_"+stepname+"_"+timestamp+ ".jpeg";
	
	File destfile = new File(path);
	try {
		FileUtils.copyFile(srcfile, destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}

package screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.Driver_Factory;
import io.cucumber.messages.types.Timestamp;

public class Screenshot {

	public static WebDriver chromedriver;
	
public static void takeScreenshot(String stepname) {
	
	chromedriver = Driver_Factory.loadDriver();
	
	
	chromedriver.get(stepname);
	TakesScreenshot screenshot = (TakesScreenshot)chromedriver;
	
File srcfile	=screenshot.getScreenshotAs(OutputType.FILE);


/*File destfile = new File(path);	
String  tcname = "TC_01";
String dir = System.getProperty("/Users/AKandan1/eclipse-workspace/dsalgoprojectframework");
java.sql.Timestamp= new Timestamp(System.currentTimeMillis());
}*/
}
	
	
}

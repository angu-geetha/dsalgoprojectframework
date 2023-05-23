package driverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Factory {

	public static WebDriver driver;
	
	public static WebDriver loadDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
}



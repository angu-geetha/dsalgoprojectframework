package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructurePage {

	
    	WebDriver driver;
			
			@FindBy(xpath = "//a[@href='data-structures-introduction']") WebElement GetStarted;
			@FindBy(xpath = "//a[@href='time-complexity']") WebElement TimeComplexity;
			@FindBy(xpath = "//a[@class='btn btn-info']") WebElement Tryhere;
			@FindBy(xpath = "//form[@id='answer_form']//button") WebElement Run;
			
			
			public  DataStructurePage(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
	
	public void GetStarted_link() {
		
	
		GetStarted.click();
	}

	public void TimeComplexity_link() {
		
		
		TimeComplexity.click();
	}
	
	
    public void Tryhere_button() {
		
		
	   Tryhere.click();

      }

    public void Run_button() {
		
	  Run.click();

    }
}

	
	

package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Driver_Factory;
import utilities.Configreader;
import utilities.LoggerLoad;


public class Homepage {
	WebDriver chromedriver ;
	
	final String homePageUrl = Configreader.getProperty("homePageUrl");
	By getStartedButton = By.xpath("//button[text()='Get Started']");
	
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")WebElement  getstart_datastructures;
	
	@FindBy(xpath="//a[@href='array']")WebElement getstart_array;
	@FindBy(xpath="//a[@href='linked-list']")WebElement getstart_linkedlist;
	@FindBy(xpath="	//a[@href='stack']"	) WebElement getstart_stack;
	@FindBy(xpath= "//a[@href='queue']")WebElement getstart_queue;
	@FindBy(xpath="//a[@href='tree']")WebElement getstart_tree;
	@FindBy(xpath="//a[@href='graph']")WebElement getstart_graph;
	By  clickstartedbtn = By.xpath("//a[text()='Get Started']");
	
	//@FindBy(xpath="//a[text()='Get Started']")WebElement clickstartedbtn;
	
	@FindBy (xpath="//*[@class='alert alert-primary']")WebElement Alert_msg;
	@FindBy(xpath="//a[normalize-space()='Sign in']")WebElement signin;
	
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(text(),'Data Structures')]")
	 WebElement DropDown;
   @FindBy(xpath="//a[href='#']")WebElement dropdown;
	@FindBy(xpath="//a[normalize-space()='Arrays']")WebElement dropdown_Array;
	@FindBy(xpath="//a[normalize-space()='Linked List']")WebElement dropdown_Linkedlist;
	@FindBy(xpath="//a[normalize-space()='Stack']")WebElement dropdown_Stack;
	@FindBy(xpath="//a[normalize-space()='Queue']")WebElement dropdown_Queue;
	@FindBy(xpath="//a[normalize-space()='Tree']")WebElement dropdown_Tree;
		@FindBy(xpath="//a[normalize-space()='Graph']")WebElement dropdown_Graph;
		//div[@class= 'dropdown-menu show']/a
		By  dropdowns = By.xpath("//div[@class= 'dropdown-menu show']/a");
	//a[text()='Get Started']
		//a[text()=' Register ']
		
		@FindBy(xpath="//a[text()=' Register ']")WebElement registerbtn;	
		
		
	public Homepage(WebDriver chromedriver) {
		super();
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}
	
	public void openHomePage() {
		chromedriver.get(homePageUrl);
	}
	
	
	
		
		public void getstartedclick(String string ) {
			switch(string)
		{
			case "Datastructures":
			getstart_datastructures.click();	
	         break;
	
			case"Arrays":
           getstart_array.click();
           break;
           
			case"Linkedlist":
		           getstart_linkedlist.click();
		           break;
		          
			case"Stack":
		           getstart_stack.click();
		           break;
		          
			case"Queue":
		           getstart_queue.click();
		           break;
		          
			case"Tree":
		           getstart_tree.click();
		           break;
		          
			case"Graph":
		           getstart_graph.click();
		           break;
		          
			}
		
		
		
	}
	
		public void getstartedclick(){
			List <WebElement> structures =chromedriver.findElements(clickstartedbtn);
			for (Iterator iterator = structures.iterator(); iterator.hasNext();) {
				WebElement webElement = (WebElement) iterator.next();
				if (webElement.getText().contains("Get Started")){
					webElement.click();
			
				} else {
					
					System.out.println("element not found");
					
				
				}
			
		}
			
			
			}
			
			
		

		public String Alert_msg() {
			// TODO Auto-generated method stub
			return Alert_msg.getText();
		}
		
		public void dropdownclick(String String) {
			
			
			 DropDown.click();
			
			switch(String) {
			
			case"Arrays":
				dropdown_Array.click();
			break;
			case "Linkedlist":
				dropdown_Linkedlist.click();
			break;
			case"Stack":
				dropdown_Stack.click();
				break;
			case"Queue":
				dropdown_Queue.click();
				break;
			case"Tree":
			dropdown_Tree.click();	
			break;
			case"Graph":
			dropdown_Graph.click();
			break;
			}
			}		
		
		public void signinlink() {
			
			signin.click();
		}
	public void clickregisterbtn() {
			
		registerbtn.click();
				}
		
		
}

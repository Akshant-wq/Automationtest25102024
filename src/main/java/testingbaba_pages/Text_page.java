package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Text_page extends  Baselibrary {
	
	
	public Text_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='close'] ")
	private WebElement closebtn;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement text;
	
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement name;
	
   public void clickonClosebtn() {
		
		closebtn.click();
	}
	
	public void clickonpractice() {
		
		practice.click();
	}
	
   public void clickonelements() {
		
	    elements.click();
	}
   public void clickontextbox() {
	    
	      text.click();
}
   public void clickonfull_name() {
	   
	  // name.click();
	   name.sendKeys("akshant");
	   
   }


}

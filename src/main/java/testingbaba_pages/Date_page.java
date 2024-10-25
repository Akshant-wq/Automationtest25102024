package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Date_page extends Baselibrary {

	public Date_page() {
		PageFactory.initElements(driver, this );
	}
	
	@FindBy(xpath = "//button[@data-target='#widget']")
    private WebElement widgwtsbtn;
	
	@FindBy (xpath = "//a[text()='date picker']")
	private WebElement datepickbtn;
	
	@FindBy(xpath = "//*[@id=\"datePickerContainer\"]/div[2]/div[2]/input")
	private WebElement dateinput;
	
	 public void clickonwidgwtsbtn () {
	    
		widgwtsbtn.click();
		}
	 
	 public void clickondatepickbtn() {
		 
		 datepickbtn.click();
		
	}
	
     public void datesend() {
	    
	 dateinput.sendKeys("12/05/2024 1150AM");
		
	}
}

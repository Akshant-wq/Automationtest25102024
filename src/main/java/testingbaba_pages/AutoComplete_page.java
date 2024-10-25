package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class AutoComplete_page extends Baselibrary {
	
	public AutoComplete_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target='#widget']")
     private WebElement widgwtsbtn;
	
	@FindBy(xpath = "//a[text()='auto complete']")
    private WebElement autocompletebtn;
	
	@FindBy(xpath = "//input[@id='myInput']")
	private WebElement selectinput;
	
	@FindBy (xpath = "//div[text()='dia']")
	 private WebElement dia;
	
	public void clickonwidgwtsbtn() {
		
		widgwtsbtn.click();
		
	}
     public void clickonautocompletebtn()  {
		
    	 autocompletebtn.click();
    	 driver.switchTo().frame(5);
    	 
	}
     public void clickonselectbtn() {
	
    	 selectinput.sendKeys("in");
	
}
     
     public void clickonIndiabtn() {
 		
 		dia.click();
 		
 	}
}

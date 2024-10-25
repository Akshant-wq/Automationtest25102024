package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class login1 extends Baselibrary{

	public login1() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='modal fade show']/div/div/div[1]/button")
	private WebElement closebtn1;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice1;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements1;
	
    public void clickonClosebtn2() {
		
		closebtn1.click();
	}
	
	public void clickonpractice2() {
		
		practice1.click();
	}
	
    public void clickonelements2() {
		
	    elements1.click();
	}
}

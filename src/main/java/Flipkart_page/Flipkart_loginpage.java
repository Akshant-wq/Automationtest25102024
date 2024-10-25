package Flipkart_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Flipkart_loginpage extends Baselibrary {

	public Flipkart_loginpage() {
		
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	
	private WebElement Loginbtn;
	
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")
	
	private WebElement Entermobileno;
    
    @FindBy(xpath = "//button[text()='Request OTP']")
	
   	private WebElement otpbtn;
	
	public void get_tital() {
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
	}
	
	public void loginbtn() {
		
		Loginbtn.click();
	}
	public void Enter_mobileno() {
		
		Entermobileno.sendKeys("8791003761");
	}
        public void opt_btn() {
		
        	otpbtn.click();;
	}
	}



package Guru99_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class login_page extends Baselibrary {
	
	public login_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@onkeyup='validateuserid();']" )
	private WebElement inputkey;
	
	@FindBy(xpath ="//input[@type='password']" )
	private WebElement password;

	@FindBy (xpath = "//input[@name='btnLogin']")
	private WebElement button;
	
	
public void getTitle_guru99() {
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
	}
	
	public void Input(String userid) {
		
		inputkey.click();
		inputkey.sendKeys(userid);
	}
	
public void Password(String password1) {
		
	  password.click();
	  password.sendKeys(password1);
	}

public void Button() {
	
	  button.click();
	}

}
package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Radio_buttonpage extends Baselibrary{
public Radio_buttonpage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='nav-link'][@href='#tab_3']")
	private WebElement radiobutton;
	
	@FindBy(xpath = "//input[@id='yes']")
	private WebElement yesbtn;
	
	@FindBy(xpath = "//p[@id='radio-content']")
	private WebElement gettext;
	
	public void Radiobutton() {
		
		radiobutton.click();
	}
	
   public void clickonyes() {
		
		yesbtn.click();
    }
   
   public void Textprint() {
		
 		String text = gettext.getText();
 		System.out.println(text);
     }



}

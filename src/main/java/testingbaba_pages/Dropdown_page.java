package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Dropdown_page extends Baselibrary {
	
	public Dropdown_page () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[@data-target='#widget']")
	private WebElement widgetsbtn;
	
	@FindBy (xpath ="//a[text()='select menu']" )
	private WebElement selectmenu;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	private WebElement dropd0;
	
	@FindBy(xpath = "(((//select[@class='form-control'])[2] /child::optgroup)[1]/child::option)[1]")
	private WebElement option1;
	
	@FindBy(xpath = "(//Select[@class='form-control'])[3]")
	private WebElement dropd1;
	
	@FindBy (xpath = "((//Select[@class='form-control'])[3]/child::option)[text()='PHP']")
	private WebElement HTML;
	
	
   public void clickonWidgetsbtn() {
	   widgetsbtn.click();
	   
   }
   
   public void clickonSelectmenubtn() {
	   selectmenu.click();
	   
   }
   
   public void clickonDropd0btn() {
	   dropd0.click();
	   
   }
   
   public void clickonOption1btn() {
	   option1.click();
	   
   }
   
   public void clickonDropd1btn() {
	   dropd1.click();
	   
   }
   
   public void clickonSelectHTMLbtn() {
	   HTML.click();
	   
   }
	

}

package Flipkart_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Cricbuzzpage extends  Baselibrary {
	
	public Cricbuzzpage() {
		
		PageFactory.initElements(driver, this );
	}
	
	@FindBy(xpath = "//img[@gtm-title='View All']")
	private WebElement slidebtn;
	
	@FindBy(xpath ="//li[@class='cb-view-all-ga cb-match-card cb-bg-white']/a[@title='South Africa v Afghanistan - 1st ODI']")
	private WebElement justclick;
	
	public void sbtn() {
		slidebtn.click();
	}
	
	public void clickMatch() {
		justclick.click();
	  
	}

}

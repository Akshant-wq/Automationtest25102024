package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Alert_page extends Baselibrary{
	
	public Alert_page() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement Alertbtn;
	
	@FindBy(xpath = "//a[text()='alerts']")
	private WebElement btnAlertclick;
	
	@FindBy(xpath = "//button[@onclick='myalert()']")
	private WebElement firstbtnAlert;
	
	@FindBy(xpath = "//button[@onclick='aftersec5()']")
	private WebElement secondbtnAlert;
	
	
	@FindBy(xpath = "//button[@onclick='myconfirm()']")
	private WebElement thirdbtnAlert;
	
	@FindBy(xpath = "//button[@onclick='myprompt()']")
	private WebElement forthbtnAlert;
	
	
	
	public void clickonAlertbtn() {
		Alertbtn.click();
		
	}
	
	public void clickonAlertclick() {
		btnAlertclick.click();
		
	}
	public void clickonfirstbtn() {
		firstbtnAlert.click();
		driver.switchTo().alert().accept();
	}
	public void clickonsecondbtn() throws InterruptedException {
		secondbtnAlert.click();		
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	}
	
	public void clickonthirdbtn() {
		 thirdbtnAlert.click();
		 driver.switchTo().alert().dismiss();
	}
	
	public void clickonforthbtn() {
		 forthbtnAlert.click();
		 driver.switchTo().alert().sendKeys("akshant");
		 driver.switchTo().alert().accept();
	}
	
}
	
	
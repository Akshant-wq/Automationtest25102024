package testingbaba_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class checkbox_page extends Baselibrary {
	
	public checkbox_page() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//a[@href='#tab_2']" )
	private WebElement Checkbox;
	@FindBy(xpath ="//input[@id='myCheck']" )
	private WebElement Mobilebtn;
	
	@FindBy(xpath = "//input[@id='mylaptop']")
	private WebElement laptopbtn;
	
	@FindBy(xpath = "//input[@id='mydesktop']")
	private WebElement desktopbtn;
	
	public void clickoncheckbox() {
		
		 Checkbox.click();
		 driver.switchTo().frame(0);
	}
	public void clickonmobilebtn() {
		
		Mobilebtn.click();
		  String mobiltext =driver.findElement(By.xpath("//h6[@id='text']")).getText();
		  if(mobiltext.equals("You are selected Mobile")) {
			  System.out.println("Passed");
		  }
		  else {
			  System.out.println("Failed");
		  }
	}
	public void clickonlaptopbtn() {
		
		laptopbtn.click();
		 String Laptoptext =driver.findElement(By.xpath("//h6[@id='text1']")).getText();
		  if(Laptoptext.equals("You are Selected Laptop")) {
			  System.out.println("Passed");
		  }
		  else {
			  System.out.println("Failed");
		  }
	}
	public void clickondesktopbtn() {
		
		 desktopbtn.click();
		 String desktoptext =driver.findElement(By.xpath("//h6[@id='text2']")).getText();
		  if(desktoptext.equals("You are Selected Desktop")) {
			  System.out.println("Passed");
		  }
		  else {
			  System.out.println("Failed");
		  }
	

}}

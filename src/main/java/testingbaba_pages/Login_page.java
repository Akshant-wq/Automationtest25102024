package testingbaba_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Login_page extends  Baselibrary{
	
	public Login_page() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "/html/body/label")
	private WebElement mobilebtn;
	
	
	
	@FindBy(xpath = "//input[@id='mylaptop']")
	private WebElement laptopbtn;
	
	@FindBy(xpath = "//input[@id='mydesktop']")
	private WebElement desktopbtn;
	
	
	
	
	public void getTitle_testingbaba() {
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
	}
	
	public void clickonClosebtn() {
		
		closebtn.click();
	}
	
	public void clickonpractice() {
		
		practice.click();
		
	}
	
public void clickonelements() {
		
	    elements.click();
	}

public void clickoncheckbox() {
	//explicitwait(elements, 4);
	 checkbox.click();
	 driver.switchTo().frame(0);
}
public void clickonmobilebtn() {
	
	 mobilebtn.click();
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
}
}


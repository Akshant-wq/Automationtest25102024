package testingbaba_pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class robortcls_page extends Baselibrary {
	
	public robortcls_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='upload and download']")
	private WebElement Uploadbtn;
	
	@FindBy(xpath = "//label[text()='Select a file']")
	private WebElement filebtn;
	
	
	public void downloadbtn(){
		
		Uploadbtn.click();
	}
	
    public void fileuploadbtn() throws InterruptedException{
	
		  filebtn.click();
		Thread.sleep(3000);
	   uploadflil("C:\\Users\\Dell\\eclipse-workspace\\Automation_testing\\testdata\\100M FILTER.pdf");
	}
	
	

}

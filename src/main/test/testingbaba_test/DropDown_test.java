package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Dropdown_page;
import testingbaba_pages.login1;

public class DropDown_test extends Baselibrary {
	
	login1 login;
	Dropdown_page Drop;
	
	@BeforeTest
	public void getLauchUrl() {
		
		getlaunchurl("https://testingbaba.com/old/");
		login = new login1();
		Drop = new Dropdown_page();
	}
	@Test(priority = 0)
	public void closebtn() {
		
	    login.clickonClosebtn2();
	}
	
	@Test(priority = 1)
	public void practicebtn() {
		
		login.clickonpractice2();
	}
	
	@Test(priority = 2)
    public void Widgetsbtn() {
		
		Drop.clickonWidgetsbtn();
	}
	
	@Test(priority = 3)
    public void Selectmenubtn() {
		
		Drop.clickonSelectmenubtn();
	}
	

	@Test(priority = 4)
    public void Dropd0btn() {
		
  		Drop.clickonDropd0btn();
  	}
	
	@Test(priority = 5)
    public void option1() throws InterruptedException {
		
		Thread.sleep(3000);		
  		Drop.clickonOption1btn();
  	}
	
	@Test(priority = 6)
    public void Dropd1btn() {
		
  		Drop.clickonDropd1btn();
  	}
    
	@Test(priority = 7)
    public void HTMLbtn() throws InterruptedException {
		Thread.sleep(3000);
  		Drop.clickonSelectHTMLbtn();
  	}
}

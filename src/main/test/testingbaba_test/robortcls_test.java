package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import testingbaba_pages.login1;
import testingbaba_pages.robortcls_page;

public class robortcls_test extends Baselibrary {
login1 ak;
robortcls_page rb;
	
	@BeforeTest
	public void getLaunchurl_testingbaba() {
		
		getlaunchurl("https://testingbaba.com/old/");
		ak= new login1();
		rb= new robortcls_page();
		
		}
	
	@Test(priority = 0)
	public void Closebtn()  {
		
		
		ak.clickonClosebtn2();
	}
	@Test(priority = 1)
	public void Practice() {
		
		ak.clickonpractice2();
}
	@Test(priority = 2)
	public void Element() {
		
		ak.clickonelements2();
		
}
	@Test(priority = 3)
	public void uploadbtn() {
		
		rb.downloadbtn();
		
}
	@Test(priority = 4)
	public void clickonfilebtn() throws InterruptedException  {
		
		rb.fileuploadbtn();
		
	}
	
}

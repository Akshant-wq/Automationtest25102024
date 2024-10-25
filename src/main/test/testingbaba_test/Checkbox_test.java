package testingbaba_test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.checkbox_page;
import testingbaba_pages.login1;

public class Checkbox_test extends Baselibrary {
	
	login1 ak;
	checkbox_page ch;
	
	@BeforeTest
	public void getLaunchurl_testingbaba() {
		
		getlaunchurl("https://testingbaba.com/old/");
		ak= new login1();
		ch =new  checkbox_page(); 
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
	public void Checkbox() {
		
		ch.clickoncheckbox();
	}
	@Test(priority = 4)
	public void Mobilebtn() throws IOException {
		
		ch.clickonmobilebtn();
		getScreenshot("mobileCheckbox", "mobileClickScreenShot");
	}
	@Test(priority = 5)
	public void Laptopbtn() {
		
		ch.clickonlaptopbtn();
	}
	@Test(priority = 6)
	public void Desktopbtn(){
		
		ch.clickondesktopbtn();
	}
	

}

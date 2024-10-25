package testingbaba_test;




import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Radio_buttonpage;
import testingbaba_pages.login1;

public class Radiobutton_test extends Baselibrary {
	login1 ak;
	Radio_buttonpage sa;
	
	@BeforeTest
	public void getLaunchurl_testingbaba() {
		
		getlaunchurl("https://testingbaba.com/old/");
		ak= new login1();
		sa =new  Radio_buttonpage(); 
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
	public void radiobtn() {
		
		sa.Radiobutton();
}
	@Test(priority = 4)
	public void clickyes() throws IOException {
		
		sa.clickonyes();
		getScreenshot("screenshot","first1");
	}
	
	@Test (priority = 5)
	public void printtext() {
	sa.Textprint();
	
	}
	}

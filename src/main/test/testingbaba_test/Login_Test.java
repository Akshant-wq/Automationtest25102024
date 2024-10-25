package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Login_page;

public class Login_Test extends Baselibrary {
	
	
	Login_page ob;
	@BeforeTest
	public void getLaunchurl_testingbaba() {
		
		getlaunchurl("https://testingbaba.com/old/");
	
		
	}
	
	
	@Test(priority = 0)
	public void testingbaba() {
		ob =new Login_page();
		ob.getTitle_testingbaba();
			}
	@Test(priority = 1)
	public void Closebtn()  {
		
		
		ob.clickonClosebtn();
	}
	@Test(priority = 2)
	public void Practice() {
		
		ob.clickonpractice();
	}
	@Test(priority = 3)
	public void Elements()  {
	
		ob.clickonelements();
	}
	@Test(priority = 4)
	public void Checkbox() {
		
		ob.clickoncheckbox();
	}
	@Test(priority = 5)
	public void Mobilebtn() {
		
		ob.clickonmobilebtn();
	}
	@Test(priority = 6)
	public void Laptopbtn() {
		
		ob.clickonlaptopbtn();
		System.out.println(System.getProperty("user.div"));
	}
	@Test(priority = 7)
	public void Desktopbtn(){
		
		ob.clickondesktopbtn();
	}
	
   

}

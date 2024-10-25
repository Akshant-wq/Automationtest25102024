package testingbaba_test;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Text_page;

public class Text_test extends  Baselibrary {
	
	Text_page ak;
	@BeforeTest
	public void getLaunchurl_testingbaba() {
		
		getlaunchurl("https://testingbaba.com/old/");
	
		}
	@Test(priority = 0)
	public void Closebtn() {
		
		ak=new Text_page();
		ak.clickonClosebtn();
	}
	@Test(priority = 1)
	public void Practice() {
		
		ak.clickonpractice();
	}
	@Test(priority = 2)
	public void Elements()  {
	
		ak.clickonelements();
	}
	
	@Test(priority = 3)
	
	public void Text_box() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 ak.clickontextbox();
	}
	
   @Test(priority = 4)
	
	public void Full_name() {
		 ak.clickonfull_name();
	}
}

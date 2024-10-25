package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Date_page;
import testingbaba_pages.login1;

public class date_test  extends Baselibrary{
	
	login1 log;
	Date_page da;
	
	@BeforeTest
	public void getlaunchurl() {
		
		getlaunchurl("https://testingbaba.com/old");
		
		log = new login1();
		da = new Date_page();
		
	}
	
	@Test(priority = 0)
	public void closebtn() {
		
		log.clickonClosebtn2();	
	}
	
	@Test(priority = 1)
	public void practicebtn() {
	 
		log.clickonpractice2();
	}
	
	@Test(priority = 2)
	public void widgwtsbtn() {
		
		da.clickonwidgwtsbtn();
		
	}
	
	@Test(priority = 3)
	public void pickbtn() {
		
		da.clickondatepickbtn();
		
	}
	
	@Test(priority = 4)
	public void datein() {
		
		da.datesend();
		
	}
	
	
	

}

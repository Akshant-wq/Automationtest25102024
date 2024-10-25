package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Alert_page;
import testingbaba_pages.login1;

public class Alert_test extends Baselibrary {
	
	login1 ak;
	Alert_page Al;
		
		@BeforeTest
		public void getLaunchurl_testingbaba() {
			
			getlaunchurl("https://testingbaba.com/old/");
			ak= new login1();
			Al= new Alert_page();
			
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
		public void Alert() {
			
			Al.clickonAlertbtn();
			
	}
		
		@Test(priority = 3)
		public void alertbtn() {
			
			Al.clickonAlertclick();
			
	}
		@Test(priority = 4)
		public void alertbtn1() {
			
			Al.clickonfirstbtn();
			
	}
		@Test(priority = 5)
		public void alertbtn4() throws InterruptedException{
			
			Al.clickonsecondbtn();}
		
		@Test(priority = 6)
		public void alertbtn2() {
			
			Al.clickonthirdbtn();
			
	}
		@Test(priority = 7)
		public void alertbtn3()  {
			
			Al.clickonforthbtn();
			
	}

}

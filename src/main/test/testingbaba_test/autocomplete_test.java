package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.AutoComplete_page;
import testingbaba_pages.login1;

public class autocomplete_test extends Baselibrary{
	login1 login;
	AutoComplete_page auto;
	
	       @BeforeTest
           public void getlaunchurl() {
        	   
        	   getlaunchurl("https://testingbaba.com/old");
        	   
        	   login = new login1();
        	   auto = new AutoComplete_page();
		}	
           @Test(priority = 0)
           public void closebtn() {
        	   
        	   login.clickonClosebtn2();
           }
           @Test(priority = 1)
           public void precticebtn() {
        	   
        	   login.clickonpractice2();
           }
           @Test(priority = 2)
           public void windsbtn() {
        	   
        	   auto.clickonwidgwtsbtn();
           }
           @Test(priority = 3)
           public void autocompletbtn() {
        	   
        	   auto.clickonautocompletebtn();
           }
           
           @Test(priority = 4)
            public void sendinput() {
        	 auto.clickonselectbtn();
           }
           
           @Test(priority = 5)
           public void indiabtn() {
       	 auto.clickonIndiabtn();
          }
}

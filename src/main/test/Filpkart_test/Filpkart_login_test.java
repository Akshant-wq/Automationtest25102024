package Filpkart_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Flipkart_page.Flipkart_loginpage;
import baselibrary.Baselibrary;

public class Filpkart_login_test extends Baselibrary{
	
	Flipkart_loginpage flip;
	
	@BeforeTest
	public void get_url() {
		getlaunchurl("https://www.flipkart.com/");
		
		flip = new Flipkart_loginpage();
		
	}
	@Test(priority = 0)
	public void Flipkart() {
		
		flip.get_tital();
	}
	
	@Test(priority = 1)
	public void Login_click() {
		flip.loginbtn();
	}
	@Test(priority = 2)
	public void Entermobile_no() {
		flip.Enter_mobileno();
	}
	
	@Test(priority = 3)
	public void otpbtn_click() {
		flip.opt_btn();
	}
}

package Guru_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Guru99_page.login_page;
import baselibrary.Baselibrary;

public class login_test extends Baselibrary{

	login_page guru;
	String path="C:\\Users\\Dell\\eclipse-workspace\\Automation_testing\\testdata\\datasheetguru.xlsx";
	@BeforeTest
	public void getlaunch_url() {
		getlaunchurl("http://www.demo.guru99.com/V4/");
	}
	@Test(priority = 0)
	public void title() {
		guru=new login_page();
		guru.getTitle_guru99();
	}
	
	@Test(priority = 1)
	public void userid() {
		for(int i=1;i<=4;i++) {
		
			guru.Input(exceldata(path,0,i,0));}
	}
	
	@Test(priority = 2)
	public void enterpassword() {
		for(int i=1;i<=4;i++) {
			
		guru.Password(exceldata(path,0,i,1));}
	}
	
	/*@Test(priority = 3)
	public void submitbtn() {
		guru.Button();
	}*/
}

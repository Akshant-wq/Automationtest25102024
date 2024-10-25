package Filpkart_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Flipkart_page.Cricbuzzpage;
import baselibrary.Baselibrary;

public class Cricbuzz_test extends  Baselibrary {

	Cricbuzzpage cric;
	
	@BeforeTest
	public void get_launchurlCricb() {
		
		getlaunchurl("https://www.cricbuzz.com/");
		
		cric = new Cricbuzzpage();
	}
	
	@Test(priority = 0)
	public void btn() {
		cric.sbtn();
		
	}
	@Test(priority = 1)
	public void clickonMatch() {
		cric.clickMatch();
		
	}
}

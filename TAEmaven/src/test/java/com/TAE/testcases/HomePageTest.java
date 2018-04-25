package com.TAE.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TAE.base.TestBase;
import com.TAE.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepage; 
	
	@BeforeMethod
	public void setup() {
		
		homepage = new HomePage();
		TestBase.initializeBrowser();
	}
	
	@Test
	public void validateHomePageTitle() {
		
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Jupiter Toys");
	}
	

}

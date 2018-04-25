package com.TAE.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TAE.base.TestBase;

public class HomePage extends TestBase{
	
	//pageFactory
	@FindBy(className="btn btn-success btn-large")
	WebElement startShoppingTab;
	
	//Initialise page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
public String validateHomePageTitle() {
	return driver.getTitle();
}
}

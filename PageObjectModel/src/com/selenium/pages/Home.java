package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public WebDriver driver = null;
	
	@FindBy(name="findFlights")
	private WebElement continueBtn;
	
	public boolean verifycontinueBtn()
	
	{
		boolean result = continueBtn.isDisplayed();
		
		
		return result;
	}
	public Home (WebDriver driver)
	{
		
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	
	

}

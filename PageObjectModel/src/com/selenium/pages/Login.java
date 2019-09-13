package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver = null;
	
	@FindBy (name="userName")
	private WebElement username;
	
	@FindBy (name="password")
	private WebElement password;
	
	@FindBy (name="login")
	private WebElement signIn;
	
	
	public void setUsername (String usernameData)
	{
		username.sendKeys(usernameData);
		
		
	}
	
	public boolean chkifUsernameboxexists ()
	{
		return username.isDisplayed();
		
		
	}
	
	public void setPassword (String passwordData)
	{
		
		password.sendKeys(passwordData);
	}

	
	public Home clickSignInBtn()
	{
		signIn.click();
		
		Home h = new Home(driver);
		return h;
	}
	
	//constructor
	public Login (WebDriver driver)
	{
		
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
}

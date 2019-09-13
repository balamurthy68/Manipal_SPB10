package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.pages.Login;

import junit.framework.Assert;

public class sanity_Login {
  @Test (groups= {"Regression"})
  public void chkIfControlspresent() {
		String exePath = "d://seleniu/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
		Login l = new Login(driver);
		
		//System.out.println(l.chkifUsernameboxexists());
	    Assert.assertEquals(true, l.chkifUsernameboxexists());
	  
	  
  }
  @Test (groups= {"Regression"})
  public void learningpriorityinTestng() {
		System.out.println("Test");
	    Assert.assertEquals("Hello", "Hello");
	  
  }
}

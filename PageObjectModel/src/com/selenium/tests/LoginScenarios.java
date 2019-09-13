package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.pages.Home;
import com.selenium.pages.Login;


public class LoginScenarios {

	@DataProvider(name = "Authentication")

	public static Object[][] credentials() {

	  return new Object[][] { { "mercury", "mercury" }, { "datapro_2", "Test@123" }};

	}

	@Test(dataProvider="Authentication", groups= {"Smoke"})
	
	public void login_26Feb(String sUsername, String sPassword) throws InterruptedException
	{
		
		String exePath = "d://seleniu/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
		
		Login l = new Login(driver);
		
		l.setUsername(sUsername);
		l.setPassword(sPassword);
		Thread.sleep(2000);

	
		Home hp = l.clickSignInBtn();
		boolean result = hp.verifycontinueBtn();
		
	
		Assert.assertTrue (result,"true");
		System.out.println("Scenario pass and and button  " + result);
		driver.close();
		
	  }	


}

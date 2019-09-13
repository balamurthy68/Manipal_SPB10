package com.selenium.tests;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener  implements ITestListener{

	private static final boolean True = false;

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	     Assert.assertTrue(True);
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Starting the test");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult myResults) {
		// TODO Auto-generated method stub
		
		myResults.setStatus(1);
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

}

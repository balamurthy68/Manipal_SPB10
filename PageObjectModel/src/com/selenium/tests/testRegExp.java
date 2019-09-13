package com.selenium.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testRegExp {
	private static final boolean match=true;
	@Test(groups= {"Regression"})
	public void testRegExpFn()
	{
	String exampleString = "Aug 25, 2019";
	Pattern p = Pattern.compile("[A-Z,a-z]{3} [0-9]{2}, [0-9]{4}");
	
	System.out.println("Testing frm regexp");
	Matcher m = p.matcher(exampleString);
    
    boolean b = m.matches();
    
    System.out.println(b);       
    
    Assert.assertEquals(m.matches(),match);
    
    
    //return m.matches();
  }
}
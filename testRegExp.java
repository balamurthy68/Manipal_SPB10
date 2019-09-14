package code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;
@Test
public class testRegExp {

	public boolean testRegExpFn()
	{
	String exampleString = "Aug 25, 2019";
	Pattern p = Pattern.compile("[A-Z,a-z]{3} [0-9]{2}, [0-9]{4}");
	
	
	Matcher m = p.matcher(exampleString);
    
    boolean b = m.matches();
    
    System.out.println(b);       
    
    return m.matches();
  }
}
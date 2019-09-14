package code;
import java.util.regex.*;
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
*/


public class regExpExample  {
    public static void main(String[] args) {
        /*
    	System.setProperty ("webdriver.chrome.driver","D://seleniu//chromedriver.exe" );
		
    	WebDriver driver = new ChromeDriver();
        // And now use this to visit Google
        driver.get("file:///D:/Bala%20laptop/RPS/Examples/sample.html");
        
        String timeString = driver.findElement(By.id("txt")).getText();     
        
        System.out.println(timeString); 
        
        Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        Matcher m = p.matcher(timeString);
    */    
    	//String exampleString = "Harrybpotterabcd";
    	//Pattern p = Pattern.compile(".*potter.*");
        //String begins with H
    //	Pattern p = Pattern.compile("^H.*");
    	
    	//Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        ////*[@id="ct"]
    	//hh:mm:ss
    	//Aug 22, 2019
    	
    	//String exampleString = "04:30:45";
    	String exampleString = "Aug 25, 2019";
    	Pattern p = Pattern.compile("[A-Z,a-z]{3} [0-9]{2}, [0-9]{4}");
    	
    	
    	Matcher m = p.matcher(exampleString);
        
        boolean b = m.matches();
        
        System.out.println(b);       
        
        //Close the browser
      //  driver.quit();
    }
}
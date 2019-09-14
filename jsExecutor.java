package code;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "d://seleniu//chromedriver.exe");
        driver = new ChromeDriver();

		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		JavascriptExecutor j = (JavascriptExecutor) driver;
	
		//j.executeScript("window.scrollBy(0,1000)");
		//j.executeScript("document.getElementById('gbqfb').click();");
    
		//j.executeScript("window.alert('Hello JS Executing!')", args);
	
	  //Do a browser sleep using Asynchronous executor
      
      long start = System.currentTimeMillis();
      j.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1])", 500);
      
      System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));
      
      
      
      
	
	}
}

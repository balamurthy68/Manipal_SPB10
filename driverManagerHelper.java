package code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManagerHelper {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	   public driverManagerHelper()
	   {
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com");
		WebDriverManager.firefoxdriver().arch32().setup();
		WebDriver fdriver = new FirefoxDriver();
	     
		
	   
	   
	   }

}

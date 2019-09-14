package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameExample {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//file:///D:/wrapper.html
		String exePath = "d://seleniu/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		
		WebElement txt_email,lnk_logout;
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open the browser with the url
		driver.get("file:///D:/wrapper.html");
		
		////input[@id='username']
		driver.switchTo().frame("s2");
		WebElement un = driver.findElement(By.xpath("//*[@id='username']"));
		un.sendKeys("Hello!");
		//driver.switchTo().frame("second");
		
		
		
		
		
		
	}

}

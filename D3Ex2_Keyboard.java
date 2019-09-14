package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D3Ex2_Keyboard {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "d://seleniu/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebElement txt_email,lnk_logout;
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open the browser with the url
		driver.get("http://examples.codecharge.com/registrationform/registration.php");
	
		WebElement txt_Login = driver.findElement(By.name("user_login"));
		txt_Login.sendKeys("Bala");
		txt_Login.sendKeys(Keys.CONTROL+"a");
		txt_Login.sendKeys(Keys.CONTROL+"x");
	
	//	txt_Login.sendKeys(Keys.SHIFT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
		
		
		WebElement txt_firstname = driver.findElement(By.name("first_name"));
		txt_firstname.sendKeys(Keys.CONTROL+"v");
		
	
	}

}

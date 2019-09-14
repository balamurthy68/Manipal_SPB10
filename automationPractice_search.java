package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPractice_search {
	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			System.out.println("Automationpractice");
		
			String exePath = "d://seleniu/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://automationpractice.com");
			
			WebElement lnkSignin;
			lnkSignin = driver.findElement(By.linkText("Sign in"));
			lnkSignin.click();
			WebElement txtEmail;
			txtEmail = driver.findElement(By.id("email"));
			txtEmail.sendKeys("bala.murthy@gmail.com");
			WebElement txtPassword;
			txtPassword = driver.findElement(By.id("passwd"));
			txtPassword.sendKeys("Test@123");
			
			
			WebElement btnSignin;
			btnSignin = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
			btnSignin.click();
			
		}
}

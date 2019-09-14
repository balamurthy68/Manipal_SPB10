package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webshop_login {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
		String exePath = "d://seleniu/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		
		WebElement txt_email,lnk_logout;
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open the browser with the url
		driver.get("http://demowebshop.tricentis.com");
		
		String title;
		title = driver.getTitle();
		
		driver.findElement(By.linkText("Log in")).click();
		
	    driver.findElement(By.id("Email")).sendKeys("bala.murthy@gmail.com");
	    
	    driver.findElement(By.id("Password")).sendKeys("abcdef");
	    
	    //log in button click
	    //driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    String s = driver.findElement(By.cssSelector("input.login-button")).getAttribute("value");
	    
	    driver.findElement(By.cssSelector("input.login-button")).click();
	    
	    System.out.println("The value property of the login button has the following value:" + s);
	    
	    //lnk_logout=driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    
	    //Validation part to check if login is successful or not
	    
	    try {
	    
	    	 lnk_logout=driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    	 
	    	 //System.out.println(lnk_logout.getText());
	    
	    	 if (lnk_logout.getText().contains("Log in"))
	    	 {
	    		System.out.println("Login failed"); 
	    		
	    	 }
	    	 else 
	    	 {
	    		 System.out.println("Login Successful"); 
		    		 
	    	 }
	    
	    	 
	    	 
	     } catch (Exception e)
	    {
	    	 System.out.println(e.getMessage());
	    }
	    
	    //driver.quit();
	} 

}

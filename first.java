package code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class first {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello batch 3");
	
		/*
		String exePath = "d://seleniu/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
	
		WebElement un,pw,btnlogin,signofflink;
		un = driver.findElement(By.name("userName"));
		un.sendKeys("mercury");
		pw = driver.findElement(By.name("password"));
		pw.sendKeys("mercury");
		btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		Thread.sleep(1000);
		
		signofflink = driver.findElement(By.linkText("SIGN-OFF"));
		if (signofflink ==  null)
		{
			System.out.println("Login unsuccessful");
		}
		else
		{
			System.out.println("Successful login");
		}
		*/
		String exePath = "d://seleniu/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		
		WebElement txt_un,txt_pw,btn_signin,radio_tripType,dt_time;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
		//IMPLICIT WAIT 
		txt_un = driver.findElement(By.name("userName"));
		txt_un.sendKeys("mercury");
		txt_pw = driver.findElement(By.name("password"));
		txt_pw.sendKeys("mercury");
		btn_signin = driver.findElement(By.name("login"));
		
		dt_time=driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
		System.out.println(dt_time.getText());
		
		btn_signin.click();
		
		radio_tripType = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		radio_tripType.click();
		
		System.out.println("Trip type is selected:" + radio_tripType.isSelected());
		WebElement drp_fromPort;
		drp_fromPort = driver.findElement(By.name("fromPort"));
		Select sel_fromPort = new Select(drp_fromPort);
		sel_fromPort.selectByVisibleText("London");
	 	
		List<WebElement> l = sel_fromPort.getOptions();
		l.size();
		System.out.println(l.size());
		
	} 

}
